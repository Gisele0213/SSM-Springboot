package com.tedu.service;

import com.tedu.pojo.User;

import java.util.List;

/**
 * Created by LYJ on 2017/3/19.
 */
public interface UserService {
    public List<User> findAll();

	public void addUser(User user);

	public User findUserById(Integer id);

	public void updateUser(User user);

	public void deleteUser(Integer id);
}
