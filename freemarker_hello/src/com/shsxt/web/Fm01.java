package com.shsxt.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shsxt.po.User;

@WebServlet("/fm01")
public class Fm01 extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setAttribute("usertemp", "dw");
		
		req.setAttribute("numb", 200);
		req.setAttribute("doub", 2.01);
		req.setAttribute("date", new Date());
		
		List list=new ArrayList();
		list.add("虾");
		list.add("鱼");
		list.add("蟹");
		req.setAttribute("list", list);
		
		User user=new User();
		user.setId(1);
		user.setAddr("xixihaha");
		req.setAttribute("user", user);
		List list2 =new ArrayList();
		for (int i = 0; i < 10; i++) {
			User user2=new User();
			user2.setId(i);
			user2.setAddr("qqqqqqqqqqq");
			list2.add(user2);
		}
		req.setAttribute("aa", list2);
		
		
		Map<String , String > map=new HashMap<String, String>();
		map.put("1", "111");
		map.put("2", "2222");
		map.put("3", "3333");
		map.put("4", "44444");
		req.setAttribute("mm", map);
		
		req.setAttribute("cj", 88);
		
		req.getRequestDispatcher("templates/test01.ftl").forward(req, resp);
		
	}
}
