package  ma.sir.cnss.dao.criteria.core;


import ma.sir.cnss.zynerator.criteria.BaseCriteria;
import java.util.List;

public class EmployeCriteria extends  BaseCriteria  {

    private String cnss;
    private String cnssLike;
    private String nom;
    private String nomLike;
    private String prenom;
    private String prenomLike;



    public EmployeCriteria(){}

    public String getCnss(){
        return this.cnss;
    }
    public void setCnss(String cnss){
        this.cnss = cnss;
    }
    public String getCnssLike(){
        return this.cnssLike;
    }
    public void setCnssLike(String cnssLike){
        this.cnssLike = cnssLike;
    }

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String getNomLike(){
        return this.nomLike;
    }
    public void setNomLike(String nomLike){
        this.nomLike = nomLike;
    }

    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public String getPrenomLike(){
        return this.prenomLike;
    }
    public void setPrenomLike(String prenomLike){
        this.prenomLike = prenomLike;
    }


}
