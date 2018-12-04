package com.example.demo.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.example.demo.entity.TUser;
import com.example.demo.mapper.UserMapper;
import com.example.demo.mybatis.DBTools;
import com.example.demo.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService {

	@Override
	public TUser getUser(Integer id) {
		// TODO Auto-generated method stub
		SqlSession session=DBTools.getSession();
		UserMapper mapper=session.getMapper(UserMapper.class);
		TUser user=mapper.getUser(id);
		return user;
	}

}
