import {Component, OnInit} from '@angular/core';
import {SocieteService} from 'src/app/controller/service/Societe.service';
import {SocieteDto} from 'src/app/controller/model/Societe.model';
import {SocieteCriteria} from 'src/app/controller/criteria/SocieteCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-societe-list-admin',
  templateUrl: './societe-list-admin.component.html'
})
export class SocieteListAdminComponent extends AbstractListController<SocieteDto, SocieteCriteria, SocieteService>  implements OnInit {

    fileName = 'Societe';

     yesOrNoBloqued :any[] =[];
  
    constructor(societeService: SocieteService) {
        super(societeService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    this.yesOrNoBloqued =  [{label: 'Bloqued', value: null},{label: 'Oui', value: 1},{label: 'Non', value: 0}];
    }

    public async loadSocietes(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Societe', 'list');
        isPermistted ? this.service.findAll().subscribe(societes => this.items = societes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'ice', header: 'Ice'},
            {field: 'siege', header: 'Siege'},
            {field: 'bloqued', header: 'Bloqued'},
        ];
    }



	public initDuplicate(res: SocieteDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Ice': e.ice ,
                 'Siege': e.siege ,
                'Bloqued': e.bloqued? 'Vrai' : 'Faux' ,
            }
        });

        this.criteriaData = [{
            'Ice': this.criteria.ice ? this.criteria.ice : environment.emptyForExport ,
            'Siege': this.criteria.siege ? this.criteria.siege : environment.emptyForExport ,
            'Bloqued': this.criteria.bloqued ? (this.criteria.bloqued ? environment.trueValue : environment.falseValue) : environment.emptyForExport ,
        }];
      }
}
