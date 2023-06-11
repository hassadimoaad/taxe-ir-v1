import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {EmployeService} from 'src/app/controller/service/Employe.service';
import {EmployeDto} from 'src/app/controller/model/Employe.model';
import {EmployeCriteria} from 'src/app/controller/criteria/EmployeCriteria.model';

@Component({
  selector: 'app-employe-view-admin',
  templateUrl: './employe-view-admin.component.html'
})
export class EmployeViewAdminComponent extends AbstractViewController<EmployeDto, EmployeCriteria, EmployeService> implements OnInit {


    constructor(private employeService: EmployeService){
        super(employeService);
    }

    ngOnInit(): void {
    }




}
