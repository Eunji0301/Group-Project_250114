package org.koreait.example.teamproject_aws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminCardNewsController {

    @RequestMapping("/adm/cardnews/cardNewsList")
    public String showCardNewsList() {
        return "adm/cardnews/cardNewsList";
    }

    @RequestMapping("/adm/cardnews/cardNewsModify")
    public String showCardNewsModify() {
        return "adm/cardnews/cardNewsModify";
    }

    @RequestMapping("/adm/cardnews/cardNewsWrite")
    public String showCardNewsWrite() {
        return "adm/cardnews/cardNewsWrite";
    }

}