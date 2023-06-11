import {SocieteCriteria} from './SocieteCriteria.model';
import {TaxIrEmployeCriteria} from './TaxIrEmployeCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class TaxIrCriteria  extends   BaseCriteria  {

    public id: number;
     public anne: number;
     public anneMin: number;
     public anneMax: number;
     public mois: number;
     public moisMin: number;
     public moisMax: number;
     public montantBaseTotal: number;
     public montantBaseTotalMin: number;
     public montantBaseTotalMax: number;
     public montantRetardTotal: number;
     public montantRetardTotalMin: number;
     public montantRetardTotalMax: number;
     public salaireTotale: number;
     public salaireTotaleMin: number;
     public salaireTotaleMax: number;
     public cotisationTotal: number;
     public cotisationTotalMin: number;
     public cotisationTotalMax: number;
  public societe: SocieteCriteria ;
  public societes: Array<SocieteCriteria> ;
      public taxeIrEmployes: Array<TaxIrEmployeCriteria>;

}
