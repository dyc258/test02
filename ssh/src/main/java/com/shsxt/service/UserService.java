package com.shsxt.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.shsxt.dao.UserDao;
import com.shsxt.po.User;

@Service
public class UserService {

	@Resource
	private UserDao userDao;
	public User queryUserById(Integer id){
		return userDao.queryUserById(id);
	}
}
