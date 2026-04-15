package transport.model;

public class Route {
    private String id;
    private String from;
    private String to;
    private double distance;
    private String departureTime;

    public Route(String id, String from, String to, double km, String time) {
        if (km <= 0) throw new IllegalArgumentException("Distance must be positive");
        this.id = id;
        this.from = from;
        this.to = to;
        this.distance = km;
        this.departureTime = time;
    }

    public Route(String id, String from, String to, double km) {
        this(id, from, to, km, "TBA");
    }

    public String getId() { return id; }
    public double getDistance() { return distance; }

    @Override
    public String toString() {
        return from + " → " + to + " (" + distance + "km)";
    }
}