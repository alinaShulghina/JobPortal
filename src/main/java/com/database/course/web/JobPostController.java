package com.database.course.web;

import com.database.course.model.JobPost;
import com.database.course.service.*;
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
public class JobPostController {
    @Autowired
    private JobpostService jobpostService;

    @Autowired
    private SkillService skillService;

    @Autowired
    private CompanyService companyService;

    @Autowired
    private LocationService locationService;

    @Autowired
    private JobTypeService jobTypeService;

    @Autowired
    private JobTitleService jobTitleService;

    //get all available positions
    @RequestMapping("/positions")
    public String findAllPositions(Model model){
        model.addAttribute("posts",jobpostService.findAll());
        return "fragments/jobposts/index";
    }


    @RequestMapping("positions/add")
    public String newPositionForm(Model model){
        if(!model.containsAttribute("jobpost")) {
            model.addAttribute("jobpost",new JobPost());
        }
        model.addAttribute("action","/positions");
        model.addAttribute("heading","New Position");
        model.addAttribute("titles",jobTitleService.findAll());
        model.addAttribute("allSkills",skillService.findAll());
        model.addAttribute("types",jobTypeService.findAll());
        model.addAttribute("companies",companyService.findAll());
        model.addAttribute("locations",locationService.findAll());
        model.addAttribute("submit","Add");
        return "fragments/jobposts/form";
    }

    // Add a category
    @RequestMapping(value = "/positions", method = RequestMethod.POST)
    public String addCategory(@Valid JobPost jobPost, BindingResult result, RedirectAttributes redirectAttributes) {
//        if(result.hasErrors()) {
//            redirectAttributes.addFlashAttribute("jobpost",jobPost);
//            return "redirect:/positions/add";
//        }
        jobpostService.save(jobPost);
        return "redirect:/positions";
    }

    @RequestMapping(value = "/positions/{positionId}")
    public String showPositionById(Model model, @PathVariable int positionId){
        model.addAttribute("position",jobpostService.findById(positionId));
        return "fragments/jobposts/details";
    }
}
