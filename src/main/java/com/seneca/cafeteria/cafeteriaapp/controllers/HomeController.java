package com.seneca.cafeteria.cafeteriaapp.controllers;

import com.seneca.cafeteria.cafeteriaapp.models.EatingPlace;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Controller handling home page and menu-related functionality.
 */
@Controller
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    /**
     * Displays the welcome page.
     * @param model Spring MVC model
     * @return index view name
     */
    @GetMapping("/")
    public String showWelcomePage(Model model) {
        model.addAttribute("welcomeMessage", "Welcome to Seneca Cafeteria!");
        return "index";
    }

    /**
     * Displays the menu for a specific area in a campus.
     * @param campus Campus name
     * @param area Area name
     * @param model Spring MVC model
     * @return area-menu view name
     */
    @GetMapping("/menu/{campus}/{area}")
    public String showAreaMenu(@PathVariable String campus,
                             @PathVariable String area,
                             Model model) {
        logger.info("Displaying menu for campus: {} and area: {}", campus, area);

        model.addAttribute("campus", campus);
        model.addAttribute("area", area);

        // Set operating hours based on area
        Map<String, String> hours = getOperatingHours(area);
        model.addAttribute("openTime", hours.get("open"));
        model.addAttribute("closeTime", hours.get("close"));

        // Get menu items
        Map<String, List<String>> items = getMenuItems(area);
        model.addAttribute("menuItems", items);

        return "area-menu";
    }

    /**
     * Redirects to Seneca's contact page.
     * @return redirect URL
     */
    @GetMapping("/contact")
    public String redirectToSenecaContact() {
        return "redirect:https://www.senecapolytechnic.ca/contact-us.html";
    }

    /**
     * Displays the menu selection page for a campus.
     * @param campus Campus name
     * @param model Spring MVC model
     * @return area-select view name
     */
    @GetMapping("/menu")
    public String showMenu(@RequestParam String campus, Model model) {
        logger.info("Displaying menu selection for campus: {}", campus);
        model.addAttribute("campus", campus);
        model.addAttribute("places", getEatingPlaces(campus));
        return "area-select";
    }

    /**
     * Gets operating hours for a specific area.
     * @param area Area name
     * @return Map containing open and close times
     */
    private Map<String, String> getOperatingHours(String area) {
        Map<String, String> hours = new LinkedHashMap<>();
        if (area.equalsIgnoreCase("timhortons")) {
            hours.put("open", "07:30");
            hours.put("close", "20:00");
        } else {
            hours.put("open", "08:00");
            hours.put("close", "17:00");
        }
        return hours;
    }

    /**
     * Gets menu items for a specific area.
     * @param area Area name
     * @return Map of menu categories and their items
     */
    private Map<String, List<String>> getMenuItems(String area) {
        return switch (area.toLowerCase()) {
            case "starbucks" -> getStarbucksMenu();
            case "timhortons" -> Map.of("Popular Items", List.of("Iced Capp", "Timbits", "Bagel with Cream Cheese"));
            case "marketplace" -> Map.of("Popular Items", List.of("Pizza", "Salad", "Sandwiches"));
            default -> Map.of("No items found", List.of());
        };
    }

    /**
     * Gets the Starbucks menu items.
     * @return Map of menu categories and their items
     */
    private Map<String, List<String>> getStarbucksMenu() {
        Map<String, List<String>> menu = new LinkedHashMap<>();
        menu.put("Hot Coffee", List.of("Pike Place® Roast", "Caffè Americano", "Flat White"));
        menu.put("Cold Coffee", List.of("Iced Coffee", "Cold Brew", "Nitro Cold Brew"));
        menu.put("Hot Tea", List.of("Chai Tea", "Earl Grey", "Jade Citrus Mint®"));
        menu.put("Cold Tea", List.of("Iced Green Tea", "Iced Black Tea", "Iced Passion Tango®"));
        menu.put("Refreshers", List.of("Strawberry Açaí", "Mango Dragonfruit", "Pineapple Passionfruit"));
        menu.put("Frappuccino Blended Beverage", List.of("Caramel Frappuccino®", "Mocha Frappuccino®", "Java Chip Frappuccino®"));
        menu.put("Breakfast", List.of("Bacon & Gouda Sandwich", "Spinach & Feta Wrap", "Oatmeal"));
        menu.put("Bakery", List.of("Butter Croissant", "Bagel with Cream Cheese", "Banana Bread"));
        menu.put("Treats", List.of("Cake Pop", "Chocolate Chip Cookie", "Brownie"));
        menu.put("Lunch", List.of("Turkey Panini", "Protein Box", "Chicken Wrap"));
        menu.put("Snacks", List.of("String Cheese", "Granola Bar", "Chips"));
        return menu;
    }

    /**
     * Gets eating places for a specific campus.
     * @param campus Campus name
     * @return List of eating places
     */
    private List<EatingPlace> getEatingPlaces(String campus) {
        return switch (campus.toLowerCase()) {
            case "newnham" -> List.of(
                new EatingPlace("The Market", "10:00", "16:00", "Mon-Fri 10:00 AM - 4:00 PM, Sat-Sun Closed"),
                new EatingPlace("Grill", "08:30", "17:00", "Mon-Thu 8:30 AM - 5:00 PM, Fri 8:30 AM - 4:00 PM, Sat-Sun Closed"),
                new EatingPlace("Pizza+Pasta", "10:00", "14:00", "Mon-Fri 10:00 AM - 2:00 PM, Sat-Sun Closed"),
                new EatingPlace("Salad+", "Closed", "Closed", "Mon-Sun Closed"),
                new EatingPlace("International", "Closed", "Closed", "Mon-Sun Closed"),
                new EatingPlace("The Café", "Closed", "Closed", "Mon-Sun Closed"),
                new EatingPlace("Tim Hortons", "07:30", "17:00", "Mon-Thu 7:30 AM - 5:00 PM, Fri 7:30 AM - 4:00 PM, Sat-Sun Closed"),
                new EatingPlace("Starbucks", "07:30", "19:00", "Mon-Thu 7:30 AM - 7:00 PM, Fri 7:30 AM - 6:00 PM, Sat-Sun 8:00 AM - 2:00 PM"),
                new EatingPlace("Subway", "08:00", "23:00", "Mon-Sun 8:00 AM - 11:00 PM")
            );
            case "york" -> List.of(
                new EatingPlace("Tim Hortons", "08:00", "14:00", "Mon-Fri 8:00 AM - 2:00 PM, Sat-Sun Closed"),
                new EatingPlace("Main Cafeteria-York", "08:00", "17:00", "Mon-Thu 8:00 AM - 5:00 PM, Fri 8:00 AM - 4:00 PM, Sat-Sun Closed")
            );
            case "king" -> List.of(
                new EatingPlace("Main Cafeteria-King", "08:00", "14:00", "Mon-Fri 8:00 AM - 2:00 PM, Sat-Sun Closed"),
                new EatingPlace("Starbucks Magna Hall", "08:00", "14:00", "Mon-Fri 8:00 AM - 2:00 PM, Sat-Sun Closed")
            );
            default -> List.of();
        };
    }
}
