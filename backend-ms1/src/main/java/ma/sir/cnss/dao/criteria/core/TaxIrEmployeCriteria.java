package  ma.sir.cnss.dao.criteria.core;


import ma.sir.cnss.zynerator.criteria.BaseCriteria;
import java.util.List;

public class TaxIrEmployeCriteria extends  BaseCriteria  {

    private String salaireNet;
    private String salaireNetMin;
    private String salaireNetMax;
    private String salaireBrut;
    private String salaireBrutMin;
    private String salaireBrutMax;

    private EmployeCriteria employe ;
    private List<EmployeCriteria> employes ;
    private TauxIrCriteria tauxIr ;
    private List<TauxIrCriteria> tauxIrs ;
    private TaxIrCriteria taxIr ;
    private List<TaxIrCriteria> taxIrs ;


    public TaxIrEmployeCriteria(){}

    public String getSalaireNet(){
        return this.salaireNet;
    }
    public void setSalaireNet(String salaireNet){
        this.salaireNet = salaireNet;
    }   
    public String getSalaireNetMin(){
        return this.salaireNetMin;
    }
    public void setSalaireNetMin(String salaireNetMin){
        this.salaireNetMin = salaireNetMin;
    }
    public String getSalaireNetMax(){
        return this.salaireNetMax;
    }
    public void setSalaireNetMax(String salaireNetMax){
        this.salaireNetMax = salaireNetMax;
    }
      
    public String getSalaireBrut(){
        return this.salaireBrut;
    }
    public void setSalaireBrut(String salaireBrut){
        this.salaireBrut = salaireBrut;
    }   
    public String getSalaireBrutMin(){
        return this.salaireBrutMin;
    }
    public void setSalaireBrutMin(String salaireBrutMin){
        this.salaireBrutMin = salaireBrutMin;
    }
    public String getSalaireBrutMax(){
        return this.salaireBrutMax;
    }
    public void setSalaireBrutMax(String salaireBrutMax){
        this.salaireBrutMax = salaireBrutMax;
    }
      

    public EmployeCriteria getEmploye(){
        return this.employe;
    }

    public void setEmploye(EmployeCriteria employe){
        this.employe = employe;
    }
    public List<EmployeCriteria> getEmployes(){
        return this.employes;
    }

    public void setEmployes(List<EmployeCriteria> employes){
        this.employes = employes;
    }
    public TauxIrCriteria getTauxIr(){
        return this.tauxIr;
    }

    public void setTauxIr(TauxIrCriteria tauxIr){
        this.tauxIr = tauxIr;
    }
    public List<TauxIrCriteria> getTauxIrs(){
        return this.tauxIrs;
    }

    public void setTauxIrs(List<TauxIrCriteria> tauxIrs){
        this.tauxIrs = tauxIrs;
    }
    public TaxIrCriteria getTaxIr(){
        return this.taxIr;
    }

    public void setTaxIr(TaxIrCriteria taxIr){
        this.taxIr = taxIr;
    }
    public List<TaxIrCriteria> getTaxIrs(){
        return this.taxIrs;
    }

    public void setTaxIrs(List<TaxIrCriteria> taxIrs){
        this.taxIrs = taxIrs;
    }
}
