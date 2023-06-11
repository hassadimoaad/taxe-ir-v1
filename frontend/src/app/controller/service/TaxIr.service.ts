import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {TaxIrDto} from '../model/TaxIr.model';
import {TaxIrCriteria} from '../criteria/TaxIrCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {SocieteDto} from '../model/Societe.model';
import {TaxIrEmployeDto} from '../model/TaxIrEmploye.model';

@Injectable({
  providedIn: 'root'
})
export class TaxIrService extends AbstractService<TaxIrDto, TaxIrCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/taxIr/');
    }

    public constrcutDto(): TaxIrDto {
        return new TaxIrDto();
    }

    public constrcutCriteria(): TaxIrCriteria {
        return new TaxIrCriteria();
    }
}
