package ma.sir.cnss.service.facade.admin;

import java.util.List;
import ma.sir.cnss.bean.core.Employe;
import ma.sir.cnss.dao.criteria.core.EmployeCriteria;
import ma.sir.cnss.dao.criteria.history.EmployeHistoryCriteria;
import ma.sir.cnss.zynerator.service.IService;


public interface EmployeAdminService extends  IService<Employe,EmployeCriteria, EmployeHistoryCriteria>  {




}
