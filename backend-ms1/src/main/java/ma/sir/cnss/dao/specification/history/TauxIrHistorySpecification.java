package  ma.sir.cnss.dao.specification.history;

import ma.sir.cnss.zynerator.specification.AbstractHistorySpecification;
import ma.sir.cnss.dao.criteria.history.TauxIrHistoryCriteria;
import ma.sir.cnss.bean.history.TauxIrHistory;


public class TauxIrHistorySpecification extends AbstractHistorySpecification<TauxIrHistoryCriteria, TauxIrHistory> {

    public TauxIrHistorySpecification(TauxIrHistoryCriteria criteria) {
        super(criteria);
    }

    public TauxIrHistorySpecification(TauxIrHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
