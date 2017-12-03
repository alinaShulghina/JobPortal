package com.database.course.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alin- on 02.12.2017.
 */
@Controller
public class LoginController {

    @RequestMapping("/login")
    public String loginForm(){
        return "/fragments/loginform";
    }
}
