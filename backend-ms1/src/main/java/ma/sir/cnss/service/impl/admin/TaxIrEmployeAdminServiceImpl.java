package ma.sir.cnss.service.impl.admin;

import ma.sir.cnss.bean.core.TaxIrEmploye;
import ma.sir.cnss.bean.history.TaxIrEmployeHistory;
import ma.sir.cnss.dao.criteria.core.TaxIrEmployeCriteria;
import ma.sir.cnss.dao.criteria.history.TaxIrEmployeHistoryCriteria;
import ma.sir.cnss.dao.facade.core.TaxIrEmployeDao;
import ma.sir.cnss.dao.facade.history.TaxIrEmployeHistoryDao;
import ma.sir.cnss.dao.specification.core.TaxIrEmployeSpecification;
import ma.sir.cnss.service.facade.admin.TaxIrEmployeAdminService;
import ma.sir.cnss.zynerator.service.AbstractServiceImpl;
import ma.sir.cnss.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.cnss.service.facade.admin.EmployeAdminService ;
import ma.sir.cnss.service.facade.admin.TauxIrAdminService ;
import ma.sir.cnss.service.facade.admin.TaxIrAdminService ;


import java.util.List;
@Service
public class TaxIrEmployeAdminServiceImpl extends AbstractServiceImpl<TaxIrEmploye,TaxIrEmployeHistory, TaxIrEmployeCriteria, TaxIrEmployeHistoryCriteria, TaxIrEmployeDao,
TaxIrEmployeHistoryDao> implements TaxIrEmployeAdminService {




    public List<TaxIrEmploye> findByEmployeId(Long id){
        return dao.findByEmployeId(id);
    }
    public int deleteByEmployeId(Long id){
        return dao.deleteByEmployeId(id);
    }
    public List<TaxIrEmploye> findByTauxIrId(Long id){
        return dao.findByTauxIrId(id);
    }
    public int deleteByTauxIrId(Long id){
        return dao.deleteByTauxIrId(id);
    }
    public List<TaxIrEmploye> findByTaxIrId(Long id){
        return dao.findByTaxIrId(id);
    }
    public int deleteByTaxIrId(Long id){
        return dao.deleteByTaxIrId(id);
    }




    public void configure() {
        super.configure(TaxIrEmploye.class,TaxIrEmployeHistory.class, TaxIrEmployeHistoryCriteria.class, TaxIrEmployeSpecification.class);
    }

    @Autowired
    private EmployeAdminService employeService ;
    @Autowired
    private TauxIrAdminService tauxIrService ;
    @Autowired
    private TaxIrAdminService taxIrService ;

    public TaxIrEmployeAdminServiceImpl(TaxIrEmployeDao dao, TaxIrEmployeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}