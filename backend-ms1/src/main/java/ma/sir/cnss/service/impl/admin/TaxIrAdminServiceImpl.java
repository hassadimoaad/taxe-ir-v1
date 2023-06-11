package ma.sir.cnss.service.impl.admin;

import ma.sir.cnss.bean.core.TaxIr;
import ma.sir.cnss.bean.history.TaxIrHistory;
import ma.sir.cnss.dao.criteria.core.TaxIrCriteria;
import ma.sir.cnss.dao.criteria.history.TaxIrHistoryCriteria;
import ma.sir.cnss.dao.facade.core.TaxIrDao;
import ma.sir.cnss.dao.facade.history.TaxIrHistoryDao;
import ma.sir.cnss.dao.specification.core.TaxIrSpecification;
import ma.sir.cnss.service.facade.admin.TaxIrAdminService;
import ma.sir.cnss.zynerator.service.AbstractServiceImpl;
import ma.sir.cnss.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.sir.cnss.bean.core.TaxIrEmploye;

import ma.sir.cnss.service.facade.admin.TaxIrEmployeAdminService ;
import ma.sir.cnss.service.facade.admin.SocieteAdminService ;


import java.util.List;
@Service
public class TaxIrAdminServiceImpl extends AbstractServiceImpl<TaxIr,TaxIrHistory, TaxIrCriteria, TaxIrHistoryCriteria, TaxIrDao,
TaxIrHistoryDao> implements TaxIrAdminService {


    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public TaxIr create(TaxIr t) {
        super.create(t);
        if (t.getTaxeIrEmployes() != null) {
                t.getTaxeIrEmployes().forEach(element-> {
                    element.setTaxIr(t);
                    taxIrEmployeService.create(element);
            });
        }
        return t;
    }

    public TaxIr findWithAssociatedLists(Long id){
        TaxIr result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setTaxeIrEmployes(taxIrEmployeService.findByTaxIrId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        taxIrEmployeService.deleteByTaxIrId(id);
    }


    public void updateWithAssociatedLists(TaxIr taxIr){
    if(taxIr !=null && taxIr.getId() != null){
            List<List<TaxIrEmploye>> resultTaxeIrEmployes= taxIrEmployeService.getToBeSavedAndToBeDeleted(taxIrEmployeService.findByTaxIrId(taxIr.getId()),taxIr.getTaxeIrEmployes());
            taxIrEmployeService.delete(resultTaxeIrEmployes.get(1));
            ListUtil.emptyIfNull(resultTaxeIrEmployes.get(0)).forEach(e -> e.setTaxIr(taxIr));
            taxIrEmployeService.update(resultTaxeIrEmployes.get(0),true);
    }
    }


    public List<TaxIr> findBySocieteId(Long id){
        return dao.findBySocieteId(id);
    }
    public int deleteBySocieteId(Long id){
        return dao.deleteBySocieteId(id);
    }




    public void configure() {
        super.configure(TaxIr.class,TaxIrHistory.class, TaxIrHistoryCriteria.class, TaxIrSpecification.class);
    }

    @Autowired
    private TaxIrEmployeAdminService taxIrEmployeService ;
    @Autowired
    private SocieteAdminService societeService ;

    public TaxIrAdminServiceImpl(TaxIrDao dao, TaxIrHistoryDao historyDao) {
        super(dao, historyDao);
    }

}