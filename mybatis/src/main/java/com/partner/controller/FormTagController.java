package com.partner.controller;

import java.util.ArrayList;
import java.util.List;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.partner.model.Car;
import com.partner.model.User;

@Controller
public class FormTagController {
 
	@RequestMapping("/toForm")
	public String toForm(Model model)
	{
//		User user=new User();
//		user.setUsername("张三");
//		user.setPassword("1111");
//		
//		user.setGender("女");
//		
//		List<String> allMobileSys=new ArrayList<String>();
//		allMobileSys.add("android");
//		allMobileSys.add("ios");
//		allMobileSys.add("winphone");
//		allMobileSys.add("ubuntu");
//		
//		user.setMobilesys("winphone");
//		
//		user.setAgree(false);
//		
//		List<String> telcols=new ArrayList<String>();
//		telcols.add("画画");
//		telcols.add("游泳");
///*		telcols.add("编程");
//		telcols.add("足球");*/
//		
//		user.setTelcols(telcols);
//		
//		List<Car> allCarList=new ArrayList<Car>();
//		
//		Car car01=new Car("宝马","粤A000001",1000000.00f);
//		Car car02=new Car("奔驰","粤A000002",1000000.00f);
//		Car car03=new Car("奇瑞","粤A000003",100000.00f);
//		Car car04=new Car("奥迪","粤A000004",1100000.00f);
//		Car car05=new Car("QQ","粤A000005",50000.00f);
//		
//		allCarList.add(car01);
//		allCarList.add(car02);
//		allCarList.add(car03);
//		allCarList.add(car04);
//		allCarList.add(car05);
//		
//		List<Car> userCarlist=new ArrayList<Car>();
//		userCarlist.add(car01);
//		userCarlist.add(car02);
//		userCarlist.add(car04);
//		
//		user.setCarlist(userCarlist);
//		
//		user.setCountry("美国");
//		
//		List<String> allCountry=new ArrayList<String>();
//		allCountry.add("中国");
//		allCountry.add("美国");
//		allCountry.add("澳大利亚");
//		allCountry.add("沙特");
// 
//		model.addAttribute("user", user);
//		model.addAttribute("allmobilesys", allMobileSys);
//		model.addAttribute("allCarList", allCarList);
//		model.addAttribute("allCountry", allCountry);
 
		return "form";
	}
	
	@RequestMapping("/saveUser")
	public String saveUser( User user,Model model) {
		//model.addAttribute("user", user);
//		String mobilesys = user.getMobilesys();
//		System.out.println("mobilesys="+mobilesys);
//		List<String> telcols = user.getTelcols();
//		List<String> carLists = user.getCarLists();
//		for(String telcol:telcols) {
//			System.out.println("telcol="+telcol);
//		}
//		for(String car:carLists) {
//			System.out.println("car="+car);
//		}
		return "list";
	}
	
}
