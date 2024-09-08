package com.srss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.srss.service.PatientService;

@Controller
public class PatientController {

	@Autowired
	private PatientService patientService;

	@GetMapping("/patient")
	public String listStudents(Model model) {

		model.addAttribute("patients", patientService.getAllPatient());
		System.out.println(patientService.getAllPatient().get(0).getFullName());
		return "dashboard";
	}
}
