package com.seneca.cafeteria.cafeteriaapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

    private static final String DEMO_EMAIL = "fl.ln@myseneca.ca";
    private static final String DEMO_PASSWORD = "flln";

    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam("email") String email,
                             @RequestParam("password") String password,
                             @RequestParam("name") String name,
                             HttpSession session,
                             Model model) {
        
        // Debug logs
        System.out.println("Login attempt - Email: " + email);
        System.out.println("Login attempt - Password: " + password);
        System.out.println("Login attempt - Name: " + name);
        
        // Trim whitespace from inputs
        email = email.trim();
        password = password.trim();
        
        if (DEMO_EMAIL.equals(email) && DEMO_PASSWORD.equals(password)) {
            session.setAttribute("userName", name);
            session.setAttribute("isLoggedIn", true);
            return "redirect:/";
        } else {
            model.addAttribute("error", "Invalid email or password. Please try again.");
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

    @GetMapping("/about")
    public String showAboutPage() {
        return "about"; // This should match the filename about.html in your templates folder
    }
}
