package  ma.sir.cnss.dao.specification.core;

import ma.sir.cnss.zynerator.specification.AbstractSpecification;
import ma.sir.cnss.dao.criteria.core.TauxIrCriteria;
import ma.sir.cnss.bean.core.TauxIr;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TauxIrSpecification extends  AbstractSpecification<TauxIrCriteria, TauxIr>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateInt("pourcentage", criteria.getPourcentage(), criteria.getPourcentageMin(), criteria.getPourcentageMax());
        addPredicateBigDecimal("salaireMax", criteria.getSalaireMax(), criteria.getSalaireMaxMin(), criteria.getSalaireMaxMax());
        addPredicateBigDecimal("salaireMin", criteria.getSalaireMin(), criteria.getSalaireMinMin(), criteria.getSalaireMinMax());
    }

    public TauxIrSpecification(TauxIrCriteria criteria) {
        super(criteria);
    }

    public TauxIrSpecification(TauxIrCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
