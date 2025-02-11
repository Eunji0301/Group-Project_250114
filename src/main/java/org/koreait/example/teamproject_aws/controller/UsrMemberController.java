package org.koreait.example.teamproject_aws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UsrMemberController {
    @RequestMapping("/usr/member/activityInformation")
    public String showActivityInformation() {
        return "usr/member/activityInformation";
    }

    @RequestMapping("/usr/member/informationModify")
    public String showInformationModify() {
        return "usr/member/informationModify";
    }
    
}
