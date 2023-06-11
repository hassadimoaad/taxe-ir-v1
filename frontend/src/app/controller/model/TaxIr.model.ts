import {SocieteDto} from './Societe.model';
import {TaxIrEmployeDto} from './TaxIrEmploye.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class TaxIrDto  extends BaseDto{

    public id: number;
   public anne: number;
   public mois: number;
    public montantBaseTotal: number;
    public montantRetardTotal: number;
    public salaireTotale: number;
    public cotisationTotal: number;
    public anneMax: string ;
    public anneMin: string ;
    public moisMax: string ;
    public moisMin: string ;
    public montantBaseTotalMax: string ;
    public montantBaseTotalMin: string ;
    public montantRetardTotalMax: string ;
    public montantRetardTotalMin: string ;
    public salaireTotaleMax: string ;
    public salaireTotaleMin: string ;
    public cotisationTotalMax: string ;
    public cotisationTotalMin: string ;
    public societe: SocieteDto ;
     public taxeIrEmployes: Array<TaxIrEmployeDto>;

}
