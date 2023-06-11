package  ma.sir.cnss.dao.criteria.core;


import ma.sir.cnss.zynerator.criteria.BaseCriteria;
import java.util.List;

public class TauxIrCriteria extends  BaseCriteria  {

    private String pourcentage;
    private String pourcentageMin;
    private String pourcentageMax;
    private String salaireMax;
    private String salaireMaxMin;
    private String salaireMaxMax;
    private String salaireMin;
    private String salaireMinMin;
    private String salaireMinMax;



    public TauxIrCriteria(){}

    public String getPourcentage(){
        return this.pourcentage;
    }
    public void setPourcentage(String pourcentage){
        this.pourcentage = pourcentage;
    }   
    public String getPourcentageMin(){
        return this.pourcentageMin;
    }
    public void setPourcentageMin(String pourcentageMin){
        this.pourcentageMin = pourcentageMin;
    }
    public String getPourcentageMax(){
        return this.pourcentageMax;
    }
    public void setPourcentageMax(String pourcentageMax){
        this.pourcentageMax = pourcentageMax;
    }
      
    public String getSalaireMax(){
        return this.salaireMax;
    }
    public void setSalaireMax(String salaireMax){
        this.salaireMax = salaireMax;
    }   
    public String getSalaireMaxMin(){
        return this.salaireMaxMin;
    }
    public void setSalaireMaxMin(String salaireMaxMin){
        this.salaireMaxMin = salaireMaxMin;
    }
    public String getSalaireMaxMax(){
        return this.salaireMaxMax;
    }
    public void setSalaireMaxMax(String salaireMaxMax){
        this.salaireMaxMax = salaireMaxMax;
    }
      
    public String getSalaireMin(){
        return this.salaireMin;
    }
    public void setSalaireMin(String salaireMin){
        this.salaireMin = salaireMin;
    }   
    public String getSalaireMinMin(){
        return this.salaireMinMin;
    }
    public void setSalaireMinMin(String salaireMinMin){
        this.salaireMinMin = salaireMinMin;
    }
    public String getSalaireMinMax(){
        return this.salaireMinMax;
    }
    public void setSalaireMinMax(String salaireMinMax){
        this.salaireMinMax = salaireMinMax;
    }
      

}
