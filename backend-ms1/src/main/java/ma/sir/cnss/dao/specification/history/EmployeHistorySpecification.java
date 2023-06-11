package  ma.sir.cnss.dao.specification.history;

import ma.sir.cnss.zynerator.specification.AbstractHistorySpecification;
import ma.sir.cnss.dao.criteria.history.EmployeHistoryCriteria;
import ma.sir.cnss.bean.history.EmployeHistory;


public class EmployeHistorySpecification extends AbstractHistorySpecification<EmployeHistoryCriteria, EmployeHistory> {

    public EmployeHistorySpecification(EmployeHistoryCriteria criteria) {
        super(criteria);
    }

    public EmployeHistorySpecification(EmployeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
