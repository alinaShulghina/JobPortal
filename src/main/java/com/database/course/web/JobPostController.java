package com.database.course.web;

import com.database.course.service.JobpostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alin- on 01.12.2017.
 */
@Controller
public class JobPostController {
    @Autowired
    private JobpostService jobpostService;

    //get all available positions
    @RequestMapping("/positions")
    public String findAllPositions(Model model){
        model.addAttribute("posts",jobpostService.findAll());
        return "fragments/jobposts/index";
    }

    //get positions in particular city
    @RequestMapping("/positions/{cityName}")
    public String findPositionsByCity(Model model, @PathVariable String cityName){
        model.addAttribute("posts",jobpostService.findByCity(cityName));
        return "fragments/jobposts/index";
    }
}
