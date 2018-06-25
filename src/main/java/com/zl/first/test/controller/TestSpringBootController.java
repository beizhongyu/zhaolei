package com.zl.first.test.controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/zl")
@Slf4j
public class TestSpringBootController {

    @RequestMapping(value = "/first")
    public String index(){
        log.info("[STRAT]");
        return "hello word";
    }
}
