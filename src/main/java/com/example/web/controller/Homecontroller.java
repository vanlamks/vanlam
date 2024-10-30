package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
    @RequestMapping("/index")
    public String index() {
        return "index"; // trả về trang index.html
    }

    @RequestMapping("/trangchu")
    public String trangChu() {
        return "trangchu"; // trả về trang trangchu.html
    }
    @RequestMapping("/thanhtoan")
    public String thanhtoan() {
        return "thanhtoan"; // trả về trang thanhtoan.html
    }
}
