import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';

import * as moment from 'moment';

import { RoleService } from 'src/app/zynerator/security/Role.service';
import {environment} from 'src/environments/environment';
import {PaginatedList} from 'src/app/zynerator/dto/PaginatedList.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';

import {TaxIrEmployeDto} from '../model/TaxIrEmploye.model';
import {TaxIrEmployeCriteria} from '../criteria/TaxIrEmployeCriteria.model';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';

import {TauxIrDto} from '../model/TauxIr.model';
import {EmployeDto} from '../model/Employe.model';
import {TaxIrDto} from '../model/TaxIr.model';

@Injectable({
  providedIn: 'root'
})
export class TaxIrEmployeService extends AbstractService<TaxIrEmployeDto, TaxIrEmployeCriteria> {
     constructor(private http: HttpClient, private roleService: RoleService) {
        super();
        this.setHttp(http);
        this.setApi(environment.apiUrl + 'admin/taxIrEmploye/');
    }

    public constrcutDto(): TaxIrEmployeDto {
        return new TaxIrEmployeDto();
    }

    public constrcutCriteria(): TaxIrEmployeCriteria {
        return new TaxIrEmployeCriteria();
    }
}
