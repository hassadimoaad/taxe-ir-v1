import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class TauxIrDto  extends BaseDto{

    public id: number;
   public pourcentage: number;
    public salaireMax: number;
    public salaireMin: number;
    public pourcentageMax: string ;
    public pourcentageMin: string ;
    public salaireMaxMax: string ;
    public salaireMaxMin: string ;
    public salaireMinMax: string ;
    public salaireMinMin: string ;

}
