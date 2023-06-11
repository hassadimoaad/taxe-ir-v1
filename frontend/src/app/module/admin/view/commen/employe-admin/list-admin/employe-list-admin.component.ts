import {Component, OnInit} from '@angular/core';
import {EmployeService} from 'src/app/controller/service/Employe.service';
import {EmployeDto} from 'src/app/controller/model/Employe.model';
import {EmployeCriteria} from 'src/app/controller/criteria/EmployeCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';




@Component({
  selector: 'app-employe-list-admin',
  templateUrl: './employe-list-admin.component.html'
})
export class EmployeListAdminComponent extends AbstractListController<EmployeDto, EmployeCriteria, EmployeService>  implements OnInit {

    fileName = 'Employe';

  
    constructor(employeService: EmployeService) {
        super(employeService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
    }

    public async loadEmployes(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('Employe', 'list');
        isPermistted ? this.service.findAll().subscribe(employes => this.items = employes,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'cnss', header: 'Cnss'},
            {field: 'nom', header: 'Nom'},
            {field: 'prenom', header: 'Prenom'},
        ];
    }



	public initDuplicate(res: EmployeDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Cnss': e.cnss ,
                 'Nom': e.nom ,
                 'Prenom': e.prenom ,
            }
        });

        this.criteriaData = [{
            'Cnss': this.criteria.cnss ? this.criteria.cnss : environment.emptyForExport ,
            'Nom': this.criteria.nom ? this.criteria.nom : environment.emptyForExport ,
            'Prenom': this.criteria.prenom ? this.criteria.prenom : environment.emptyForExport ,
        }];
      }
}
