package  ma.sir.cnss.dao.specification.history;

import ma.sir.cnss.zynerator.specification.AbstractHistorySpecification;
import ma.sir.cnss.dao.criteria.history.TaxIrEmployeHistoryCriteria;
import ma.sir.cnss.bean.history.TaxIrEmployeHistory;


public class TaxIrEmployeHistorySpecification extends AbstractHistorySpecification<TaxIrEmployeHistoryCriteria, TaxIrEmployeHistory> {

    public TaxIrEmployeHistorySpecification(TaxIrEmployeHistoryCriteria criteria) {
        super(criteria);
    }

    public TaxIrEmployeHistorySpecification(TaxIrEmployeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
