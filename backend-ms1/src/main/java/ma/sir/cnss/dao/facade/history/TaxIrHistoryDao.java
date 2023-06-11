package ma.sir.cnss.dao.facade.history;

import ma.sir.cnss.zynerator.repository.AbstractHistoryRepository;
import ma.sir.cnss.bean.history.TaxIrHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxIrHistoryDao extends AbstractHistoryRepository<TaxIrHistory,Long> {

}
