package com.asmr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asmr.repository.UserRepository;
import com.asmr.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userrepository;

	@Transactional
	@Override
	public void insertUser(UserVO uservo) {
		userrepository.insertUser(uservo);
	}

	@Transactional
	@Override
	public boolean checkUserId(String id) {
		if (userrepository.checkUserId(id) == null)
			return true;
		else
			return false;
	}

	@Transactional
	@Override
	public boolean loginUser(UserVO uservo) {
		UserVO temp = userrepository.loginUser(uservo);
		return uservo.getPw().equals(temp.getPw());
	}

	@Transactional
	@Override
	public void updateUser(UserVO uservo) {
		userrepository.updateUser(uservo);
	}

	@Transactional
	@Override
	public void deleteUser(String id) {
		userrepository.deleteUser(id);
	}
}
