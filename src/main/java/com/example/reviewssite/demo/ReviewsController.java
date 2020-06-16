package com.example.reviewsite.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Controller
public class ReviewsController {

    @Resource
    private com.example.reviewsite.demo.ReviewRepository reviewRepo;

    @RequestMapping("/reviews")
    public String finalAllReviews(Model model) {
        model.addAttribute("reviewsModel", reviewRepo.findAll());
        return "homeTemplate";
    }

    @RequestMapping("/review")
    public String findOneReview(@RequestParam(value = "id") Long id, Model model) throws ReviewNotFoundException {

        if(reviewRepo.findOne(id) == null) {
            throw new com.example.reviewsite.demo.ReviewNotFoundException();

        }

        model.addAttribute("reviewModel", reviewRepo.findOne(id));
        return "reviewTemplate";


    }

}