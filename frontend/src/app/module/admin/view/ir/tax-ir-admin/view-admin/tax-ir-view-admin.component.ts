import {Component, OnInit} from '@angular/core';


import {AbstractViewController} from 'src/app/zynerator/controller/AbstractViewController';
import { environment } from 'src/environments/environment';

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
  selector: 'app-tax-ir-view-admin',
  templateUrl: './tax-ir-view-admin.component.html'
})
export class TaxIrViewAdminComponent extends AbstractViewController<TaxIrDto, TaxIrCriteria, TaxIrService> implements OnInit {

    taxeIrEmployes = new TaxIrEmployeDto();
    taxeIrEmployess: Array<TaxIrEmployeDto> = [];

    constructor(private taxIrService: TaxIrService, private taxIrEmployeService: TaxIrEmployeService, private employeService: EmployeService, private tauxIrService: TauxIrService, private societeService: SocieteService){
        super(taxIrService);
    }

    ngOnInit(): void {
        this.taxeIrEmployes.employe = new EmployeDto();
        this.employeService.findAll().subscribe((data) => this.employes = data);
        this.taxeIrEmployes.tauxIr = new TauxIrDto();
        this.tauxIrService.findAll().subscribe((data) => this.tauxIrs = data);
        this.societe = new SocieteDto();
        this.societeService.findAll().subscribe((data) => this.societes = data);
    }


    get societe(): SocieteDto {
       return this.societeService.item;
    }
    set societe(value: SocieteDto) {
        this.societeService.item = value;
    }
    get societes():Array<SocieteDto> {
       return this.societeService.items;
    }
    set societes(value: Array<SocieteDto>) {
        this.societeService.items = value;
    }
    get tauxIr(): TauxIrDto {
       return this.tauxIrService.item;
    }
    set tauxIr(value: TauxIrDto) {
        this.tauxIrService.item = value;
    }
    get tauxIrs():Array<TauxIrDto> {
       return this.tauxIrService.items;
    }
    set tauxIrs(value: Array<TauxIrDto>) {
        this.tauxIrService.items = value;
    }
    get employe(): EmployeDto {
       return this.employeService.item;
    }
    set employe(value: EmployeDto) {
        this.employeService.item = value;
    }
    get employes():Array<EmployeDto> {
       return this.employeService.items;
    }
    set employes(value: Array<EmployeDto>) {
        this.employeService.items = value;
    }


}
