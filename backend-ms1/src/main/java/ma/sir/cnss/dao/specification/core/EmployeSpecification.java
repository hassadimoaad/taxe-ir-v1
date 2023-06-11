package  ma.sir.cnss.dao.specification.core;

import ma.sir.cnss.zynerator.specification.AbstractSpecification;
import ma.sir.cnss.dao.criteria.core.EmployeCriteria;
import ma.sir.cnss.bean.core.Employe;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EmployeSpecification extends  AbstractSpecification<EmployeCriteria, Employe>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("cnss", criteria.getCnss(),criteria.getCnssLike());
        addPredicate("nom", criteria.getNom(),criteria.getNomLike());
        addPredicate("prenom", criteria.getPrenom(),criteria.getPrenomLike());
    }

    public EmployeSpecification(EmployeCriteria criteria) {
        super(criteria);
    }

    public EmployeSpecification(EmployeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
