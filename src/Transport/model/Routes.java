package transport.model;

import transport.model.bus.Bus;

public class Routes extends Bus{

        private int journey;
        private int time;
        
        private String Gabz = "Gaborone";
        private String FTown = "Francistown";
        private String Maun = "Maun";

        String GTF = "440 km";
        String FTM = "568 km";
        String MTG = "950 km";

        private String GaboroneToFrancistown1, GaboroneToFrancistown2, GaboroneToFrancistown3;
        private String FrancistownToMaun1, FrancistownToMaun2, FrancistownToMaun3;
        private String MaunToGaborone1, MaunToGaborone2, MaunToGaborone3;

        public Routes() {
            intialRoutesStrings();
        }

        public Routes(int journey, int time){
            if (journey < 1 || journey > 3) {
                throw new IllegalArgumentException("Invalid journey choice: " + journey);
            }if (time < 1 || time > 3) {
                throw new IllegalArgumentException("Invalid time choice: " + time);
            }

            this.journey = journey;
            this.time = time;

            intialRoutesStrings();
        }

        public void intialRoutesStrings(){

        GaboroneToFrancistown1 = Nkk1     + GTF;
        GaboroneToFrancistown2 = Seabelo1 + GTF;
        GaboroneToFrancistown3 = TeePee1  + GTF;

        FrancistownToMaun1 = Nkk2     + FTM;
        FrancistownToMaun2 = Seabelo2 + FTM;
        FrancistownToMaun3 = TeePee2  + FTM;

        MaunToGaborone1 = Nkk3     + MTG;
        MaunToGaborone2 = Seabelo3 + MTG;
        MaunToGaborone3 = TeePee3  + MTG;
    }
        public String getRouteInfo() {

        return "Gaborone -> Francistown -> Maun -> Gaborone \n             Route System";

        }

        public void displayInfo(){
            System.out.println("_________________________________________\n");
             System.out.println("   ┌────────────────────────────────────┐");
            System.out.println("   |==Gaborone to Francistown (440 km)==|");
            System.out.println("   └────────────────────────────────────┘\n");
            System.out.println("Time : 0800 : " + GaboroneToFrancistown1);
            System.out.println("Time : 1300 : " + GaboroneToFrancistown2);
            System.out.println("Time : 2100 : " + GaboroneToFrancistown3);
            System.out.println("_________________________________________\n");
             System.out.println("    ┌────────────────────────────────┐");
            System.out.println("    |==Francistown to Maun (568 km)==|");
            System.out.println("    └────────────────────────────────┘\n");
            System.out.println("Time : 0800 : " + FrancistownToMaun1);
            System.out.println("Time : 1300 : " + FrancistownToMaun2);
            System.out.println("Time : 2100 : " + FrancistownToMaun3);
            System.out.println("_________________________________________\n");
             System.out.println(" ┌───────────────────────────────────────┐");
            System.out.println(" |==Maun to Gaborone via Ghanzi(950 km)==|");
            System.out.println(" └───────────────────────────────────────┘\n");
            System.out.println("Time : 0800 : " + MaunToGaborone1);
            System.out.println("Time : 1300 : " + MaunToGaborone2);
            System.out.println("Time : 2100 : " + MaunToGaborone3);
            System.out.println("_________________________________________");
        }

        public double getDistanceKm() {
            if (journey == 1) {
                return 440.0; // Gaborone to Francistown
            } else if (journey == 2) {
                return 568.0; // Francistown to Maun
            } else if (journey == 3) {
                return 950.0; // Maun to Gaborone
            } else {
                throw new IllegalArgumentException("Invalid journey choice: " + journey);
            } 
        }

        public String getTimeString() {
            if (time == 1) {
                return "0800";
            } else if (time == 2) {
                return "1300";
            } else if (time == 3) {
                return "2100";
            } else {
                throw new IllegalArgumentException("Invalid time choice: " + time);
            }
        }

        public String getChoice() {
            String route = "";
            if (journey == 1) {
                route = Gabz + " to " + FTown;
            } else if (journey == 2) {
                route = FTown + " to " + Maun;
            } else if (journey == 3) {
                route = Maun + " to " + Gabz;
            } else {
                throw new IllegalArgumentException("Invalid journey choice: " + journey);
            }
            return route + " | Departure time: " + getTimeString();
        }

        public String getBus() {
            if (journey == 1) {
                if      (time == 1) return Nkk1.trim();
                else if (time == 2) return Seabelo1.trim();
                else                return TeePee1.trim();
            } else if (journey == 2) {
                if      (time == 1) return Nkk2.trim();
                else if (time == 2) return Seabelo2.trim();
                else                return TeePee2.trim();
            } else {
                if      (time == 1) return Nkk3.trim();
                else if (time == 2) return Seabelo3.trim();
                else                return TeePee3.trim();
            }
        }

    
    }