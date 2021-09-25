package com.company.hotelmanagement;

import java.util.Comparator;

public class SortByRoomAvailable implements Comparator<Hotel> {

    @Override
    public int compare(Hotel a, Hotel b) {
        return a.getRoomsAvailable()-b.getRoomsAvailable();
    }
}
