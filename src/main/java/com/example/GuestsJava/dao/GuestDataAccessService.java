package com.example.GuestsJava.dao;

import com.example.GuestsJava.model.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("guestDao")
public class GuestDataAccessService implements GuestDao {

    private static List<Guest> DB = new ArrayList<>();

    @Override
    public int insertGuest(UUID id, Guest guest) {
        DB.add(new Guest(id, guest.getName()));
        return 1;
    }

    @Override
    public List<Guest> selectAllGuests() {
        return DB;
    }
}
