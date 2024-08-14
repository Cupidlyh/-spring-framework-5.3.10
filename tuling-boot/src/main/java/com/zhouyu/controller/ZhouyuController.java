package com.zhouyu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zhouyu.enums.SeasonsEnum;
import com.zhouyu.model.TestBodyRequestBO;

@RestController
public class ZhouyuController {

	@GetMapping("/test")
    public String test(SeasonsEnum seasonsEnum) {
        System.out.println(seasonsEnum);
        return seasonsEnum.getName();
    }

    @PostMapping("/testBody")
    public String testBody(@RequestBody TestBodyRequestBO testBodyRequestBO) {
        System.out.println(testBodyRequestBO);
        return testBodyRequestBO.getSeasonsEnum().getName();
    }
}
