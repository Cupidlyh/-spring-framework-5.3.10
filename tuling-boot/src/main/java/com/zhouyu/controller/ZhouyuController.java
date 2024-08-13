package com.zhouyu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhouyu.enums.Season;

@RestController
public class ZhouyuController {

	@GetMapping("/test")
    public String test(Season season) {
        System.out.println(season);
        return season.getName();
	}
}
