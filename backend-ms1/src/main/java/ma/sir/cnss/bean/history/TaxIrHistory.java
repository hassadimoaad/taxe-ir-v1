package ma.sir.cnss.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.cnss.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "tax_ir")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="tax_ir_seq",sequenceName="tax_ir_seq",allocationSize=1, initialValue = 1)
public class TaxIrHistory extends HistBusinessObject  {


    public TaxIrHistory() {
    super();
    }

    public TaxIrHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="tax_ir_seq")
    public Long getId() {
    return id;
    }
}

