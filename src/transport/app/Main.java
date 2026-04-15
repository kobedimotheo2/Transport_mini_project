package tranport.app;

import java.util.Scanner; 

import transport.model.Passenger;
import transport.model.Routes;
import transport.model.Booking;
import transport.service.BookingService;
import transport.service.FareCalculator;
import transport.util;

public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int choice ;
    
        while (true) {
                System.out.println("\n ______________________________");
                System.out.println("|===  Transport System Menu ===|");
                System.out.println("|  1. View Routes              |");
                System.out.println("|  2. Book Seat                |");
                System.out.println("|  3. View Bookings            |");
                System.out.println("|  4. Calculate Fare           |");
                System.out.println("|  5. Exit                     |");
                System.out.println("|______________________________|\n");
                System.out.print("Choose option: ");

                choice = sc.nextInt();

                if(choice == 5){
                     System.out.println("Session ended! Thank you for using the system!");
                     break;
                }
                if (choice >= 1 && choice <= 4){
                        if(choice == 1){
                            System.out.println("Displaying routes...\n");
                            //TO DO
                            //System.out.println("Available routes");
                            //System.out.println(route1.getRouteInfo() +" Distance" + route1.getDistance() + " km");
                            
                        }else if(choice == 2){
                            System.out.println("Booking seat...\n");

                            System.out.println("Enter Passenger name: ");
                            String name = sc.nextLine();
                            System.out.println("Enter Passenger phone number: ");
                            String phone = sc.nextLine();
                            //TO DO
                            //Passenger passenger = new Passenger(name , phone);

                            //Booking booking = new Booking (passenger, route1);

                            //bookingService.addBooking(booking);
                    
                        }else if(choice == 3){
                            System.out.println("Viewing bookings...\n");
                            //TO DO
                            //bookingService.viewBookings();
                                
                        }else if(choice == 4){
                            System.out.println("Calculating fare...\n");
                            //TO DO
                            //double fare = fareCalculator.calculateFare(route1.getDistance());
                            //System.out.println("Fare for "+ route1.getRouteinfo()+ "is: P" + fare);
                            
                        }     
                        }
                        else {
                            System.out.println("Please choose the correct choice");
                        }
            }
                        
        sc.close();
    }
}
