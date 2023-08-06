package er0.project.closeMart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(value = "/api/test", method = RequestMethod.GET)
    public Object test() {
        return "hello world!";
    }
}
