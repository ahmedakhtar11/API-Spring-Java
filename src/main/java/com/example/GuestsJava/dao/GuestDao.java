package com.example.GuestsJava.dao;

import com.example.GuestsJava.model.Guest;

import java.util.List;
import java.util.UUID;

public interface GuestDao {

    int insertGuest(UUID id, Guest guest);

    default int insertGuest(Guest guest) {
        UUID id = UUID.randomUUID();
        return insertGuest(id, guest);
    }

    List<Guest> selectAllGuests();
}
