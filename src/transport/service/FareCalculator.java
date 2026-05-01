/*By Saviour */
package transport.service;

public class FareCalculator {

    private static final double RatePerKm = 0.38;


    public double calculateFare(int journey, int transprtoption) {
        double fare = 0.0;
        
        if ( transprtoption == 1){
            if(journey == 1){
                fare = 440 * RatePerKm;
            }else if(journey == 2){
                fare = 568 * RatePerKm;
            }else if(journey == 3){
                fare = 950 * RatePerKm;
            }else{
                System.out.println("Invalid route; " + journey);
                return 0;
            }
            return fare;  
        }else if (transprtoption == 2){
            fare = 9.00;
            return fare;
        }
        else if (transprtoption < 1 || transprtoption > 2){
            System.out.println("Invalid transport option; " + transprtoption);
            return 0;
        }
        
      return fare;
    }
}
