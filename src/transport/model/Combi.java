/*Motheo Leon and Saviour */
package transport.model.vehicle;

public class Combi extends Vehicle{
    
    private final String route;
    private double fare = 9.00;

    public static final Combi[] COMBIS = {
        new Combi("B 134 SAV", 20, "Gasemotho Transport ", "Bus rank -> Tlokweng      "),
        new Combi("B 445 MAR", 20, "Basuti Transport    ", "Bus rank -> Broadhurst    "),
        new Combi("B 556 KAT", 20, "Botauma Transport   ", "Bus rank -> Gaborone West "),
        new Combi("B 300 MOT", 20, "Kobedi Transport    ", "Bus rank -> Gabane        "),
        new Combi("B 900 LEO", 20, "Elisha Transport    ", "Bus rank -> Mogoditshane  "),
        new Combi("B 450 BRI", 20, "Mahilo Transport    ", "Bus rank -> Phakalane     "),
    };

    public Combi(String registration, int capacity, String operator, String route) {
        super(registration, capacity, operator);
        this.route = route;
    } 
    public String getRoute(){
        return route;
    }
    public double getFare(){
        return fare;
    }
    public int getCapacity(){
        return super.getCapacity();
    }
    @Override
    public String getLabel(){
        return "Combi (" + getRegistration() + ") - seats: "+ getCapacity() + " - " + route;
    }
}