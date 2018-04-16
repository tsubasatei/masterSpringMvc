package com.xt.masterspringmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xt on 2018/4/15.
 *
 * @Description: hello
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(@RequestParam("name") String username, Model model) throws Exception {
        model.addAttribute("message", "Hello, " + username);
        return "resultPage";
    }
}
