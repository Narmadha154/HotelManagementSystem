package com.company.hotelmanagement;

import java.util.List;

public class PrintHotelData {
    public static void getData(List<Hotel> list,String location){
     for(int i=0;i<list.size();i++) {
         Hotel hot = list.get(i);
         String loc = hot.getLocation();
         if (loc.equals(location)){
             System.out.println(hot);
         }
     }
    }
}
