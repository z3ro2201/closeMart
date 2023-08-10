package zer0.project.closeMart.service;

import zer0.project.closeMart.dto.martListDto;
import java.util.List;

public interface MartListService {
    List<martListDto> getMartList(String zone, String city, String martOperator);
}
