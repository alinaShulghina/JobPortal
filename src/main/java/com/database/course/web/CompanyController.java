package com.database.course.web;

import com.database.course.model.Company;
import com.database.course.service.CompanyService;
import com.database.course.service.JobpostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * Created by alin- on 01.12.2017.
 */
@Controller
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private JobpostService jobpostService;

    @RequestMapping("/companies")
    public String showAllCompanies(Model model){
        model.addAttribute("companies",companyService.findAll());
        return "fragments/companies/index";
    }

    @RequestMapping("/companies/{companyId}")
    public String showCompanyById(Model model, @PathVariable int companyId){
        model.addAttribute("company",companyService.findById(companyId));
        model.addAttribute("positions",jobpostService.findByCompanyId(companyId));
        return "fragments/companies/details";
    }

    @RequestMapping("companies/add")
    public String newCompanyForm(Model model){
        if(!model.containsAttribute("company")) {
            model.addAttribute("company",new Company());
        }
        model.addAttribute("action","/companies");
        model.addAttribute("heading","New Company");
        model.addAttribute("submit","Add");
        return "fragments/companies/form";
    }

    // Add a company
    @RequestMapping(value = "/companies", method = RequestMethod.POST)
    public String addCategory(@Valid Company company, BindingResult result, RedirectAttributes redirectAttributes) {

        if(result.hasErrors()) {
            redirectAttributes.addFlashAttribute("company",company);
            return "redirect:/companies/add";
        }
        companyService.save(company);
        return "redirect:/companies";
    }

}
