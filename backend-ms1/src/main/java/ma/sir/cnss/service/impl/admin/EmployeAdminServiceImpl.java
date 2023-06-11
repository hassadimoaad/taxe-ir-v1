package ma.sir.cnss.service.impl.admin;

import ma.sir.cnss.bean.core.Employe;
import ma.sir.cnss.bean.history.EmployeHistory;
import ma.sir.cnss.dao.criteria.core.EmployeCriteria;
import ma.sir.cnss.dao.criteria.history.EmployeHistoryCriteria;
import ma.sir.cnss.dao.facade.core.EmployeDao;
import ma.sir.cnss.dao.facade.history.EmployeHistoryDao;
import ma.sir.cnss.dao.specification.core.EmployeSpecification;
import ma.sir.cnss.service.facade.admin.EmployeAdminService;
import ma.sir.cnss.zynerator.service.AbstractServiceImpl;
import ma.sir.cnss.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EmployeAdminServiceImpl extends AbstractServiceImpl<Employe,EmployeHistory, EmployeCriteria, EmployeHistoryCriteria, EmployeDao,
EmployeHistoryDao> implements EmployeAdminService {



    public Employe findByReferenceEntity(Employe t){
        return  dao.findByCnss(t.getCnss());
    }





    public void configure() {
        super.configure(Employe.class,EmployeHistory.class, EmployeHistoryCriteria.class, EmployeSpecification.class);
    }


    public EmployeAdminServiceImpl(EmployeDao dao, EmployeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}