package ma.sir.cnss.service.impl.admin;

import ma.sir.cnss.bean.core.Societe;
import ma.sir.cnss.bean.history.SocieteHistory;
import ma.sir.cnss.dao.criteria.core.SocieteCriteria;
import ma.sir.cnss.dao.criteria.history.SocieteHistoryCriteria;
import ma.sir.cnss.dao.facade.core.SocieteDao;
import ma.sir.cnss.dao.facade.history.SocieteHistoryDao;
import ma.sir.cnss.dao.specification.core.SocieteSpecification;
import ma.sir.cnss.service.facade.admin.SocieteAdminService;
import ma.sir.cnss.zynerator.service.AbstractServiceImpl;
import ma.sir.cnss.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class SocieteAdminServiceImpl extends AbstractServiceImpl<Societe,SocieteHistory, SocieteCriteria, SocieteHistoryCriteria, SocieteDao,
SocieteHistoryDao> implements SocieteAdminService {



    public Societe findByReferenceEntity(Societe t){
        return  dao.findByIce(t.getIce());
    }





    public void configure() {
        super.configure(Societe.class,SocieteHistory.class, SocieteHistoryCriteria.class, SocieteSpecification.class);
    }


    public SocieteAdminServiceImpl(SocieteDao dao, SocieteHistoryDao historyDao) {
        super(dao, historyDao);
    }

}