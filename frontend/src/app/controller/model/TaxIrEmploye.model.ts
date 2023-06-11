import {TauxIrDto} from './TauxIr.model';
import {EmployeDto} from './Employe.model';
import {TaxIrDto} from './TaxIr.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class TaxIrEmployeDto  extends BaseDto{

    public id: number;
    public salaireNet: number;
    public salaireBrut: number;
    public salaireNetMax: string ;
    public salaireNetMin: string ;
    public salaireBrutMax: string ;
    public salaireBrutMin: string ;
    public employe: EmployeDto ;
    public tauxIr: TauxIrDto ;
    public taxIr: TaxIrDto ;

}
