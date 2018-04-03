package com.zl.first.test.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/zl")
public class TestSpringBootController {
 /*   @Autowired
    private UserService userService;*/

    @RequestMapping(value = "/first")
    public String index(){
        return "hello word";
    }
}
