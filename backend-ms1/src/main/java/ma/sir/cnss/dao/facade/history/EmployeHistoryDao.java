package ma.sir.cnss.dao.facade.history;

import ma.sir.cnss.zynerator.repository.AbstractHistoryRepository;
import ma.sir.cnss.bean.history.EmployeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeHistoryDao extends AbstractHistoryRepository<EmployeHistory,Long> {

}
