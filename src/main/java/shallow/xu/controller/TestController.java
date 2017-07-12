package shallow.xu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zhao.Xu on 2017/7/6.
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {
    @RequestMapping
    public String execute() {
        return "success";
    }
}
