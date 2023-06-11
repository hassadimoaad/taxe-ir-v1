package  ma.sir.cnss.ws.dto;

import ma.sir.cnss.zynerator.audit.Log;
import ma.sir.cnss.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class TauxIrDto  extends AuditBaseDto {

    private Integer pourcentage  = 0 ;
    private BigDecimal salaireMax  ;
    private BigDecimal salaireMin  ;




    public TauxIrDto(){
        super();
    }



    @Log
    public Integer getPourcentage(){
        return this.pourcentage;
    }
    public void setPourcentage(Integer pourcentage){
        this.pourcentage = pourcentage;
    }

    @Log
    public BigDecimal getSalaireMax(){
        return this.salaireMax;
    }
    public void setSalaireMax(BigDecimal salaireMax){
        this.salaireMax = salaireMax;
    }

    @Log
    public BigDecimal getSalaireMin(){
        return this.salaireMin;
    }
    public void setSalaireMin(BigDecimal salaireMin){
        this.salaireMin = salaireMin;
    }






}
