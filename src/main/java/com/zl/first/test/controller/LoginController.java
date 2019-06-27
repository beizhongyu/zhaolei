package com.zl.first.test.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class LoginController {
        private Logger logger = LoggerFactory.getLogger(this.getClass());

        @RequestMapping("/getuser")
        public String getUserInfo(Model model, String code){

            return "forward:https://www.baidu.com/";
        }

        @RequestMapping("/testlogin")
        public String testLogin(RedirectAttributes attr, HttpServletRequest request){
            return "redirect:https://www.baidu.com/";
        }

}
