package  ma.sir.cnss.dao.specification.core;

import ma.sir.cnss.zynerator.specification.AbstractSpecification;
import ma.sir.cnss.dao.criteria.core.TaxIrEmployeCriteria;
import ma.sir.cnss.bean.core.TaxIrEmploye;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TaxIrEmployeSpecification extends  AbstractSpecification<TaxIrEmployeCriteria, TaxIrEmploye>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateBigDecimal("salaireNet", criteria.getSalaireNet(), criteria.getSalaireNetMin(), criteria.getSalaireNetMax());
        addPredicateBigDecimal("salaireBrut", criteria.getSalaireBrut(), criteria.getSalaireBrutMin(), criteria.getSalaireBrutMax());
        addPredicateFk("employe","id", criteria.getEmploye()==null?null:criteria.getEmploye().getId());
        addPredicateFk("employe","id", criteria.getEmployes());
        addPredicateFk("employe","cnss", criteria.getEmploye()==null?null:criteria.getEmploye().getCnss());
        addPredicateFk("tauxIr","id", criteria.getTauxIr()==null?null:criteria.getTauxIr().getId());
        addPredicateFk("tauxIr","id", criteria.getTauxIrs());
        addPredicateFk("taxIr","id", criteria.getTaxIr()==null?null:criteria.getTaxIr().getId());
        addPredicateFk("taxIr","id", criteria.getTaxIrs());
    }

    public TaxIrEmployeSpecification(TaxIrEmployeCriteria criteria) {
        super(criteria);
    }

    public TaxIrEmployeSpecification(TaxIrEmployeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
