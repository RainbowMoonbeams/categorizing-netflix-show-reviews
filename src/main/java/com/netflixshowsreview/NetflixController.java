package com.netflixshowsreview;

import java.util.logging.Logger;

import javax.annotation.Resource;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NetflixController {

	@Resource
	public CategoryRepository catRepo;

	@Resource
	NetflixShowRepository showRepo;

	@RequestMapping("/netflixcategories")
	public String fetchCategory(Model model) {
		model.addAttribute("categories", catRepo.findAll());
		return "netflixcategories";

	}
	
	@RequestMapping("/netflixShow")
	public String fetchShow(@RequestParam("id") long id, Model model) {
		model.addAttribute(catRepo.findOne(id));
		return "netflixshow";
	}
	
	@RequestMapping("/singlereview")
	public String fetchReview(@RequestParam("id") long id, Model model) {
		model.addAttribute(showRepo.findOne(id));
		return "singlereview";
	}
	
}