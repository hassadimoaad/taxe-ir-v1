package  ma.sir.cnss.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.sir.cnss.zynerator.util.StringUtil;
import ma.sir.cnss.zynerator.converter.AbstractConverter;
import ma.sir.cnss.zynerator.util.DateUtil;
import ma.sir.cnss.bean.history.TauxIrHistory;
import ma.sir.cnss.bean.core.TauxIr;
import ma.sir.cnss.ws.dto.TauxIrDto;

@Component
public class TauxIrConverter extends AbstractConverter<TauxIr, TauxIrDto, TauxIrHistory> {


    public  TauxIrConverter(){
        super(TauxIr.class, TauxIrDto.class, TauxIrHistory.class);
    }

    @Override
    public TauxIr toItem(TauxIrDto dto) {
        if (dto == null) {
            return null;
        } else {
        TauxIr item = new TauxIr();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getPourcentage()))
                item.setPourcentage(dto.getPourcentage());
            if(StringUtil.isNotEmpty(dto.getSalaireMax()))
                item.setSalaireMax(dto.getSalaireMax());
            if(StringUtil.isNotEmpty(dto.getSalaireMin()))
                item.setSalaireMin(dto.getSalaireMin());


        return item;
        }
    }

    @Override
    public TauxIrDto toDto(TauxIr item) {
        if (item == null) {
            return null;
        } else {
            TauxIrDto dto = new TauxIrDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getPourcentage()))
                dto.setPourcentage(item.getPourcentage());
            if(StringUtil.isNotEmpty(item.getSalaireMax()))
                dto.setSalaireMax(item.getSalaireMax());
            if(StringUtil.isNotEmpty(item.getSalaireMin()))
                dto.setSalaireMin(item.getSalaireMin());


        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
