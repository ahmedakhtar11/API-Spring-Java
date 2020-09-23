package com.example.GuestsJava.api;

import com.example.GuestsJava.model.Guest;
import com.example.GuestsJava.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/guest")
@RestController
public class GuestController {

    private final GuestService guestService;

    @Autowired
    public GuestController(GuestService guestService) {
        this.guestService = guestService;
    }

    @PostMapping
    public void addGuest(@RequestBody Guest guest){
        guestService.addGuest(guest);
    }

    @GetMapping
    public List<Guest> getAllGuests() {
        return guestService.getAllGuests();
    }
}
