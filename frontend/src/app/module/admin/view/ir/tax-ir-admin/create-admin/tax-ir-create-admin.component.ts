import {Component, OnInit, Input} from '@angular/core';

import { AbstractCreateController } from 'src/app/zynerator/controller/AbstractCreateController';

import {TaxIrService} from 'src/app/controller/service/TaxIr.service';
import {TaxIrDto} from 'src/app/controller/model/TaxIr.model';
import {TaxIrCriteria} from 'src/app/controller/criteria/TaxIrCriteria.model';
import {TaxIrEmployeDto} from 'src/app/controller/model/TaxIrEmploye.model';
import {TaxIrEmployeService} from 'src/app/controller/service/TaxIrEmploye.service';
import {EmployeDto} from 'src/app/controller/model/Employe.model';
import {EmployeService} from 'src/app/controller/service/Employe.service';
import {TauxIrDto} from 'src/app/controller/model/TauxIr.model';
import {TauxIrService} from 'src/app/controller/service/TauxIr.service';
import {SocieteDto} from 'src/app/controller/model/Societe.model';
import {SocieteService} from 'src/app/controller/service/Societe.service';
@Component({
  selector: 'app-tax-ir-create-admin',
  templateUrl: './tax-ir-create-admin.component.html'
})
export class TaxIrCreateAdminComponent extends AbstractCreateController<TaxIrDto, TaxIrCriteria, TaxIrService>  implements OnInit {

    private _taxeIrEmployesElement = new TaxIrEmployeDto();


    private _validSocieteIce = true;

    constructor( private taxIrService: TaxIrService , private taxIrEmployeService: TaxIrEmployeService, private employeService: EmployeService, private tauxIrService: TauxIrService, private societeService: SocieteService) {
        super(taxIrService);
    }

    ngOnInit(): void {
        this.taxeIrEmployesElement.employe = new EmployeDto();
        this.employeService.findAll().subscribe((data) => this.employes = data);
        this.taxeIrEmployesElement.tauxIr = new TauxIrDto();
        this.tauxIrService.findAll().subscribe((data) => this.tauxIrs = data);
    this.societe = new SocieteDto();
    this.societeService.findAll().subscribe((data) => this.societes = data);
}



    validateTaxeIrEmployes(){
        this.errorMessages = new Array();
    }


    public setValidation(value: boolean){
    }

    public addTaxeIrEmployes() {
        if( this.item.taxeIrEmployes == null )
            this.item.taxeIrEmployes = new Array<TaxIrEmployeDto>();
       this.validateTaxeIrEmployes();
       if (this.errorMessages.length === 0) {
              this.item.taxeIrEmployes.push({... this.taxeIrEmployesElement});
              this.taxeIrEmployesElement = new TaxIrEmployeDto();
       }else{
            this.messageService.add({severity: 'error',summary: 'Erreurs',detail: 'Merci de corrigé les erreurs suivant : ' + this.errorMessages});
       }
    }


    public deleteTaxIrEmploye(p: TaxIrEmployeDto) {
        this.item.taxeIrEmployes.forEach((element, index) => {
            if (element === p) { this.item.taxeIrEmployes.splice(index, 1); }
        });
    }

    public editTaxIrEmploye(p: TaxIrEmployeDto) {
        this.taxeIrEmployesElement = {... p};
        this.activeTab = 0;
    }


    public validateForm(): void{
        this.errorMessages = new Array<string>();
    }



    public async openCreateTauxIr(tauxIr: string) {
    const isPermistted = await this.roleService.isPermitted('TauxIr', 'add');
    if(isPermistted) {
         this.tauxIr = new TauxIrDto();
         this.createTauxIrDialog = true;
    }else{
        this.messageService.add({
        severity: 'error', summary: 'erreur', detail: 'problème de permission'
        });
     }
    }

    get societe(): SocieteDto {
        return this.societeService.item;
    }
    set societe(value: SocieteDto) {
        this.societeService.item = value;
    }
    get societes(): Array<SocieteDto> {
        return this.societeService.items;
    }
    set societes(value: Array<SocieteDto>) {
        this.societeService.items = value;
    }
    get createSocieteDialog(): boolean {
       return this.societeService.createDialog;
    }
    set createSocieteDialog(value: boolean) {
        this.societeService.createDialog= value;
    }
    get tauxIr(): TauxIrDto {
        return this.tauxIrService.item;
    }
    set tauxIr(value: TauxIrDto) {
        this.tauxIrService.item = value;
    }
    get tauxIrs(): Array<TauxIrDto> {
        return this.tauxIrService.items;
    }
    set tauxIrs(value: Array<TauxIrDto>) {
        this.tauxIrService.items = value;
    }
    get createTauxIrDialog(): boolean {
       return this.tauxIrService.createDialog;
    }
    set createTauxIrDialog(value: boolean) {
        this.tauxIrService.createDialog= value;
    }
    get employe(): EmployeDto {
        return this.employeService.item;
    }
    set employe(value: EmployeDto) {
        this.employeService.item = value;
    }
    get employes(): Array<EmployeDto> {
        return this.employeService.items;
    }
    set employes(value: Array<EmployeDto>) {
        this.employeService.items = value;
    }
    get createEmployeDialog(): boolean {
       return this.employeService.createDialog;
    }
    set createEmployeDialog(value: boolean) {
        this.employeService.createDialog= value;
    }




    get validSocieteIce(): boolean {
        return this._validSocieteIce;
    }
    set validSocieteIce(value: boolean) {
        this._validSocieteIce = value;
    }

    get taxeIrEmployesElement(): TaxIrEmployeDto {
        if( this._taxeIrEmployesElement == null )
            this._taxeIrEmployesElement = new TaxIrEmployeDto();
        return this._taxeIrEmployesElement;
    }

    set taxeIrEmployesElement(value: TaxIrEmployeDto) {
        this._taxeIrEmployesElement = value;
    }

}
