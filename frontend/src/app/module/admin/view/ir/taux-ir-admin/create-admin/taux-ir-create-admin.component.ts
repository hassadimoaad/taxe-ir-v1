import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {TauxIrService} from 'src/app/controller/service/TauxIr.service';
import {TauxIrDto} from 'src/app/controller/model/TauxIr.model';
import {TauxIrCriteria} from 'src/app/controller/criteria/TauxIrCriteria.model';
@Component({
  selector: 'app-taux-ir-create-admin',
  templateUrl: './taux-ir-create-admin.component.html'
})
export class TauxIrCreateAdminComponent extends AbstractCreateController<TauxIrDto, TauxIrCriteria, TauxIrService>  implements OnInit {




    constructor( private tauxIrService: TauxIrService ) {
        super(tauxIrService);
    }

    ngOnInit(): void {
}





    public setValidation(value: boolean){
    }



    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }










}
