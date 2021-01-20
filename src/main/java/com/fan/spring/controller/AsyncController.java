package com.fan.spring.controller;

import com.fan.spring.service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/async")
public class AsyncController {

    @Autowired
    private AsyncService asyncService;

    @GetMapping("/page")
    public String asyncPage() {
        System.out.println("请求线程名称：[" + Thread.currentThread().getName() + "]");
        asyncService.generateReport();
        return "async";
    }
}
