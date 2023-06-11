package  ma.sir.cnss.ws.dto;

import ma.sir.cnss.zynerator.audit.Log;
import ma.sir.cnss.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaxIrDto  extends AuditBaseDto {

    private Integer anne  = 0 ;
    private Integer mois  = 0 ;
    private BigDecimal montantBaseTotal  ;
    private BigDecimal montantRetardTotal  ;
    private BigDecimal salaireTotale  ;
    private BigDecimal cotisationTotal  ;

    private SocieteDto societe ;

    private List<TaxIrEmployeDto> taxeIrEmployes ;


    public TaxIrDto(){
        super();
    }



    @Log
    public Integer getAnne(){
        return this.anne;
    }
    public void setAnne(Integer anne){
        this.anne = anne;
    }

    @Log
    public Integer getMois(){
        return this.mois;
    }
    public void setMois(Integer mois){
        this.mois = mois;
    }

    @Log
    public BigDecimal getMontantBaseTotal(){
        return this.montantBaseTotal;
    }
    public void setMontantBaseTotal(BigDecimal montantBaseTotal){
        this.montantBaseTotal = montantBaseTotal;
    }

    @Log
    public BigDecimal getMontantRetardTotal(){
        return this.montantRetardTotal;
    }
    public void setMontantRetardTotal(BigDecimal montantRetardTotal){
        this.montantRetardTotal = montantRetardTotal;
    }

    @Log
    public BigDecimal getSalaireTotale(){
        return this.salaireTotale;
    }
    public void setSalaireTotale(BigDecimal salaireTotale){
        this.salaireTotale = salaireTotale;
    }

    @Log
    public BigDecimal getCotisationTotal(){
        return this.cotisationTotal;
    }
    public void setCotisationTotal(BigDecimal cotisationTotal){
        this.cotisationTotal = cotisationTotal;
    }


    public SocieteDto getSociete(){
        return this.societe;
    }

    public void setSociete(SocieteDto societe){
        this.societe = societe;
    }



    public List<TaxIrEmployeDto> getTaxeIrEmployes(){
        return this.taxeIrEmployes;
    }

    public void setTaxeIrEmployes(List<TaxIrEmployeDto> taxeIrEmployes){
        this.taxeIrEmployes = taxeIrEmployes;
    }

}
