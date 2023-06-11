package ma.sir.cnss.service.facade.admin;

import java.util.List;
import ma.sir.cnss.bean.core.TaxIr;
import ma.sir.cnss.dao.criteria.core.TaxIrCriteria;
import ma.sir.cnss.dao.criteria.history.TaxIrHistoryCriteria;
import ma.sir.cnss.zynerator.service.IService;


public interface TaxIrAdminService extends  IService<TaxIr,TaxIrCriteria, TaxIrHistoryCriteria>  {

    List<TaxIr> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);



}
