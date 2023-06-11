package  ma.sir.cnss.dao.specification.history;

import ma.sir.cnss.zynerator.specification.AbstractHistorySpecification;
import ma.sir.cnss.dao.criteria.history.TaxIrHistoryCriteria;
import ma.sir.cnss.bean.history.TaxIrHistory;


public class TaxIrHistorySpecification extends AbstractHistorySpecification<TaxIrHistoryCriteria, TaxIrHistory> {

    public TaxIrHistorySpecification(TaxIrHistoryCriteria criteria) {
        super(criteria);
    }

    public TaxIrHistorySpecification(TaxIrHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
