package be.thomasmore.demoparty.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HomeController {
    @GetMapping({"/","home"})
    public String home(Model model) {
        int calculatedValue = 34 * 62;
        model.addAttribute("value",calculatedValue);

        return "home";
    }

    @GetMapping("/about")
    public String about(Model model){
        String name="Furkan";
        String adres="Smedenstraat";
        String city="Antwerp";
        model.addAttribute("name",name);
        model.addAttribute("adres",adres);
        model.addAttribute("city",city);

        return "about";
    }

    @GetMapping("/pay")
    public String pay(Model model){
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yy");
        String nowDateTime = now.format(format);

        LocalDateTime after = now.plusDays(30);
        String afterDateTime = after.format(format);

        model.addAttribute("now",nowDateTime);
        model.addAttribute("after",afterDateTime);

        return "pay";
    }







}
