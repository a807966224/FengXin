package com.example.prefixapiuri.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
//@RequestMapping("/admin/course")
@RequestMapping("/course")
public class AdminCourseAction {

    @GetMapping("/welCome")
    public String welCome(HttpServletRequest request) {
        return request.getRequestURI();
    }

}
