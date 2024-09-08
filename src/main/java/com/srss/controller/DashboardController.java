package com.srss.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
	
//	@Autowired
//	private PatientService dashboardService;
	
	public static final String USER_LOGIN = "userLogin";

	
	
	@GetMapping("/")
	public String listStudents(Model model, @AuthenticationPrincipal UserDetails userDetails) {

		String userName = userDetails.getUsername();
		String userRole = userDetails.getAuthorities().stream().map(it -> it.getAuthority()).toList().get(0);
		model.addAttribute(USER_LOGIN, userName);

//		model.addAttribute("patients", dashboardService.getAllPatient());
//		System.out.println("tes");
		model.addAttribute("UserRole", userRole);
		return "dashboard";
	}
}
