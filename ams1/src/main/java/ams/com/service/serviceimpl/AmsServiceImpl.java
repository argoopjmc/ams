package ams.com.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ams.com.amsdao.AmsDao;
import ams.com.pojo.UserInfo;
import ams.com.service.AmsService;

@Service
public class AmsServiceImpl implements AmsService {

	@Autowired
	private AmsDao amsDao;
	public List getUserList() {
		return amsDao.getUserList();
	}
	public void saveUser(UserInfo userInfo) {
		amsDao.saveUser(userInfo);
		
	}


}
