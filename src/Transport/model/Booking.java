package transport.model;

import transport.model.Passenger;
import transport.model.Routes;

public class Booking  {

   private Passenger passenger;
   private Routes routes;
   private double fare;

   public Booking(Passenger passenger, Routes routes, double fare){
    if (passenger == null){throw new IllegalArgumentException("Passenger cannot be empty");}
    if (routes == null){throw new IllegalArgumentException("Routes cannot be empty");}
    this.passenger = passenger;
    this.routes = routes;
    this.fare = fare;
   }

   public double calculateFare(){
    return fare;
   }


   public void displayDetails(){
    System.out.println(" ===============BOOKING RECEIPT===============");
    System.out.printf("Passenger : %s\n",passenger.getFullName());
    System.out.printf("Phone Number: %s\n",passenger.getPhoneNumber());
    System.out.println();
    System.out.println("Route :" + routes.getChoice());
    System.out.println("Bus: " + routes.getBus());
    System.out.println("Distance: " + routes.getDistanceKm() + " km");
    System.out.printf("Fare: %.2f BWP\n", calculateFare());
    System.out.println(" ============================================ ");
    
   }


}
