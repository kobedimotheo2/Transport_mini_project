/*Motheo and Brian */
package transport.app;

import transport.model.*;
import transport.model.vehicle.Combi;
import transport.model.vehicle.Vehicle;
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
                System.out.println("|    * Transport System *     |");
                System.out.println("|─────────────────────────────|");
                System.out.println("|1. View Routes               |");
                System.out.println("|2. Book Seat                 |");
                System.out.println("|3. View Bookings             |");
                System.out.println("|4. View Route Fare           |");
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
                            System.out.println("Displaying Routes...\n");
                            
                            Routes routes = new Routes();
                            System.out.println("\n          ── AVAILABLE ROUTES ──");
                            System.out.println("==========SELECT TRASPORT TYPE ==========");
                            System.out.println("1) Bus \n2) Combi");
                            System.out.println("=========================================");
                            System.out.print("Choose option: ");
                            int transportType = sc.nextInt();
                            sc.nextLine();

                            if(transportType == 1){
                                //---------------------bus routes
                                System.out.println("\n~~~~~~~~~~~~~~~~~~~~~ BUS ROUTES ~~~~~~~~~~~~~~~~~~~~~");
                                Routes busRoutes = new Routes();
                                busRoutes.displayInfo();

                            }else if(transportType == 2){
                                //---------------------combi routes
                                System.out.println("\n|~~~~~~~~~~~~~~~~~~~~~~~~~~ COMBI ROUTES ~~~~~~~~~~~~~~~~~~~~~~~~~~|");
                                for (int i = 0; i < Combi.COMBIS.length; i++){  
                                    
                                System.out.println("|" + (i + 1) + ") " + Combi.COMBIS[i].getLabel() + "     |");

                                System.out.println("|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
                            }
                            
                            }else{
                                System.out.println("Invalid choice; " + transportType);
                            }
                            
                        }else 
                    //BOOK SEAT-------------------------------------------------------------
                        if(choice == 2){
                            System.out.println("Booking seat...\nDEAR CUSTOMER NOTE: BOOKING SEATS IS ONLY AVAILABLE FOR BUSES\n");
                    
                            System.out.println("Enter Passenger FirstName: ");
                            String name = sc.nextLine();
                            System.out.println("Enter Passenger Surname: ");
                            String surname = sc.nextLine();
                            System.out.println("Enter Passenger phone number: ");
                            String phone = sc.nextLine();

                            Passenger passenger = new Passenger(name , surname, phone);  
                            
                            System.out.println("===========CHOOSE JOURNEY========");
                            System.out.println("1) Gaborone -> Francistown\n2)Francistown -> Maun \n3)Maun -> Gaborone");
                            int journey = sc.nextInt();
                            int trasportoption = 1;
                            sc.nextLine();
                            if(journey < 1 || journey > 3 ){
                                System.out.println("choose the given options");
                            }else {
                                System.out.println("===========CHOOSE TIME========");
                                System.out.println("1) 0800 \n2) 1300 \n3) 2100");
                                int time = sc.nextInt();
                                if(time > 3 || time < 1){
                                    System.out.println("Please choose  from  the given options");
                                }else{
                                    Routes routes = new Routes(journey, time);
                                    double fare = fareCalculator.calculateFare(journey, trasportoption);
                                    Booking booking = new Booking(passenger, routes, fare);
                                    bookingService.addBooking(booking);
                                    booking.displayDetails();
                                }
                                sc.nextLine();

                                  
                            }
                    
                        }else 
                        //VEIW BOOKING --------------------------------------------------------
                        if(choice == 3){
                            System.out.println("Viewing bookings...\n");
                            bookingService.showBookings();
                                
                        }else 
                        //CALCULATE AND DISPLAY FARE   -------------------------------------------
                            if(choice == 4){
                                System.out.println("Calculating fare...\n");
                                System.out.println("==========SELECT TRASPORT TYPE ==========");
                                System.out.println("1) Bus \n2) Combi");
                                    int transportoption = sc.nextInt();
                                sc.nextLine();
                                    if(transportoption == 1) {

                                        System.out.println("===========CHOOSE JOURNEY========");
                                        System.out.println("1) Gaborone -> Francistown\n2)Francistown -> Maun \n3)Maun -> Gaborone");
                                        int journey = sc.nextInt();
                                        sc.nextLine();
                                        if (journey < 1 || journey > 3){
                                            System.out.println("Invalid choice; " + journey);
                                        }else{

                                        double fare = fareCalculator.calculateFare(journey, transportoption);
                                        Routes nowroutes = new Routes(journey, 1);
                                        System.out.println("Route: " + nowroutes.getChoice().split(" \\| ")[0].trim());
                                        System.out.printf("Fare : P %.2f BWP\n ", fare);
                                        }

                                    }else if (transportoption == 2){
                                        System.out.println("Fare for Combi is P 9.00 BWP");
                                    }
                            
                        }     
                    }
                        else {
                            System.out.println("Please choose from the provided choices");
                        }
            }
                        
        sc.close();
    }
}
