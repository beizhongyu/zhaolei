package com.zl.first.test.controller;
import com.zl.first.test.service.Result;
import com.zl.first.test.service.impl.ResultSupport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/zl")
@Slf4j
public class TestSpringBootController {

    @RequestMapping(value = {"/first"},method = RequestMethod.GET)
    public Result<String> index(){
        log.info("[STRAT]");
        Result<String> result = new ResultSupport<>();
        result.setSuccess(true);
        result.setModel("hello word");
        return result;
    }


}
