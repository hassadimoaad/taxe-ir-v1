package  ma.sir.cnss.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.sir.cnss.bean.core.TaxIr;

import ma.sir.cnss.zynerator.util.StringUtil;
import ma.sir.cnss.zynerator.converter.AbstractConverter;
import ma.sir.cnss.zynerator.util.DateUtil;
import ma.sir.cnss.bean.history.TaxIrEmployeHistory;
import ma.sir.cnss.bean.core.TaxIrEmploye;
import ma.sir.cnss.ws.dto.TaxIrEmployeDto;

@Component
public class TaxIrEmployeConverter extends AbstractConverter<TaxIrEmploye, TaxIrEmployeDto, TaxIrEmployeHistory> {

    @Autowired
    private EmployeConverter employeConverter ;
    @Autowired
    private TauxIrConverter tauxIrConverter ;
    @Autowired
    private TaxIrConverter taxIrConverter ;
    private boolean employe;
    private boolean tauxIr;
    private boolean taxIr;

    public  TaxIrEmployeConverter(){
        super(TaxIrEmploye.class, TaxIrEmployeDto.class, TaxIrEmployeHistory.class);
    }

    @Override
    public TaxIrEmploye toItem(TaxIrEmployeDto dto) {
        if (dto == null) {
            return null;
        } else {
        TaxIrEmploye item = new TaxIrEmploye();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getSalaireNet()))
                item.setSalaireNet(dto.getSalaireNet());
            if(StringUtil.isNotEmpty(dto.getSalaireBrut()))
                item.setSalaireBrut(dto.getSalaireBrut());
            if(this.employe && dto.getEmploye()!=null)
                item.setEmploye(employeConverter.toItem(dto.getEmploye())) ;

            if(this.tauxIr && dto.getTauxIr()!=null)
                item.setTauxIr(tauxIrConverter.toItem(dto.getTauxIr())) ;

            if(dto.getTaxIr() != null && dto.getTaxIr().getId() != null){
                item.setTaxIr(new TaxIr());
                item.getTaxIr().setId(dto.getTaxIr().getId());
            }



        return item;
        }
    }

    @Override
    public TaxIrEmployeDto toDto(TaxIrEmploye item) {
        if (item == null) {
            return null;
        } else {
            TaxIrEmployeDto dto = new TaxIrEmployeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getSalaireNet()))
                dto.setSalaireNet(item.getSalaireNet());
            if(StringUtil.isNotEmpty(item.getSalaireBrut()))
                dto.setSalaireBrut(item.getSalaireBrut());
        if(this.employe && item.getEmploye()!=null) {
            dto.setEmploye(employeConverter.toDto(item.getEmploye())) ;
        }
        if(this.tauxIr && item.getTauxIr()!=null) {
            dto.setTauxIr(tauxIrConverter.toDto(item.getTauxIr())) ;
        }
        if(this.taxIr && item.getTaxIr()!=null) {
            dto.setTaxIr(taxIrConverter.toDto(item.getTaxIr())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.employe = value;
        this.tauxIr = value;
        this.taxIr = value;
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
    public TaxIrConverter getTaxIrConverter(){
        return this.taxIrConverter;
    }
    public void setTaxIrConverter(TaxIrConverter taxIrConverter ){
        this.taxIrConverter = taxIrConverter;
    }
    public boolean  isEmploye(){
        return this.employe;
    }
    public void  setEmploye(boolean employe){
        this.employe = employe;
    }
    public boolean  isTauxIr(){
        return this.tauxIr;
    }
    public void  setTauxIr(boolean tauxIr){
        this.tauxIr = tauxIr;
    }
    public boolean  isTaxIr(){
        return this.taxIr;
    }
    public void  setTaxIr(boolean taxIr){
        this.taxIr = taxIr;
    }
}
