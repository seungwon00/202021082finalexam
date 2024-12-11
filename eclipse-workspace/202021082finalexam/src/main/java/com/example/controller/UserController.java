package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {

    // 로그인 페이지
    @GetMapping("/login")
    public String loginPage() {
        return "login"; // login.jsp로 이동
    }

    // 회원가입 페이지
    @GetMapping("/signup")
    public String signupPage() {
        return "signup"; // signup.jsp로 이동
    }

    // 회원가입 처리
    @PostMapping("/signup")
    public String signupProcess(User user, Model model) {
        // TODO: DB에 사용자 정보 저장 로직 구현
        model.addAttribute("message", "회원가입이 성공적으로 완료되었습니다!");
        return "redirect:/login"; // 회원가입 후 로그인 페이지로 리다이렉트
    }
}
