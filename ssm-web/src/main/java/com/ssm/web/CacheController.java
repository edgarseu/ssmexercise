package com.ssm.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by caozy on 2018/1/8.
 */
@RestController
public class CacheController {


    @RequestMapping( value = "/cache")
    public String  flushCache(Model model){
        model.addAttribute("vo", "hello");
        return "cache";
    }
}
