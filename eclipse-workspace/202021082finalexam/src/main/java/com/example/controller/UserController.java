package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserController {

    // �α��� ������
    @GetMapping("/login")
    public String loginPage() {
        return "login"; // login.jsp�� �̵�
    }

    // ȸ������ ������
    @GetMapping("/signup")
    public String signupPage() {
        return "signup"; // signup.jsp�� �̵�
    }

    // ȸ������ ó��
    @PostMapping("/signup")
    public String signupProcess(User user, Model model) {
        // TODO: DB�� ����� ���� ���� ���� ����
        model.addAttribute("message", "ȸ�������� ���������� �Ϸ�Ǿ����ϴ�!");
        return "redirect:/login"; // ȸ������ �� �α��� �������� �����̷�Ʈ
    }
}
