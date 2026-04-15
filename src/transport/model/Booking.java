public class Booking{
    private Passenger passenger;
    private Route route;

    public Booking (Passenger passenger, Route route){
        this.passenger = passenger;
        this.route = route;
    }
    public void displayBooking(){
        System.out.println (passenger.getName() + "Booked for " + route.getRouteInfo());
    }
}