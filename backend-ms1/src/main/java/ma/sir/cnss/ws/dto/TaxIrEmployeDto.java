package  ma.sir.cnss.ws.dto;

import ma.sir.cnss.zynerator.audit.Log;
import ma.sir.cnss.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaxIrEmployeDto  extends AuditBaseDto {

    private BigDecimal salaireNet  ;
    private BigDecimal salaireBrut  ;

    private EmployeDto employe ;
    private TauxIrDto tauxIr ;
    private TaxIrDto taxIr ;



    public TaxIrEmployeDto(){
        super();
    }



    @Log
    public BigDecimal getSalaireNet(){
        return this.salaireNet;
    }
    public void setSalaireNet(BigDecimal salaireNet){
        this.salaireNet = salaireNet;
    }

    @Log
    public BigDecimal getSalaireBrut(){
        return this.salaireBrut;
    }
    public void setSalaireBrut(BigDecimal salaireBrut){
        this.salaireBrut = salaireBrut;
    }


    public EmployeDto getEmploye(){
        return this.employe;
    }

    public void setEmploye(EmployeDto employe){
        this.employe = employe;
    }
    public TauxIrDto getTauxIr(){
        return this.tauxIr;
    }

    public void setTauxIr(TauxIrDto tauxIr){
        this.tauxIr = tauxIr;
    }
    public TaxIrDto getTaxIr(){
        return this.taxIr;
    }

    public void setTaxIr(TaxIrDto taxIr){
        this.taxIr = taxIr;
    }




}
