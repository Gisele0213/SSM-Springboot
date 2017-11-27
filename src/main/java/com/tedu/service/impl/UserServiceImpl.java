package com.tedu.service.impl;

import com.tedu.mapper.UserMapper;
import com.tedu.pojo.User;
import com.tedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LYJ on 2017/3/19.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

	@Override
	public void addUser(User user) {
		userMapper.addUser(user);
		
	}

	@Override
	public User findUserById(Integer id) {
		
		return userMapper.findUserById(id);
	}

	@Override
	public void updateUser(User user) {
		
		userMapper.updateUser(user);
		
	}

	@Override
	public void deleteUser(Integer id) {
		
		userMapper.deleteUser(id);
		
	}
}
