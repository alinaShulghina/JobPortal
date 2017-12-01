package com.database.course.web;

import com.database.course.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alin- on 01.12.2017.
 */
@Controller
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping("/companies")
    public String findAllCompanies(Model model){
        model.addAttribute("companies",companyService.findAll());
        return "fragments/companies/index";
    }
}
