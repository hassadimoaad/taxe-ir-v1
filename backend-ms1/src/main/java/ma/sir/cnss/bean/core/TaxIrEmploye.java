package ma.sir.cnss.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.cnss.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "tax_ir_employe")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="tax_ir_employe_seq",sequenceName="tax_ir_employe_seq",allocationSize=1, initialValue = 1)
public class TaxIrEmploye   extends AuditBusinessObject     {

    private Long id;

    private BigDecimal salaireNet = BigDecimal.ZERO;
    private BigDecimal salaireBrut = BigDecimal.ZERO;

    private Employe employe ;
    
    private TauxIr tauxIr ;
    
    private TaxIr taxIr ;
    


    public TaxIrEmploye(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="tax_ir_employe_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public BigDecimal getSalaireNet(){
        return this.salaireNet;
    }
    public void setSalaireNet(BigDecimal salaireNet){
        this.salaireNet = salaireNet;
    }
    public BigDecimal getSalaireBrut(){
        return this.salaireBrut;
    }
    public void setSalaireBrut(BigDecimal salaireBrut){
        this.salaireBrut = salaireBrut;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Employe getEmploye(){
        return this.employe;
    }
    public void setEmploye(Employe employe){
        this.employe = employe;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public TauxIr getTauxIr(){
        return this.tauxIr;
    }
    public void setTauxIr(TauxIr tauxIr){
        this.tauxIr = tauxIr;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public TaxIr getTaxIr(){
        return this.taxIr;
    }
    public void setTaxIr(TaxIr taxIr){
        this.taxIr = taxIr;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaxIrEmploye taxIrEmploye = (TaxIrEmploye) o;
        return id != null && id.equals(taxIrEmploye.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

