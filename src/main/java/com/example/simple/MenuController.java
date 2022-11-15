package com.example.simple;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MenuController {

	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		String hostname = "";
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			mv.addObject("hostname", InetAddress.getLocalHost());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mv;
	}
	
	@GetMapping("/menu")
	public ModelAndView menu() {
		return new ModelAndView("menu");
	}
	
}
