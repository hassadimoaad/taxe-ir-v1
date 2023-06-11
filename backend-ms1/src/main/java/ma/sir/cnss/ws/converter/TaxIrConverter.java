package  ma.sir.cnss.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.sir.cnss.zynerator.util.ListUtil;


import ma.sir.cnss.zynerator.util.StringUtil;
import ma.sir.cnss.zynerator.converter.AbstractConverter;
import ma.sir.cnss.zynerator.util.DateUtil;
import ma.sir.cnss.bean.history.TaxIrHistory;
import ma.sir.cnss.bean.core.TaxIr;
import ma.sir.cnss.ws.dto.TaxIrDto;

@Component
public class TaxIrConverter extends AbstractConverter<TaxIr, TaxIrDto, TaxIrHistory> {

    @Autowired
    private TaxIrEmployeConverter taxIrEmployeConverter ;
    @Autowired
    private EmployeConverter employeConverter ;
    @Autowired
    private TauxIrConverter tauxIrConverter ;
    @Autowired
    private SocieteConverter societeConverter ;
    private boolean societe;
    private boolean taxeIrEmployes;

    public  TaxIrConverter(){
        super(TaxIr.class, TaxIrDto.class, TaxIrHistory.class);
        init(true);
    }

    @Override
    public TaxIr toItem(TaxIrDto dto) {
        if (dto == null) {
            return null;
        } else {
        TaxIr item = new TaxIr();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getAnne()))
                item.setAnne(dto.getAnne());
            if(StringUtil.isNotEmpty(dto.getMois()))
                item.setMois(dto.getMois());
            if(StringUtil.isNotEmpty(dto.getMontantBaseTotal()))
                item.setMontantBaseTotal(dto.getMontantBaseTotal());
            if(StringUtil.isNotEmpty(dto.getMontantRetardTotal()))
                item.setMontantRetardTotal(dto.getMontantRetardTotal());
            if(StringUtil.isNotEmpty(dto.getSalaireTotale()))
                item.setSalaireTotale(dto.getSalaireTotale());
            if(StringUtil.isNotEmpty(dto.getCotisationTotal()))
                item.setCotisationTotal(dto.getCotisationTotal());
            if(this.societe && dto.getSociete()!=null)
                item.setSociete(societeConverter.toItem(dto.getSociete())) ;


            if(this.taxeIrEmployes && ListUtil.isNotEmpty(dto.getTaxeIrEmployes()))
                item.setTaxeIrEmployes(taxIrEmployeConverter.toItem(dto.getTaxeIrEmployes()));

        return item;
        }
    }

    @Override
    public TaxIrDto toDto(TaxIr item) {
        if (item == null) {
            return null;
        } else {
            TaxIrDto dto = new TaxIrDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getAnne()))
                dto.setAnne(item.getAnne());
            if(StringUtil.isNotEmpty(item.getMois()))
                dto.setMois(item.getMois());
            if(StringUtil.isNotEmpty(item.getMontantBaseTotal()))
                dto.setMontantBaseTotal(item.getMontantBaseTotal());
            if(StringUtil.isNotEmpty(item.getMontantRetardTotal()))
                dto.setMontantRetardTotal(item.getMontantRetardTotal());
            if(StringUtil.isNotEmpty(item.getSalaireTotale()))
                dto.setSalaireTotale(item.getSalaireTotale());
            if(StringUtil.isNotEmpty(item.getCotisationTotal()))
                dto.setCotisationTotal(item.getCotisationTotal());
        if(this.societe && item.getSociete()!=null) {
            dto.setSociete(societeConverter.toDto(item.getSociete())) ;
        }
        if(this.taxeIrEmployes && ListUtil.isNotEmpty(item.getTaxeIrEmployes())){
            taxIrEmployeConverter.init(true);
            taxIrEmployeConverter.setTaxIr(false);
            dto.setTaxeIrEmployes(taxIrEmployeConverter.toDto(item.getTaxeIrEmployes()));
            taxIrEmployeConverter.setTaxIr(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.taxeIrEmployes = value;
    }

    public void initObject(boolean value) {
        this.societe = value;
    }


    public TaxIrEmployeConverter getTaxIrEmployeConverter(){
        return this.taxIrEmployeConverter;
    }
    public void setTaxIrEmployeConverter(TaxIrEmployeConverter taxIrEmployeConverter ){
        this.taxIrEmployeConverter = taxIrEmployeConverter;
    }
    public EmployeConverter getEmployeConverter(){
        return this.employeConverter;
    }
    public void setEmployeConverter(EmployeConverter employeConverter ){
        this.employeConverter = employeConverter;
    }
    public TauxIrConverter getTauxIrConverter(){
        return this.tauxIrConverter;
    }
    public void setTauxIrConverter(TauxIrConverter tauxIrConverter ){
        this.tauxIrConverter = tauxIrConverter;
    }
    public SocieteConverter getSocieteConverter(){
        return this.societeConverter;
    }
    public void setSocieteConverter(SocieteConverter societeConverter ){
        this.societeConverter = societeConverter;
    }
    public boolean  isSociete(){
        return this.societe;
    }
    public void  setSociete(boolean societe){
        this.societe = societe;
    }
    public boolean  isTaxeIrEmployes(){
        return this.taxeIrEmployes ;
    }
    public void  setTaxeIrEmployes(boolean taxeIrEmployes ){
        this.taxeIrEmployes  = taxeIrEmployes ;
    }
}
