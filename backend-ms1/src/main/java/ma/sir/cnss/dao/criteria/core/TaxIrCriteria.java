package  ma.sir.cnss.dao.criteria.core;


import ma.sir.cnss.zynerator.criteria.BaseCriteria;
import java.util.List;

public class TaxIrCriteria extends  BaseCriteria  {

    private String anne;
    private String anneMin;
    private String anneMax;
    private String mois;
    private String moisMin;
    private String moisMax;
    private String montantBaseTotal;
    private String montantBaseTotalMin;
    private String montantBaseTotalMax;
    private String montantRetardTotal;
    private String montantRetardTotalMin;
    private String montantRetardTotalMax;
    private String salaireTotale;
    private String salaireTotaleMin;
    private String salaireTotaleMax;
    private String cotisationTotal;
    private String cotisationTotalMin;
    private String cotisationTotalMax;

    private SocieteCriteria societe ;
    private List<SocieteCriteria> societes ;


    public TaxIrCriteria(){}

    public String getAnne(){
        return this.anne;
    }
    public void setAnne(String anne){
        this.anne = anne;
    }   
    public String getAnneMin(){
        return this.anneMin;
    }
    public void setAnneMin(String anneMin){
        this.anneMin = anneMin;
    }
    public String getAnneMax(){
        return this.anneMax;
    }
    public void setAnneMax(String anneMax){
        this.anneMax = anneMax;
    }
      
    public String getMois(){
        return this.mois;
    }
    public void setMois(String mois){
        this.mois = mois;
    }   
    public String getMoisMin(){
        return this.moisMin;
    }
    public void setMoisMin(String moisMin){
        this.moisMin = moisMin;
    }
    public String getMoisMax(){
        return this.moisMax;
    }
    public void setMoisMax(String moisMax){
        this.moisMax = moisMax;
    }
      
    public String getMontantBaseTotal(){
        return this.montantBaseTotal;
    }
    public void setMontantBaseTotal(String montantBaseTotal){
        this.montantBaseTotal = montantBaseTotal;
    }   
    public String getMontantBaseTotalMin(){
        return this.montantBaseTotalMin;
    }
    public void setMontantBaseTotalMin(String montantBaseTotalMin){
        this.montantBaseTotalMin = montantBaseTotalMin;
    }
    public String getMontantBaseTotalMax(){
        return this.montantBaseTotalMax;
    }
    public void setMontantBaseTotalMax(String montantBaseTotalMax){
        this.montantBaseTotalMax = montantBaseTotalMax;
    }
      
    public String getMontantRetardTotal(){
        return this.montantRetardTotal;
    }
    public void setMontantRetardTotal(String montantRetardTotal){
        this.montantRetardTotal = montantRetardTotal;
    }   
    public String getMontantRetardTotalMin(){
        return this.montantRetardTotalMin;
    }
    public void setMontantRetardTotalMin(String montantRetardTotalMin){
        this.montantRetardTotalMin = montantRetardTotalMin;
    }
    public String getMontantRetardTotalMax(){
        return this.montantRetardTotalMax;
    }
    public void setMontantRetardTotalMax(String montantRetardTotalMax){
        this.montantRetardTotalMax = montantRetardTotalMax;
    }
      
    public String getSalaireTotale(){
        return this.salaireTotale;
    }
    public void setSalaireTotale(String salaireTotale){
        this.salaireTotale = salaireTotale;
    }   
    public String getSalaireTotaleMin(){
        return this.salaireTotaleMin;
    }
    public void setSalaireTotaleMin(String salaireTotaleMin){
        this.salaireTotaleMin = salaireTotaleMin;
    }
    public String getSalaireTotaleMax(){
        return this.salaireTotaleMax;
    }
    public void setSalaireTotaleMax(String salaireTotaleMax){
        this.salaireTotaleMax = salaireTotaleMax;
    }
      
    public String getCotisationTotal(){
        return this.cotisationTotal;
    }
    public void setCotisationTotal(String cotisationTotal){
        this.cotisationTotal = cotisationTotal;
    }   
    public String getCotisationTotalMin(){
        return this.cotisationTotalMin;
    }
    public void setCotisationTotalMin(String cotisationTotalMin){
        this.cotisationTotalMin = cotisationTotalMin;
    }
    public String getCotisationTotalMax(){
        return this.cotisationTotalMax;
    }
    public void setCotisationTotalMax(String cotisationTotalMax){
        this.cotisationTotalMax = cotisationTotalMax;
    }
      

    public SocieteCriteria getSociete(){
        return this.societe;
    }

    public void setSociete(SocieteCriteria societe){
        this.societe = societe;
    }
    public List<SocieteCriteria> getSocietes(){
        return this.societes;
    }

    public void setSocietes(List<SocieteCriteria> societes){
        this.societes = societes;
    }
}
