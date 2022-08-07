package com.example.prefixapiuri.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
//@RequestMapping("/app/course")
@RequestMapping("/course")
public class AppCourseAction {

    @GetMapping("/welCome")
    public String awelCome(HttpServletRequest request) {
        return request.getRequestURI();
    }

}
