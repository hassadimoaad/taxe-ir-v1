package ma.sir.cnss.service.impl.admin;

import ma.sir.cnss.bean.core.TauxIr;
import ma.sir.cnss.bean.history.TauxIrHistory;
import ma.sir.cnss.dao.criteria.core.TauxIrCriteria;
import ma.sir.cnss.dao.criteria.history.TauxIrHistoryCriteria;
import ma.sir.cnss.dao.facade.core.TauxIrDao;
import ma.sir.cnss.dao.facade.history.TauxIrHistoryDao;
import ma.sir.cnss.dao.specification.core.TauxIrSpecification;
import ma.sir.cnss.service.facade.admin.TauxIrAdminService;
import ma.sir.cnss.zynerator.service.AbstractServiceImpl;
import ma.sir.cnss.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TauxIrAdminServiceImpl extends AbstractServiceImpl<TauxIr,TauxIrHistory, TauxIrCriteria, TauxIrHistoryCriteria, TauxIrDao,
TauxIrHistoryDao> implements TauxIrAdminService {








    public void configure() {
        super.configure(TauxIr.class,TauxIrHistory.class, TauxIrHistoryCriteria.class, TauxIrSpecification.class);
    }


    public TauxIrAdminServiceImpl(TauxIrDao dao, TauxIrHistoryDao historyDao) {
        super(dao, historyDao);
    }

}