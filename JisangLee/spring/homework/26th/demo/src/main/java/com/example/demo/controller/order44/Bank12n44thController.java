package com.example.demo.controller.order44;

import com.example.demo.entity.order44.StudentScoreManagement;
import com.example.demo.service.order44.StudentScoreManagementService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/44th/student")
public class Bank12n44thController {

    @Autowired
    private StudentScoreManagementService studentScoreManagementService;

    @GetMapping("/register")
    public String register(StudentScoreManagement studentScoreManagement) {
        log.info("registerForm");

        return "/44th/student/register";
    }

    @PostMapping("/register")
    public String register(StudentScoreManagement studentScoreManagement, Model model){
        log.info("DB register - StudentScoreManagement 정보: " + studentScoreManagement );

        studentScoreManagementService.register(studentScoreManagement);

        return "/44th/student/success";

    }

    @GetMapping("/list")
    public String list (Model model){
        log.info("list");

        model.addAttribute("list", studentScoreManagementService.list());
        return "/44th/student/list";
    }





}





