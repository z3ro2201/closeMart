package zer0.project.closeMart.mapper;

import zer0.project.closeMart.dto.martListDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MartListMapper {
    List<martListDto> getMartList();
}
