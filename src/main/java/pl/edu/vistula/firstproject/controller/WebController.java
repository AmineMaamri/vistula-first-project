package pl.edu.vistula.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

    @GetMapping(value = "/")
    @ResponseBody
    public String home() {
        return "Hello Vistula, this is my first Spring controller response!";
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Vistula Student") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
}