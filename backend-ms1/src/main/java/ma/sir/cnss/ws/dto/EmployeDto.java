package  ma.sir.cnss.ws.dto;

import ma.sir.cnss.zynerator.audit.Log;
import ma.sir.cnss.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeDto  extends AuditBaseDto {

    private String cnss  ;
    private String nom  ;
    private String prenom  ;




    public EmployeDto(){
        super();
    }



    @Log
    public String getCnss(){
        return this.cnss;
    }
    public void setCnss(String cnss){
        this.cnss = cnss;
    }

    @Log
    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    @Log
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }






}
