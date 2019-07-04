package ams.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ams.com.pojo.UserInfo;
import ams.com.service.AmsService;

@Controller
@SuppressWarnings({"rawtypes","unchecked"})
//@RequestMapping(name="/")
public class AmsRestController {
	
	@Autowired(required=true)
	private AmsService amsService;
	
	@RequestMapping("/")
    public String welcome() {//Welcome page, non-rest
        return "index";
    }
	@RequestMapping(name="/test", method = RequestMethod.GET,produces={"application/json","application/xml"})
	public @ResponseBody ResponseEntity<List> testService(){
		List list = amsService.getUserList();
		return new ResponseEntity(list,HttpStatus.OK);
	}
	
	@RequestMapping(name="/test1", method = RequestMethod.POST,produces={"application/json","application/xml"})
	public @ResponseBody ResponseEntity<List> testService1(){
		UserInfo userInfo = new UserInfo();
		userInfo.setDevice_ID("a");
		userInfo.setEmployeeId("123");
		userInfo.setUserName("abc");
		amsService.saveUser(userInfo);
		return new ResponseEntity(HttpStatus.OK);
	}
	
	
}
