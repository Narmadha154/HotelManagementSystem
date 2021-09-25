package com.company.hotelmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Booking {
    public static  List<User> getUserDetails(List<Hotel> list){
        List<User> bookingData=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of users want to add:");
        int number=sc.nextInt();
        for(int j=1;j<=number;j++) {
            sc.nextLine();
            int userId=j;
            System.out.println("Enter the user name:");
            String userName = sc.nextLine();
            System.out.println("Enter the hotel name:");
            String hotelName = sc.nextLine();
            System.out.println("Enter the no.of rooms you want to book");
            int rooms = sc.nextInt();
            int noOfRoomsAvailable = 0;
            int bookingCost = 0;
            User details = new User();
            details.setUserName(userName);
            details.setHotelName(hotelName);
            details.setUserId(j);
            for (int i = 0; i < list.size(); i++) {
                Hotel hot = list.get(i);
                String hotName = hot.getHotelName();
                if (hotName.equals(hotelName)) {
                    noOfRoomsAvailable = hot.getRoomsAvailable();
                    if (rooms > noOfRoomsAvailable) {
                        System.out.println("only" + " " + noOfRoomsAvailable + " " + "rooms are available");
                        break;
                        //System.out.println("Do you want to proceed or exit (y=1/n=0)");
                    } else {
                        int pricePerRoom = hot.getPricePerRoom();
                        bookingCost = rooms * pricePerRoom;
                        hot.setRoomsAvailable(noOfRoomsAvailable-rooms);
                    }
                }
            }
            if(bookingCost>0) {
                details.setBookingCost(bookingCost);
                bookingData.add(details);
            }
        }
        return bookingData;
    }
}
