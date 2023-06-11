package ma.sir.cnss.dao.facade.core;

import ma.sir.cnss.zynerator.repository.AbstractRepository;
import ma.sir.cnss.bean.core.TaxIrEmploye;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface TaxIrEmployeDao extends AbstractRepository<TaxIrEmploye,Long>  {

    List<TaxIrEmploye> findByEmployeId(Long id);
    int deleteByEmployeId(Long id);
    List<TaxIrEmploye> findByTauxIrId(Long id);
    int deleteByTauxIrId(Long id);
    List<TaxIrEmploye> findByTaxIrId(Long id);
    int deleteByTaxIrId(Long id);

}
