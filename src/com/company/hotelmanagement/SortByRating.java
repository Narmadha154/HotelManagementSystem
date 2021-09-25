package com.company.hotelmanagement;

import java.util.Comparator;

public class SortByRating implements Comparator<Hotel> {

    @Override
    public int compare(Hotel a, Hotel b) {
        return a.getRating()-b.getRating();
    }
}
