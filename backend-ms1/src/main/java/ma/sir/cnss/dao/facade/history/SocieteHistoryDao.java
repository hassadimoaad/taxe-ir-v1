package ma.sir.cnss.dao.facade.history;

import ma.sir.cnss.zynerator.repository.AbstractHistoryRepository;
import ma.sir.cnss.bean.history.SocieteHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface SocieteHistoryDao extends AbstractHistoryRepository<SocieteHistory,Long> {

}
