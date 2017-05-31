package com.dynatic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yyhyo on 2017-06-01.
 */
@RestController
public class MainController {
    @RequestMapping("/")
    public String index(){
        return "hello";
    }
}
