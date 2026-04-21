package transport.app;


//import transport.service.BookingService;
import transport.model.*;
import transport.service.*;

import java.util.Scanner;

public class MainApp{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        BookingService bookingService = new BookingService();
        FareCalculator fareCalculator = new FareCalculator();
        int choice ;
    
        while (true) {
                System.out.println();
                System.out.println("┌─────────────────────────────┐");
                System.out.println("|      Transport System       |");
                System.out.println("|─────────────────────────────|");
                System.out.println("|1. View Routes               |");
                System.out.println("|2. Book Seat                 |");
                System.out.println("|3. View Bookings             |");
                System.out.println("|4. Route Fare                |");
                System.out.println("|5. Exit                      |");
                System.out.println("└─────────────────────────────┘");
                System.out.println();
                System.out.print("Choose option: ");

                choice = sc.nextInt();
                sc.nextLine();

                if(choice == 5){
                     System.out.println("GOODBYE");
                     break;
                }
                
                if (choice >= 1 && choice <= 4){
                    //VEIW ROUTES------------------------------------------------------------
                        if(choice == 1){
                            System.out.println("Displaying routes...\n");
                            
                            Routes routes = new Routes();
                            System.out.println("\n        ── AVAILABLE ROUTES ──");
                            System.out.println(routes.getRouteInfo());
                            routes.displayInfo();
                            
                        }else 
                    //BOOK SEAT-------------------------------------------------------------
                        if(choice == 2){
                            System.out.println("Booking seat...\n");
                    
                            System.out.println("Enter Passenger Name: ");
                            String name = sc.nextLine();
                            System.out.println("Enter Passenger Surname: ");
                            String surname = sc.nextLine();
                            System.out.println("Enter Passenger phone number: ");
                            String phone = sc.nextLine();

                            Passenger passenger = new Passenger(name , surname, phone);  
                            
                            System.out.println("===========CHOOSE JOURNEY========");
                            System.out.println("1) Gaborone -> Francistown\n2)Francistown -> Maun \n3)Maun -> Gaborone");
                            int journey = sc.nextInt();

                            System.out.println("===========CHOOSE TIME========");
                            System.out.println("1) 0800 \n2) 1300 \n3) 1900");
                            int time = sc.nextInt();
                            sc.nextLine();

                            Routes routes = new Routes(journey, time);
                            double fare = fareCalculator.calculateFare(journey);
                            Booking booking = new Booking(passenger, routes, fare);
                            bookingService.addBooking(booking);
                            booking.displayDetails();

                    
                        }else 
                        //VEIW BOOKING --------------------------------------------------------
                        if(choice == 3){
                            System.out.println("Viewing bookings...\n");
                            bookingService.showBookings();
                                
                        }else 
                        //CALCULATE AND DISPLAY FARE   -------------------------------------------
                            if(choice == 4){
                            System.out.println("Calculating fare...\n");
                            System.out.println("===========CHOOSE JOURNEY========");
                            System.out.println("1) Gaborone -> Francistown\n2)Francistown -> Maun \n3)Maun -> Gaborone");
                            int journey = sc.nextInt();
                            sc.nextLine();
                            if (journey < 1 || journey > 3){
                                System.out.println("Invalid choice; " + journey);
                            }else{

                            double fare = fareCalculator.calculateFare(journey);
                            Routes nowroutes = new Routes(journey, 1);
                            System.out.println("Route: " + nowroutes.getChoice().split(" \\| ")[0].trim());
                            System.out.printf("Fare : P %.2f BWP\n ", fare);

                         }
                            
                        }     
                        }
                        else {
                            System.out.println("Please choose the correct choice");
                        }
            }
                        
        sc.close();
    }
}
    
 
    
