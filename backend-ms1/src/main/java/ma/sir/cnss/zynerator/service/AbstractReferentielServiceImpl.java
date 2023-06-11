package ma.sir.cnss.zynerator.service;

import ma.sir.cnss.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.sir.cnss.zynerator.criteria.BaseCriteria;
import ma.sir.cnss.zynerator.history.HistBusinessObject;
import ma.sir.cnss.zynerator.history.HistCriteria;
import ma.sir.cnss.zynerator.repository.AbstractHistoryRepository;
import ma.sir.cnss.zynerator.repository.AbstractRepository;

public abstract class AbstractReferentielServiceImpl<T extends AuditBusinessObjectEnhanced, H extends HistBusinessObject, CRITERIA extends BaseCriteria, HC extends HistCriteria, REPO extends AbstractRepository<T, Long>, HISTREPO extends AbstractHistoryRepository<H, Long>> extends AbstractServiceImpl<T, H, CRITERIA, HC, REPO, HISTREPO> {

    public AbstractReferentielServiceImpl(REPO dao, HISTREPO historyRepository) {
    super(dao, historyRepository);
    }

}