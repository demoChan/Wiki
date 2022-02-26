package com.demo.wiki.controller;

import com.demo.wiki.domain.Test;
import com.demo.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController     //返回字符串
/* @Controller     //返回页面 */
public class TestController {

    @Value("${test.hello:TEST}")
    private String testHello;

    @Resource
    private TestService testService;

/*
    * 增删改查GET,POST,PUT,DELETE
    * @return
    * 传统风格：/user?id=1
    * restful风格：/user/1
    * @RequestMapping接口支持所有请求方式（GetMapping,PostMapping...)
    */

//    @RequestMapping

//    @PostMapping
//    @PutMapping
//    @DeleteMapping
//    @RequestMapping(value = "hello",method = RequestMethod.GET )   //http请求总共有8种请求方式
    @GetMapping("/hello")      //405报错时请求method不支持；404表示请求访问不到，没有这个接口
    public String hello() {
        return "Hello World!" + testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World! Post."+ name ;
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }
}
