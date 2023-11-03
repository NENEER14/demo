package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.ui.*;

@Controller
public class SampleController {

    @GetMapping("/")
    public String showSampleForm(Model model){
        return "welcomePage";
    }
}
