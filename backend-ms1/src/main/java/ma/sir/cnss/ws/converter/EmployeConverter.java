package  ma.sir.cnss.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.cnss.zynerator.util.StringUtil;
import ma.sir.cnss.zynerator.converter.AbstractConverter;
import ma.sir.cnss.zynerator.util.DateUtil;
import ma.sir.cnss.bean.history.EmployeHistory;
import ma.sir.cnss.bean.core.Employe;
import ma.sir.cnss.ws.dto.EmployeDto;

@Component
public class EmployeConverter extends AbstractConverter<Employe, EmployeDto, EmployeHistory> {


    public  EmployeConverter(){
        super(Employe.class, EmployeDto.class, EmployeHistory.class);
    }

    @Override
    public Employe toItem(EmployeDto dto) {
        if (dto == null) {
            return null;
        } else {
        Employe item = new Employe();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCnss()))
                item.setCnss(dto.getCnss());
            if(StringUtil.isNotEmpty(dto.getNom()))
                item.setNom(dto.getNom());
            if(StringUtil.isNotEmpty(dto.getPrenom()))
                item.setPrenom(dto.getPrenom());


        return item;
        }
    }

    @Override
    public EmployeDto toDto(Employe item) {
        if (item == null) {
            return null;
        } else {
            EmployeDto dto = new EmployeDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCnss()))
                dto.setCnss(item.getCnss());
            if(StringUtil.isNotEmpty(item.getNom()))
                dto.setNom(item.getNom());
            if(StringUtil.isNotEmpty(item.getPrenom()))
                dto.setPrenom(item.getPrenom());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
