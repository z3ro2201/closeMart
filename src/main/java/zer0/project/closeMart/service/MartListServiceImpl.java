package zer0.project.closeMart.service;

import zer0.project.closeMart.dto.martListDto;
import zer0.project.closeMart.mapper.MartListMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MartListServiceImpl implements MartListService {
    private final MartListMapper martListMapper;

    @Override
    public List<martListDto> getMartList(String zone, String city, String martOperator) {
        return martListMapper.getMartList(zone, city, martOperator);
    }
}