package ma.sir.cnss.dao.facade.history;

import ma.sir.cnss.zynerator.repository.AbstractHistoryRepository;
import ma.sir.cnss.bean.history.TaxIrEmployeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxIrEmployeHistoryDao extends AbstractHistoryRepository<TaxIrEmployeHistory,Long> {

}
