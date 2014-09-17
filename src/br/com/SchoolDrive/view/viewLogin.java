package br.com.SchoolDrive.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class viewLogin {

	@RequestMapping(value = "/erro")
	public ModelAndView welcome(@RequestParam String erroLogin) {
		ModelAndView model = new ModelAndView("index");
		if (erroLogin.equals("")) {

		}

		return model;
	}
}
