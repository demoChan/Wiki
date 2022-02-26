package com.demo.wiki.controller;

import com.demo.wiki.domain.Demo;
import com.demo.wiki.service.DemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;


@RestController     //返回字符串
@RequestMapping("/demo")
public class DemoController {

    @Resource
    private DemoService demoService;


    @GetMapping("/list")
    public List<Demo> list() {
        return demoService.list();
    }
}
