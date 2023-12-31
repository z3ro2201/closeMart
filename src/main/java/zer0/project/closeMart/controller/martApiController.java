package zer0.project.closeMart.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestParam;
import zer0.project.closeMart.dto.martListDto;
import zer0.project.closeMart.service.MartListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class martApiController {
    private final MartListService martListService;

    @RequestMapping(value = "/api/test", method = RequestMethod.GET)
    public Object test() {
        return "hello world!";
    }

    @RequestMapping(value = "/api/closeMart", method = RequestMethod.GET)
    public List<martListDto> getMartList(@RequestParam(required = false) String zone,
                                         @RequestParam(required = false) String city,
                                         @RequestParam(required = false) String martOperator) {
        return martListService.getMartList(zone, city, martOperator);
    }
}
