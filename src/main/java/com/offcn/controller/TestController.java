package com.offcn.controller;

import com.offcn.po.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Thymeleaf模板引擎,往前台传值
 */
@Controller
public class TestController {

    @RequestMapping("/test1")
    public String test1(Model model){
        Person person = new Person(1L,"小明",22);
        model.addAttribute("title","测试页面");
        model.addAttribute("test","yes");
        model.addAttribute("name","百度");
        model.addAttribute("gname","谷歌");
        model.addAttribute("href","http:www.baidu.com");
        model.addAttribute("person",person);
        return "test1";
    }

    @RequestMapping("/test2")
    public String test2(Model model){
        List<Person> list = new ArrayList<>();
        list.add(new Person(1L,"小明",22));
        list.add(new Person(2L,"小红",23));
        list.add(new Person(3L,"小亮",24));
        list.add(new Person(4L,"小兰",25));
        model.addAttribute("list",list);
        model.addAttribute("menu","admin");
        model.addAttribute("role","role");
        return "test2";
    }


}
