package ma.sir.cnss.dao.facade.history;

import ma.sir.cnss.zynerator.repository.AbstractHistoryRepository;
import ma.sir.cnss.bean.history.TauxIrHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TauxIrHistoryDao extends AbstractHistoryRepository<TauxIrHistory,Long> {

}
