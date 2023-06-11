import {Component, OnInit, Input} from '@angular/core';


import {AbstractEditController} from 'src/app/zynerator/controller/AbstractEditController';

import {TauxIrService} from 'src/app/controller/service/TauxIr.service';
import {TauxIrDto} from 'src/app/controller/model/TauxIr.model';
import {TauxIrCriteria} from 'src/app/controller/criteria/TauxIrCriteria.model';



@Component({
  selector: 'app-taux-ir-edit-admin',
  templateUrl: './taux-ir-edit-admin.component.html'
})
export class TauxIrEditAdminComponent extends AbstractEditController<TauxIrDto, TauxIrCriteria, TauxIrService>   implements OnInit {






    constructor( private tauxIrService: TauxIrService ) {
        super(tauxIrService);
    }

    ngOnInit(): void {
}


    public setValidation(value : boolean){
        }
    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }







}
