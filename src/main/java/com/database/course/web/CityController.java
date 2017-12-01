package com.database.course.web;


import com.database.course.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alin- on 01.12.2017.
 */
@Controller
public class CityController {

    @Autowired
    private LocationService cityService;

    @RequestMapping("/cities")
    public String getAllCities(Model model){
        model.addAttribute("cities",cityService.findAll());
        return "fragments/cities/index";
    }
}
