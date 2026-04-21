package transport.service;

//import transport.model.*;
import java.util.ArrayList;

import transport.model.Booking;

public class BookingService 
{
    private ArrayList<Booking> bookings = new ArrayList<>();

    public void addBooking(Booking booking) 
    {
        bookings.add(booking );

        System.out.println("Booking added.");
    }

    public void showBookings() 
    {
        if (bookings.isEmpty()) {
            System.out.println("No bookings.");
            return;
        }
        for (Booking b : bookings) {
            b.displayDetails();
        }
    }

}
