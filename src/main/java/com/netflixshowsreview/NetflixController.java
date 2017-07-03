package com.netflixshowsreview;

import javax.annotation.Resource;

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
		NetflixShow showFromCategory = showRepo.findOne(id);
		model.addAttribute("show", showFromCategory);
		return "netflixshow";
	}
	
	@RequestMapping("/singlereview")
	public String fetchReview(@RequestParam("id") long id, Model model) {
		NetflixShow selectedShow = showRepo.findOne(id);
		model.addAttribute("oneReview", selectedShow);
		return "singlereview";
	}
	
}