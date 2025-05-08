package com.seneca.cafeteria.cafeteriaapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Controller handling user authentication and related pages.
 */
@Controller
public class LoginController {
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
    private static final String DEMO_EMAIL = "demo@senecaeats.com";
    private static final String DEMO_PASSWORD = "demo123";
    private static final String USER_NAME_ATTR = "userName";
    private static final String IS_LOGGED_IN_ATTR = "isLoggedIn";

    /**
     * Displays the login page.
     * @return login view name
     */
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    /**
     * Processes the login form submission.
     * @param email User's email
     * @param password User's password
     * @param name User's name
     * @param session HTTP session
     * @param model Spring MVC model
     * @return redirect to home page if successful, login page with error if failed
     */
    @PostMapping("/login")
    public String processLogin(@RequestParam("email") String email,
                             @RequestParam("password") String password,
                             @RequestParam("name") String name,
                             HttpSession session,
                             Model model) {
        
        logger.info("Login attempt for user: {}", name);
        
        // Trim whitespace from inputs
        email = email.trim();
        password = password.trim();
        name = name.trim();
        
        if (DEMO_EMAIL.equals(email) && DEMO_PASSWORD.equals(password)) {
            session.setAttribute(USER_NAME_ATTR, name);
            session.setAttribute(IS_LOGGED_IN_ATTR, true);
            logger.info("Login successful for user: {}", name);
            return "redirect:/";
        } else {
            logger.warn("Login failed for user: {}", name);
            model.addAttribute("error", "Invalid email or password. Please try again.");
            return "login";
        }
    }

    /**
     * Handles user logout.
     * @param session HTTP session
     * @return redirect to home page
     */
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        String userName = (String) session.getAttribute(USER_NAME_ATTR);
        session.invalidate();
        logger.info("User logged out: {}", userName);
        return "redirect:/";
    }

    /**
     * Displays the about page.
     * @return about view name
     */
    @GetMapping("/about")
    public String showAboutPage() {
        return "about";
    }
}
