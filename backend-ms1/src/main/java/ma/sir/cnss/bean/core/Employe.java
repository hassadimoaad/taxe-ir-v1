package ma.sir.cnss.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.cnss.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "employe")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="employe_seq",sequenceName="employe_seq",allocationSize=1, initialValue = 1)
public class Employe   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String cnss;
    @Column(length = 500)
    private String nom;
    @Column(length = 500)
    private String prenom;



    public Employe(){
        super();
    }

    public Employe(Long id,String cnss){
        this.id = id;
        this.cnss = cnss ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="employe_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCnss(){
        return this.cnss;
    }
    public void setCnss(String cnss){
        this.cnss = cnss;
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    @Transient
    public String getLabel() {
        label = cnss;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id != null && id.equals(employe.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

