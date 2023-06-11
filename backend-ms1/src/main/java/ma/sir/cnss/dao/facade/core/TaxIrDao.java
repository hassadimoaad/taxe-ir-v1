package ma.sir.cnss.dao.facade.core;

import ma.sir.cnss.zynerator.repository.AbstractRepository;
import ma.sir.cnss.bean.core.TaxIr;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface TaxIrDao extends AbstractRepository<TaxIr,Long>  {

    List<TaxIr> findBySocieteId(Long id);
    int deleteBySocieteId(Long id);

}
