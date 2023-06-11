package  ma.sir.cnss.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.cnss.zynerator.util.StringUtil;
import ma.sir.cnss.zynerator.converter.AbstractConverter;
import ma.sir.cnss.zynerator.util.DateUtil;
import ma.sir.cnss.bean.history.SocieteHistory;
import ma.sir.cnss.bean.core.Societe;
import ma.sir.cnss.ws.dto.SocieteDto;

@Component
public class SocieteConverter extends AbstractConverter<Societe, SocieteDto, SocieteHistory> {


    public  SocieteConverter(){
        super(Societe.class, SocieteDto.class, SocieteHistory.class);
    }

    @Override
    public Societe toItem(SocieteDto dto) {
        if (dto == null) {
            return null;
        } else {
        Societe item = new Societe();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getIce()))
                item.setIce(dto.getIce());
            if(StringUtil.isNotEmpty(dto.getSiege()))
                item.setSiege(dto.getSiege());
            if(dto.getBloqued() != null)
                item.setBloqued(dto.getBloqued());


        return item;
        }
    }

    @Override
    public SocieteDto toDto(Societe item) {
        if (item == null) {
            return null;
        } else {
            SocieteDto dto = new SocieteDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getIce()))
                dto.setIce(item.getIce());
            if(StringUtil.isNotEmpty(item.getSiege()))
                dto.setSiege(item.getSiege());
                dto.setBloqued(item.getBloqued());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
