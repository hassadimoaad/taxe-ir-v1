import {Component, OnInit} from '@angular/core';
import {TauxIrService} from 'src/app/controller/service/TauxIr.service';
import {TauxIrDto} from 'src/app/controller/model/TauxIr.model';
import {TauxIrCriteria} from 'src/app/controller/criteria/TauxIrCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-taux-ir-list-admin',
  templateUrl: './taux-ir-list-admin.component.html'
})
export class TauxIrListAdminComponent extends AbstractListController<TauxIrDto, TauxIrCriteria, TauxIrService>  implements OnInit {

    fileName = 'TauxIr';

  
    constructor(tauxIrService: TauxIrService) {
        super(tauxIrService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadTauxIrs(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('TauxIr', 'list');
        isPermistted ? this.service.findAll().subscribe(tauxIrs => this.items = tauxIrs,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'pourcentage', header: 'Pourcentage'},
            {field: 'salaireMax', header: 'Salaire max'},
            {field: 'salaireMin', header: 'Salaire min'},
        ];
    }



	public initDuplicate(res: TauxIrDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Pourcentage': e.pourcentage ,
                 'Salaire max': e.salaireMax ,
                 'Salaire min': e.salaireMin ,
            }
        });

        this.criteriaData = [{
            'Pourcentage Min': this.criteria.pourcentageMin ? this.criteria.pourcentageMin : environment.emptyForExport ,
            'Pourcentage Max': this.criteria.pourcentageMax ? this.criteria.pourcentageMax : environment.emptyForExport ,
            'Salaire max Min': this.criteria.salaireMaxMin ? this.criteria.salaireMaxMin : environment.emptyForExport ,
            'Salaire max Max': this.criteria.salaireMaxMax ? this.criteria.salaireMaxMax : environment.emptyForExport ,
            'Salaire min Min': this.criteria.salaireMinMin ? this.criteria.salaireMinMin : environment.emptyForExport ,
            'Salaire min Max': this.criteria.salaireMinMax ? this.criteria.salaireMinMax : environment.emptyForExport ,
        }];
      }
}
