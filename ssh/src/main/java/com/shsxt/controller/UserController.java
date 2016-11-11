package com.shsxt.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shsxt.po.User;
import com.shsxt.service.UserService;

@Controller
public class UserController {

	@Resource
	private UserService userService;
	@RequestMapping("queryUser")
	public ModelAndView queryUserById(Integer id){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("user");
		User user=userService.queryUserById(id);
		mv.addObject("user", user);
		return mv;
	}
	
	
}
