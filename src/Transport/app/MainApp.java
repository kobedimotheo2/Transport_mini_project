import java.util.Scanner;
package com.transport.app;
public class MainApp{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int choice ;
    
        while (true) {
                System.out.println("\n==== Transport System ====");
                System.out.println("1. View Routes");
                System.out.println("2. Book Seat");
                System.out.println("3. View Bookings");
                System.out.println("4. Calculate Fare");
                System.out.println("5. Exit\n");
                System.out.print("Choose option: ");

                choice = sc.nextInt();

                if(choice == 5){
                     System.out.println("GOODBYE");
                     break;
                }
                if (choice >= 1 && choice <= 4){
                        if(choice == 1){
                            System.out.println("Displaying routes...\n");
                            
                        }else if(choice == 2){
                            System.out.println("Booking seat...\n");
                    
                        }else if(choice == 3){
                            System.out.println("Viewing bookings...\n");
                                
                        }else if(choice == 4){
                            System.out.println("Calculating fare...\n");}
                        
                            
                        }
                        else {
                            System.out.println("please choose the correct choice");
                        }
            }
                        
        sc.close();
    }
}
    
