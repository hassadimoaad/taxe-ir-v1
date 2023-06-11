import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

import {TauxIrService} from 'src/app/controller/service/TauxIr.service';
import {TauxIrDto} from 'src/app/controller/model/TauxIr.model';
import {TauxIrCriteria} from 'src/app/controller/criteria/TauxIrCriteria.model';

@Component({
  selector: 'app-taux-ir-view-admin',
  templateUrl: './taux-ir-view-admin.component.html'
})
export class TauxIrViewAdminComponent extends AbstractViewController<TauxIrDto, TauxIrCriteria, TauxIrService> implements OnInit {


    constructor(private tauxIrService: TauxIrService){
        super(tauxIrService);
    }

    ngOnInit(): void {
    }




}
