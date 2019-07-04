package ams.com.service;

import java.util.List;

import ams.com.pojo.UserInfo;

public interface AmsService {
	public List getUserList();

	public void saveUser(UserInfo userInfo);

}
