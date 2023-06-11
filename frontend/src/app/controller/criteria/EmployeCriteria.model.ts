import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class EmployeCriteria  extends   BaseCriteria  {

    public id: number;
    public cnss: string;
    public cnssLike: string;
    public nom: string;
    public nomLike: string;
    public prenom: string;
    public prenomLike: string;

}
