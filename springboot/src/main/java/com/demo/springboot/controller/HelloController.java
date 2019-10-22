package com.demo.springboot.controller;

import com.demo.springboot.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //公开一个方法hello
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(String name) {
        if (name.equals("Frank")) {
            return "hello spring boot!! your name is " + name;
        } else if (name.equals("Chen")) {
            return "hello! I'm " + name;
        } else {
            return "hello " + name;
        }

    }

    @ResponseBody
    @RequestMapping("/")
    public String root() {
        return "only support /hello?name=*** and /service";

    }

    @Autowired
    private
    HelloService helloService;

    @ResponseBody
    @RequestMapping("/service")
    public String helloService() {
        return helloService.sayHello();
    }

}
