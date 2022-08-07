package com.example.prefixapiuri.mini.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
//@RequestMapping("/mini/app/course")
@RequestMapping("/course")
public class MiniAppCourseAction {

    @GetMapping("/welCome")
    public String welCome(HttpServletRequest request) {
        return request.getRequestURI();
    }

}
