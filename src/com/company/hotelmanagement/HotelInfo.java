package com.company.hotelmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelInfo {
    public static List<Hotel> getInfo(List<Hotel> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of hotels want to add:");
        int number=sc.nextInt();
        for(int i=0;i<number;i++) {
            sc.nextLine();
            System.out.println("Enter the hotel name:");
            String hotelName = sc.nextLine();
            System.out.println("Enter the rooms available:");
            int roomsAvailable = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the location:");
            String location = sc.nextLine();
            System.out.println("Enter the rating:");
            int rating = sc.nextInt();
            System.out.println("Enter the price per room");
            int price = sc.nextInt();
            Hotel hotel = new Hotel();
            hotel.setHotelName(hotelName);
            hotel.setRoomsAvailable(roomsAvailable);
            hotel.setLocation(location);
            hotel.setRating(rating);
            hotel.setPricePerRoom(price);
            list.add(hotel);
        }
        return list;
    }
}
