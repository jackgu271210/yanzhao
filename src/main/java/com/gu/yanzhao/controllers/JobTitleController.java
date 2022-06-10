package com.gu.yanzhao.controllers;

import com.gu.yanzhao.models.JobTitle;
import com.gu.yanzhao.services.JobTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Controller
public class JobTitleController {

    @Autowired
    private JobTitleService jobTitleService;

    @GetMapping("/jobTitle")
    public String goJobTitle(Model model) {
        model.addAttribute("jobTitles",jobTitleService.getJobTitle());
        return "JobTitle";
    }

    @PostMapping("/jobTitle/add")
    public String addJobTitle(JobTitle jobTitle) {
        jobTitleService.save(jobTitle);
        return "redirect:/jobTitle";
    }

    @RequestMapping("jobTitle/findById")
    @ResponseBody
    public Optional<JobTitle> findById(Integer id) {
        return jobTitleService.findById(id);
    }

    @RequestMapping("/jobTitle/update")
    public String update(JobTitle jobTitle) {
        jobTitleService.save(jobTitle);
        return "redirect:/jobTitle";
    }

    @RequestMapping("/jobTitle/delete")
    public String delete(Integer id) {
        jobTitleService.delete(id);
        return "redirect:/jobTitle";
    }
}
