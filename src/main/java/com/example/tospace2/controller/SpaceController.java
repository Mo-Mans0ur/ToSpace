package com.example.tospace2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpaceController {

    @GetMapping("/index")
    public String showNavPage() {
        return "/index";
    }

    @GetMapping("/planets")
    public String showPlanetsPage() {
        return "/planets-page";
    }

    @GetMapping("/spaceships")
    public String showSpaceshipPage(){
        return "/spaceships";
    }

    @GetMapping("/flight-booking")
    public String showFlightBookingPage(){
        return "/flight-booking";
    }
}
