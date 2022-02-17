package com.example.controller;

import com.example.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testController {

    /**
     * 集成Thymeleaf模板引擎
     * @param model
     * @return
     */
    @GetMapping("/say")
    public String test1(Model model){
        User user = new User();
        user.setAge(24);
        user.setId(1);
        user.setName("文聪");
        model.addAttribute("data","springboot集成Thymeleaf模板");
        model.addAttribute("user",user);
        return "user";
    }
//    @GetMapping("/say")
//    public ModelAndView test1(ModelAndView modelAndView){
//        modelAndView.addObject("data","springboot集成Thymeleaf模板");
//        modelAndView.setViewName("user");
//        return modelAndView;
//    }

    @GetMapping("/user")
    public ModelAndView user(){
        User user = new User();
        user.setAge(24);
        user.setId(1);
        user.setName("文聪");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
