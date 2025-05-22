package com.seneca.cafeteria.cafeteriaapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

@Controller
public class HomeController {

    @GetMapping("/")
    public String showWelcomePage(Model model) {
        model.addAttribute("welcomeMessage", "Welcome to Seneca Cafeteria!");
        return "index";  // Returns the index.html template
    }

    @GetMapping("/menu/{campus}/{area}")
    public String showAreaMenu(@PathVariable String campus,
                               @PathVariable String area,
                               Model model) {

        model.addAttribute("campus", campus);
        model.addAttribute("area", area);

        // Simulate timings (you can move this to a service later)
        String open = "08:00";
        String close = "17:00";
        if (area.equalsIgnoreCase("timhortons")) {
            open = "07:30";
            close = "20:00";
        }

        model.addAttribute("openTime", open);
        model.addAttribute("closeTime", close);

        Map<String, List<String>> items = switch (area.toLowerCase()) {
            case "starbucks" -> {
                Map<String, List<String>> starbucksMenu = new LinkedHashMap<>();

                starbucksMenu.put("Hot Coffee", List.of("Pike Place® Roast", "Caffè Americano", "Flat White"));
                starbucksMenu.put("Cold Coffee", List.of("Iced Coffee", "Cold Brew", "Nitro Cold Brew"));
                starbucksMenu.put("Hot Tea", List.of("Chai Tea", "Earl Grey", "Jade Citrus Mint®"));
                starbucksMenu.put("Cold Tea", List.of("Iced Green Tea", "Iced Black Tea", "Iced Passion Tango®"));
                starbucksMenu.put("Refreshers", List.of("Strawberry Açaí", "Mango Dragonfruit", "Pineapple Passionfruit"));
                starbucksMenu.put("Frappuccino Blended Beverage", List.of("Caramel Frappuccino®", "Mocha Frappuccino®", "Java Chip Frappuccino®"));
                starbucksMenu.put("Breakfast", List.of("Bacon & Gouda Sandwich", "Spinach & Feta Wrap", "Oatmeal"));
                starbucksMenu.put("Bakery", List.of("Butter Croissant", "Bagel with Cream Cheese", "Banana Bread"));
                starbucksMenu.put("Treats", List.of("Cake Pop", "Chocolate Chip Cookie", "Brownie"));
                starbucksMenu.put("Lunch", List.of("Turkey Panini", "Protein Box", "Chicken Wrap"));
                starbucksMenu.put("Snacks", List.of("String Cheese", "Granola Bar", "Chips"));

                yield starbucksMenu;
            }
            case "timhortons" -> Map.of("Popular Items", List.of("Iced Capp", "Timbits", "Bagel with Cream Cheese"));
            case "marketplace" -> Map.of("Popular Items", List.of("Pizza", "Salad", "Sandwiches"));
            default -> Map.of("No items found", List.of());
        };

        model.addAttribute("menuItems", items);
        return "area-menu"; // name of your HTML file
    }

    @GetMapping("/contact")
    public String redirectToSenecaContact() {
        return "redirect:https://www.senecapolytechnic.ca/contact-us.html";
    }

    @GetMapping("/menu")
    public String showMenu(@RequestParam String campus, Model model) {
        model.addAttribute("campus", campus);

        List<EatingPlace> places = switch (campus.toLowerCase()) {
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

        // Add image mapping to the model
        Map<String, String> placeImageMap = new HashMap<>();
        placeImageMap.put("Tim Hortons", "timhortons.jpg");
        placeImageMap.put("Starbucks", "starbucks.jpg");
        placeImageMap.put("Subway", "subway.jpg");
        placeImageMap.put("The Market", "the_market.jpg");
        placeImageMap.put("Grill", "grill.png");
        placeImageMap.put("Pizza+Pasta", "pizza+pasta.png");
        placeImageMap.put("Salad+", "salad+.jpg");
        placeImageMap.put("International", "international.png");
        placeImageMap.put("The Café", "the_cafe.png");
        placeImageMap.put("Main Cafeteria-York", "main_cafeteria-york.png");
        placeImageMap.put("Main Cafeteria-King", "main_cafeteria-king.png");
        placeImageMap.put("Starbucks Magna Hall", "starbucks_magna_hall.png");
        
        model.addAttribute("placeImageMap", placeImageMap);
        model.addAttribute("places", places);
        return "area-select";
    }
}
