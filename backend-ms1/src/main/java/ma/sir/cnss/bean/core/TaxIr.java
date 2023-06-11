package ma.sir.cnss.bean.core;

import java.util.Objects;
import java.util.List;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.cnss.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "tax_ir")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="tax_ir_seq",sequenceName="tax_ir_seq",allocationSize=1, initialValue = 1)
public class TaxIr   extends AuditBusinessObject     {

    private Long id;

    private Integer anne = 0;
    private Integer mois = 0;
    private BigDecimal montantBaseTotal = BigDecimal.ZERO;
    private BigDecimal montantRetardTotal = BigDecimal.ZERO;
    private BigDecimal salaireTotale = BigDecimal.ZERO;
    private BigDecimal cotisationTotal = BigDecimal.ZERO;

    private Societe societe ;
    

    private List<TaxIrEmploye> taxeIrEmployes ;

    public TaxIr(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="tax_ir_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public Integer getAnne(){
        return this.anne;
    }
    public void setAnne(Integer anne){
        this.anne = anne;
    }
    public Integer getMois(){
        return this.mois;
    }
    public void setMois(Integer mois){
        this.mois = mois;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Societe getSociete(){
        return this.societe;
    }
    public void setSociete(Societe societe){
        this.societe = societe;
    }
    public BigDecimal getMontantBaseTotal(){
        return this.montantBaseTotal;
    }
    public void setMontantBaseTotal(BigDecimal montantBaseTotal){
        this.montantBaseTotal = montantBaseTotal;
    }
    public BigDecimal getMontantRetardTotal(){
        return this.montantRetardTotal;
    }
    public void setMontantRetardTotal(BigDecimal montantRetardTotal){
        this.montantRetardTotal = montantRetardTotal;
    }
    public BigDecimal getSalaireTotale(){
        return this.salaireTotale;
    }
    public void setSalaireTotale(BigDecimal salaireTotale){
        this.salaireTotale = salaireTotale;
    }
    public BigDecimal getCotisationTotal(){
        return this.cotisationTotal;
    }
    public void setCotisationTotal(BigDecimal cotisationTotal){
        this.cotisationTotal = cotisationTotal;
    }
    @OneToMany(mappedBy = "taxIr")
    public List<TaxIrEmploye> getTaxeIrEmployes(){
        return this.taxeIrEmployes;
    }
    public void setTaxeIrEmployes(List<TaxIrEmploye> taxeIrEmployes){
        this.taxeIrEmployes = taxeIrEmployes;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaxIr taxIr = (TaxIr) o;
        return id != null && id.equals(taxIr.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

