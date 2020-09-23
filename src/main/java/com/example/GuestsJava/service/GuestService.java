package com.example.GuestsJava.service;

import com.example.GuestsJava.dao.GuestDao;
import com.example.GuestsJava.model.Guest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestService {

    private final GuestDao guestDao;

    @Autowired
    public GuestService(@Qualifier("guestDao") GuestDao guestDao) {
        this.guestDao = guestDao;
    }

    public int addGuest(Guest guest) {
        return guestDao.insertGuest(guest);
    }

    public List<Guest> getAllGuests() {
        return guestDao.selectAllGuests();
    }
}
