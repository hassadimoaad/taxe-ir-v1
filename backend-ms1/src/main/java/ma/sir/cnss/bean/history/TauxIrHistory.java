package ma.sir.cnss.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.cnss.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "taux_ir")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="taux_ir_seq",sequenceName="taux_ir_seq",allocationSize=1, initialValue = 1)
public class TauxIrHistory extends HistBusinessObject  {


    public TauxIrHistory() {
    super();
    }

    public TauxIrHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="taux_ir_seq")
    public Long getId() {
    return id;
    }
}

