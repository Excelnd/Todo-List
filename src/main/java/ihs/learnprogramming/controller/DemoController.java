package ihs.learnprogramming.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    // http://localhost:8080/todo-list/welcome
    @GetMapping("welcome")
    public String welcome() {
        return "welcome";
    }
}
