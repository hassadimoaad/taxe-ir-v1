package  ma.sir.cnss.dao.specification.core;

import ma.sir.cnss.zynerator.specification.AbstractSpecification;
import ma.sir.cnss.dao.criteria.core.SocieteCriteria;
import ma.sir.cnss.bean.core.Societe;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class SocieteSpecification extends  AbstractSpecification<SocieteCriteria, Societe>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("ice", criteria.getIce(),criteria.getIceLike());
        addPredicate("siege", criteria.getSiege(),criteria.getSiegeLike());
        addPredicateBool("bloqued", criteria.getBloqued());
    }

    public SocieteSpecification(SocieteCriteria criteria) {
        super(criteria);
    }

    public SocieteSpecification(SocieteCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
