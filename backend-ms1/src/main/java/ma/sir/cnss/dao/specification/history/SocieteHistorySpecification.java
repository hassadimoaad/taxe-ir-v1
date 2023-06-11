package  ma.sir.cnss.dao.specification.history;

import ma.sir.cnss.zynerator.specification.AbstractHistorySpecification;
import ma.sir.cnss.dao.criteria.history.SocieteHistoryCriteria;
import ma.sir.cnss.bean.history.SocieteHistory;


public class SocieteHistorySpecification extends AbstractHistorySpecification<SocieteHistoryCriteria, SocieteHistory> {

    public SocieteHistorySpecification(SocieteHistoryCriteria criteria) {
        super(criteria);
    }

    public SocieteHistorySpecification(SocieteHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
