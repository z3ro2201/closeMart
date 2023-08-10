package zer0.project.closeMart.mapper;

import org.apache.ibatis.annotations.Param;
import zer0.project.closeMart.dto.martListDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MartListMapper {
    List<martListDto> getMartList(@Param("zone") String zone, @Param("city") String city, @Param("martOperator") String martOperator);

}
