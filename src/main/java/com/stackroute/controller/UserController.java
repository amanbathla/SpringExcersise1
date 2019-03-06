package com.stackroute.controller;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {


    @RequestMapping("/hello")
    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){

        // map.addAttribute("greeting","Welcome to Stackroute!");
        int i = Integer.parseInt(request.getParameter("t1"));
        int j = Integer.parseInt(request.getParameter("t2"));

        int k = i+j;

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("result",k);

        return modelAndView;
    }


    @RequestMapping("/hello1")
    public ModelAndView add1(HttpServletRequest request, HttpServletResponse response){

        // map.addAttribute("greeting","Welcome to Stackroute!");
        String usernmae = request.getParameter("t1");
        String password = request.getParameter("t1");



        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello1");
        modelAndView.addObject("username",usernmae);
        modelAndView.addObject("password",password);

        return modelAndView;
    }

//    @RequestMapping("/hello")
//    public String greet(Model model){
//
//        model.addAttribute("username","aman bathla");1
//
//        return "hello";
//    }
//
//    @RequestMapping("/hello2")
//    public String greet1(ModelMap modelMap){
//        //to do
//        return "hello2";
//    }
//
//    @RequestMapping("/hello3")
//    public String greet2(ModelAndView modelAndView){
//        //to do
//        return "hello3";
//    }


}
