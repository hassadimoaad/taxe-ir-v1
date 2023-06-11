package ma.sir.cnss.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.cnss.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "taux_ir")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="taux_ir_seq",sequenceName="taux_ir_seq",allocationSize=1, initialValue = 1)
public class TauxIr   extends AuditBusinessObject     {

    private Long id;

    private Integer pourcentage = 0;
    private BigDecimal salaireMax = BigDecimal.ZERO;
    private BigDecimal salaireMin = BigDecimal.ZERO;



    public TauxIr(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="taux_ir_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Integer getPourcentage(){
        return this.pourcentage;
    }
    public void setPourcentage(Integer pourcentage){
        this.pourcentage = pourcentage;
    }
    public BigDecimal getSalaireMax(){
        return this.salaireMax;
    }
    public void setSalaireMax(BigDecimal salaireMax){
        this.salaireMax = salaireMax;
    }
    public BigDecimal getSalaireMin(){
        return this.salaireMin;
    }
    public void setSalaireMin(BigDecimal salaireMin){
        this.salaireMin = salaireMin;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TauxIr tauxIr = (TauxIr) o;
        return id != null && id.equals(tauxIr.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

