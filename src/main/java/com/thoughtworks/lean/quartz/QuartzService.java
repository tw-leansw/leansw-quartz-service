package com.thoughtworks.lean.quartz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by yongliuli on 7/27/16.
 */

@SpringBootApplication
@EnableAutoConfiguration
@Controller
public class QuartzService {
    @RequestMapping("/")
    public void index(HttpServletResponse response) throws IOException {
        response.sendRedirect("/ui/quartz/jobs");
    }
    public static void main(String[] args) {
        SpringApplication.run(QuartzService.class, args);
    }
}
