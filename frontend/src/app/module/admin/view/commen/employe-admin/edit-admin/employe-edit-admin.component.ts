import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {EmployeService} from 'src/app/controller/service/Employe.service';
import {EmployeDto} from 'src/app/controller/model/Employe.model';
import {EmployeCriteria} from 'src/app/controller/criteria/EmployeCriteria.model';



@Component({
  selector: 'app-employe-edit-admin',
  templateUrl: './employe-edit-admin.component.html'
})
export class EmployeEditAdminComponent extends AbstractEditController<EmployeDto, EmployeCriteria, EmployeService>   implements OnInit {


    private _validEmployeCnss = true;




    constructor( private employeService: EmployeService ) {
        super(employeService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        this.validEmployeCnss = value;
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
        this.validateEmployeCnss();
    }
    public validateEmployeCnss(){
        if (this.stringUtilService.isEmpty(this.item.cnss)) {
            this.errorMessages.push('Cnss non valide');
            this.validEmployeCnss = false;
        } else {
            this.validEmployeCnss = true;
        }
    }






    get validEmployeCnss(): boolean {
        return this._validEmployeCnss;
    }
    set validEmployeCnss(value: boolean) {
        this._validEmployeCnss = value;
    }

}
