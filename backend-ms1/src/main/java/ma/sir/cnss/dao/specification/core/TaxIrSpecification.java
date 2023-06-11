package  ma.sir.cnss.dao.specification.core;

import ma.sir.cnss.zynerator.specification.AbstractSpecification;
import ma.sir.cnss.dao.criteria.core.TaxIrCriteria;
import ma.sir.cnss.bean.core.TaxIr;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TaxIrSpecification extends  AbstractSpecification<TaxIrCriteria, TaxIr>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateInt("anne", criteria.getAnne(), criteria.getAnneMin(), criteria.getAnneMax());
        addPredicateInt("mois", criteria.getMois(), criteria.getMoisMin(), criteria.getMoisMax());
        addPredicateBigDecimal("montantBaseTotal", criteria.getMontantBaseTotal(), criteria.getMontantBaseTotalMin(), criteria.getMontantBaseTotalMax());
        addPredicateBigDecimal("montantRetardTotal", criteria.getMontantRetardTotal(), criteria.getMontantRetardTotalMin(), criteria.getMontantRetardTotalMax());
        addPredicateBigDecimal("salaireTotale", criteria.getSalaireTotale(), criteria.getSalaireTotaleMin(), criteria.getSalaireTotaleMax());
        addPredicateBigDecimal("cotisationTotal", criteria.getCotisationTotal(), criteria.getCotisationTotalMin(), criteria.getCotisationTotalMax());
        addPredicateFk("societe","id", criteria.getSociete()==null?null:criteria.getSociete().getId());
        addPredicateFk("societe","id", criteria.getSocietes());
        addPredicateFk("societe","ice", criteria.getSociete()==null?null:criteria.getSociete().getIce());
    }

    public TaxIrSpecification(TaxIrCriteria criteria) {
        super(criteria);
    }

    public TaxIrSpecification(TaxIrCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
