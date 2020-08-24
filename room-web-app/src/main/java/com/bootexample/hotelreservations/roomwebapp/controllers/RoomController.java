package com.bootexample.hotelreservations.roomwebapp.controllers;

import com.bootexample.hotelreservations.roomwebapp.entities.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {

    @GetMapping
    public String getAllRooms(Model model) {
        model.addAttribute("rooms", roomList);
        return "rooms";
    }

}
