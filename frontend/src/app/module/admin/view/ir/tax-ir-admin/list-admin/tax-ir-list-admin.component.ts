import {Component, OnInit} from '@angular/core';
import {TaxIrService} from 'src/app/controller/service/TaxIr.service';
import {TaxIrDto} from 'src/app/controller/model/TaxIr.model';
import {TaxIrCriteria} from 'src/app/controller/criteria/TaxIrCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { SocieteService } from 'src/app/controller/service/Societe.service';

import {SocieteDto} from 'src/app/controller/model/Societe.model';
import {TaxIrEmployeDto} from 'src/app/controller/model/TaxIrEmploye.model';


@Component({
  selector: 'app-tax-ir-list-admin',
  templateUrl: './tax-ir-list-admin.component.html'
})
export class TaxIrListAdminComponent extends AbstractListController<TaxIrDto, TaxIrCriteria, TaxIrService>  implements OnInit {

    fileName = 'TaxIr';

    societes :Array<SocieteDto>;
  
    constructor(taxIrService: TaxIrService, private societeService: SocieteService) {
        super(taxIrService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadSociete();
    }

    public async loadTaxIrs(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('TaxIr', 'list');
        isPermistted ? this.service.findAll().subscribe(taxIrs => this.items = taxIrs,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'anne', header: 'Anne'},
            {field: 'mois', header: 'Mois'},
            {field: 'societe?.ice', header: 'Societe'},
            {field: 'montantBaseTotal', header: 'Montant base total'},
            {field: 'montantRetardTotal', header: 'Montant retard total'},
            {field: 'salaireTotale', header: 'Salaire totale'},
            {field: 'cotisationTotal', header: 'Cotisation total'},
        ];
    }


    public async loadSociete(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('TaxIr', 'list');
        isPermistted ? this.societeService.findAllOptimized().subscribe(societes => this.societes = societes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: TaxIrDto) {
        if (res.taxeIrEmployes != null) {
             res.taxeIrEmployes.forEach(d => { d.taxIr = null; d.id = null; });
        }
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Anne': e.anne ,
                 'Mois': e.mois ,
                'Societe': e.societe?.ice ,
                 'Montant base total': e.montantBaseTotal ,
                 'Montant retard total': e.montantRetardTotal ,
                 'Salaire totale': e.salaireTotale ,
                 'Cotisation total': e.cotisationTotal ,
            }
        });

        this.criteriaData = [{
            'Anne Min': this.criteria.anneMin ? this.criteria.anneMin : environment.emptyForExport ,
            'Anne Max': this.criteria.anneMax ? this.criteria.anneMax : environment.emptyForExport ,
            'Mois Min': this.criteria.moisMin ? this.criteria.moisMin : environment.emptyForExport ,
            'Mois Max': this.criteria.moisMax ? this.criteria.moisMax : environment.emptyForExport ,
        //'Societe': this.criteria.societe?.ice ? this.criteria.societe?.ice : environment.emptyForExport ,
            'Montant base total Min': this.criteria.montantBaseTotalMin ? this.criteria.montantBaseTotalMin : environment.emptyForExport ,
            'Montant base total Max': this.criteria.montantBaseTotalMax ? this.criteria.montantBaseTotalMax : environment.emptyForExport ,
            'Montant retard total Min': this.criteria.montantRetardTotalMin ? this.criteria.montantRetardTotalMin : environment.emptyForExport ,
            'Montant retard total Max': this.criteria.montantRetardTotalMax ? this.criteria.montantRetardTotalMax : environment.emptyForExport ,
            'Salaire totale Min': this.criteria.salaireTotaleMin ? this.criteria.salaireTotaleMin : environment.emptyForExport ,
            'Salaire totale Max': this.criteria.salaireTotaleMax ? this.criteria.salaireTotaleMax : environment.emptyForExport ,
            'Cotisation total Min': this.criteria.cotisationTotalMin ? this.criteria.cotisationTotalMin : environment.emptyForExport ,
            'Cotisation total Max': this.criteria.cotisationTotalMax ? this.criteria.cotisationTotalMax : environment.emptyForExport ,
        }];
      }
}
