package com.offcn.controller;

import com.offcn.bean.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "ani")
public class AnimalController {

    /**
     * @author:anima
     * @description:获得动物的基本信息
     * @return:页面
     */
    @RequestMapping(path = "/")
    public String getAnimal(Model model){
        Animal animal = new Animal(1L,"小猫",3);
        model.addAttribute("animal",animal);
        return "test2";
    }

}
