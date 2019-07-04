package ams.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ams.com.service.AmsService;

@Controller
@SuppressWarnings({"rawtypes","unchecked"})
@RequestMapping(name="/attn")
public class AmsAttnController {
	
	@Autowired(required=true)
	private AmsService amsService;
	
	
	@RequestMapping(name="/markattn", method = RequestMethod.GET,produces={"application/json","application/xml"})
	public @ResponseBody ResponseEntity<List> testService(){
		List list = amsService.getUserList();
		return new ResponseEntity(list,HttpStatus.OK);
	}
	
	
	
	
}
