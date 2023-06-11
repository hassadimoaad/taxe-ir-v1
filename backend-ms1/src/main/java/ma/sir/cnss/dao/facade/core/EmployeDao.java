package ma.sir.cnss.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.sir.cnss.zynerator.repository.AbstractRepository;
import ma.sir.cnss.bean.core.Employe;
import org.springframework.stereotype.Repository;
import ma.sir.cnss.bean.core.Employe;
import java.util.List;


@Repository
public interface EmployeDao extends AbstractRepository<Employe,Long>  {
    Employe findByCnss(String cnss);
    int deleteByCnss(String cnss);


    @Query("SELECT NEW Employe(item.id,item.cnss) FROM Employe item")
    List<Employe> findAllOptimized();
}
