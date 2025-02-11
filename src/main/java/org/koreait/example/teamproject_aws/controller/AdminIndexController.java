package org.koreait.example.teamproject_aws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminIndexController {
    @RequestMapping("/adm/main/adminIndex")
    public String showAdminIndex() {
        return "adm/main/adminIndex";
    }
}
