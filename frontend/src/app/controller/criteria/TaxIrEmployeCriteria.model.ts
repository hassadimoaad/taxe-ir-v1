import {TauxIrCriteria} from './TauxIrCriteria.model';
import {EmployeCriteria} from './EmployeCriteria.model';
import {TaxIrCriteria} from './TaxIrCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class TaxIrEmployeCriteria  extends   BaseCriteria  {

    public id: number;
     public salaireNet: number;
     public salaireNetMin: number;
     public salaireNetMax: number;
     public salaireBrut: number;
     public salaireBrutMin: number;
     public salaireBrutMax: number;
  public employe: EmployeCriteria ;
  public employes: Array<EmployeCriteria> ;
  public tauxIr: TauxIrCriteria ;
  public tauxIrs: Array<TauxIrCriteria> ;
  public taxIr: TaxIrCriteria ;
  public taxIrs: Array<TaxIrCriteria> ;

}
