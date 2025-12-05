package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.service.ISeasonFinderService;

@Controller
public class SeasonFinderOperationController {

	
	@Autowired
	private ISeasonFinderService service;
	@RequestMapping("/")
	public String showHome() {
		return "welcome";
	}
	@RequestMapping("/season")
	public String showSeason(Map<String,Object> map) {
		//use service
		String msg=service.findSeason();
		//keep the result in model attribute
		map.put("resultMsg",msg);
		//return LVN
		return "display";
	}
	//@RequestMapping(value="/report",method = RequestMethod.GET)
	@GetMapping("/report")
	public String showReport1()throws Exception{
		System.out.println("SeasonFinderOperationController.showReport1()");
		
		return "report1";
	}
	//@RequestMapping(value="/report",method = RequestMethod.POST)
	@PostMapping("/report")
	public String showReport2()throws Exception{
		System.out.println("SeasonFinderOperationController.showReport2()");
		
		return "report2";
	}
}
