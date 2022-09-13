package com.teampj.shop.check;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/check/**")
public class CheckController {

	private static final Logger logger = LoggerFactory.getLogger(CheckController.class);

	@Autowired
	private SqlSession sqlSession;

	ModelAndView mav = new ModelAndView();

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public ModelAndView home(Model model) {
		mav.setViewName("checkmain");
		return mav;
	}

}
