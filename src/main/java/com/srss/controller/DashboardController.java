package com.srss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.srss.service.DashboardService;

@Controller
public class DashboardController {
	
	@Autowired
	private DashboardService dashboardService;
	
	
	@GetMapping("/")
	public String listStudents(Model model, @AuthenticationPrincipal UserDetails userDetails) {

//		String userName = userDetails.getUsername();
//		String userRole = userDetails.getAuthorities().stream().map(it -> it.getAuthority()).toList().get(0);
//		model.addAttribute(USER_LOGIN, userName);

		model.addAttribute("patients", dashboardService.getAllPatient());
		System.out.println("tes");
		System.out.println(dashboardService.getAllPatient().get(0).getFullName());
//		model.addAttribute("UserRole", userRole);
		return "patients";
	}
}
