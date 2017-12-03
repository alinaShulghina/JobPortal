package com.database.course.web;

import com.database.course.service.JobSeekerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by alin- on 03.12.2017.
 */
@Controller
public class JobSeekerController {

    @Autowired
    private JobSeekerService jobSeekerService;

    @RequestMapping("/jobseekers")
    public String findAllJobseekers(Model model){
        model.addAttribute("seekers",jobSeekerService.findAll());
        return "fragments/jobseekers/index";
    }

    @RequestMapping("/jobseekers/{jobseekerId}")
    public String findAllJobseekers(Model model, @PathVariable int jobseekerId){
        model.addAttribute("seeker",jobSeekerService.findById(jobseekerId));
        return "fragments/jobseekers/details";
    }
}
