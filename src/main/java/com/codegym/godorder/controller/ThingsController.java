package com.codegym.godorder.controller;

import com.codegym.godorder.model.Thing;
import com.codegym.godorder.service.ThingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ThingsController {

    @Autowired
    private ThingsService thingsService;


    @GetMapping("/")
    public ModelAndView start(){
        ModelAndView modelAndView = new ModelAndView("/viewCreatedThings");
        Iterable<Thing> things = thingsService.findAll();
        modelAndView.addObject("things",things);
        return modelAndView;
    }

    @GetMapping("/createThing")
    public ModelAndView showCreatForm(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("thing",new Thing());
        return modelAndView;
    }

    @PostMapping("/createThing")
    public ModelAndView saveThing(@ModelAttribute("newThing") Thing thing){
        thingsService.save(thing);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("thing",thing);
        modelAndView.addObject("message","New Thing was created successfully");
        return modelAndView;
    }
}
