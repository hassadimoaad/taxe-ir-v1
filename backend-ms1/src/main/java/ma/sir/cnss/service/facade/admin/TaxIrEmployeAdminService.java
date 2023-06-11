package ma.sir.cnss.service.facade.admin;

import java.util.List;
import ma.sir.cnss.bean.core.TaxIrEmploye;
import ma.sir.cnss.dao.criteria.core.TaxIrEmployeCriteria;
import ma.sir.cnss.dao.criteria.history.TaxIrEmployeHistoryCriteria;
import ma.sir.cnss.zynerator.service.IService;


public interface TaxIrEmployeAdminService extends  IService<TaxIrEmploye,TaxIrEmployeCriteria, TaxIrEmployeHistoryCriteria>  {

    List<TaxIrEmploye> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);
    List<TaxIrEmploye> findByTauxIrId(Long id);
    int deleteByTauxIrId(Long id);
    List<TaxIrEmploye> findByTaxIrId(Long id);
    int deleteByTaxIrId(Long id);



}
