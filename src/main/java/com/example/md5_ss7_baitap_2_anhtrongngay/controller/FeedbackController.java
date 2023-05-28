package com.example.md5_ss7_baitap_2_anhtrongngay.controller;

import com.example.md5_ss7_baitap_2_anhtrongngay.model.Feedback;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FeedbackController {
    @GetMapping
    public String show(Model model) {
        model.addAttribute("feedback", new Feedback());
        return "/index";
    }
}
