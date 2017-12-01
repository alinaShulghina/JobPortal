package com.database.course.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alin- on 01.12.2017.
 */
@Controller
public class PositionController {

    @RequestMapping("/")
    public String showPositions(Model model){
        return "fragments/positions/layout";
    }
}
