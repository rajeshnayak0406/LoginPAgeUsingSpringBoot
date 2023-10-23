package com.test.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.admin.Admin;
import com.test.service.LoginService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

	@Autowired
	private LoginService adminService;

	@GetMapping("/login")

	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("admin", new Admin());
		return mav;
	}

	@PostMapping("/login")
	public String login(@ModelAttribute("admin") Admin admin) {

		Admin addsuccess = adminService.login(admin.getUsername(), admin.getPassword());

		System.out.println(addsuccess);
		if (Objects.nonNull(addsuccess)) {

			return "redirect:/";

		} else {
			return "redirect:/login";

		}
	}

	@RequestMapping(value = { "/logout" }, method = RequestMethod.POST)
	public String logoutDo(HttpServletRequest request, HttpServletResponse response) {

		return "redirect:/login";
	}

}
