/*Motheo Brian  */
package transport.model;

import transport.model.vehicle.Bus;
import transport.model.vehicle.Vehicle;

public class Routes {

        private static final String [][] ROUTE_NAMES ={
            {"Gaborone", "Francistown", "440"},
            {"Francistown", "Maun ", "568"},
            {"Maun", "Gaborone","950"},
        };
       public static final int [][] FLEET_INDEX = {
        {0,3,6},
        {1,4,7},
        {2,5,8},
       };

       private static final String[] Times = {"0800", "1300", "2100"};

        private final int journey;
        private final int time;
        private final Vehicle vehicle;

        public Routes() {
            this.journey = 0;
            this.time = 0;
            this.vehicle = null;
        }

        public Routes(int journey, int time){
            if (journey < 1 || journey > 3) {
                throw new IllegalArgumentException("Invalid journey choice: " + journey);
            }if (time < 1 || time > 3) {
                throw new IllegalArgumentException("Invalid time choice: " + time);
            }
            this.journey = journey;
            this.time = time;
            this.vehicle = Bus.FLEET[FLEET_INDEX[journey - 1][time - 1]];
        }

        public String getRouteInfo() {

        return "Gaborone -> Francistown -> Maun -> Gaborone \n             Route System";

        }

        public void displayInfo(){
            for(int j = 0; j < 3; j++){
                String[] r = ROUTE_NAMES[j];
                System.out.printf("%n      ====== %s to %s (%s km) ====== %n", r[0] ,r[1] , r[2]);
                for (int t = 0; t < 3; t++){
                    Bus b = Bus.FLEET[FLEET_INDEX[j][t]];
                    System.out.printf("Times %s : %s%n", Times[t], b.getLabel());
                }
                System.out.print("=====================================================");
            }

        }

        public double getDistanceKm() {
            return Double.parseDouble(ROUTE_NAMES[journey - 1][2]);

        }

        public String getTimeString() {

           return Times[time - 1];
        }

        public String getChoice() {

            String[] r = ROUTE_NAMES[journey - 1];
            return r[0] + " to " + r[1] + " | Depature time: " + getTimeString();
        }

        public String getBus() {
    
           return vehicle != null ? vehicle.getLabel() : "N/A";
        }

        public Vehicle getVehicle(){
            return vehicle;
        }

    
    }