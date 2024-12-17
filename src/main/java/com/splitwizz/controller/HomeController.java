package com.splitwizz.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String welcome(){
        return "Welcome to SplitWizz – Your ultimate solution for effortless expense management. SplitWizz helps you track, manage, and split expenses seamlessly with friends, family, or colleagues. Whether it's a group trip, a shared meal, or ongoing expenses, SplitWizz ensures fairness and transparency, allowing you to focus on what really matters. Stay tuned as we continue to develop exciting features designed to simplify your financial collaborations!";
    }

    @GetMapping("api/test")
    public String test(){
        return "test";
    }
}
