package ams.com.amsdao;

import java.util.List;

import ams.com.pojo.UserInfo;

public interface AmsDao {
	public List getUserList();

	public void saveUser(UserInfo userInfo);
}
