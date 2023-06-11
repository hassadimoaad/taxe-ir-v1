package ma.sir.cnss.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.cnss.zynerator.repository.AbstractRepository;
import ma.sir.cnss.bean.core.Societe;
import org.springframework.stereotype.Repository;
import ma.sir.cnss.bean.core.Societe;
import java.util.List;


@Repository
public interface SocieteDao extends AbstractRepository<Societe,Long>  {
    Societe findByIce(String ice);
    int deleteByIce(String ice);


    @Query("SELECT NEW Societe(item.id,item.ice) FROM Societe item")
    List<Societe> findAllOptimized();
}
