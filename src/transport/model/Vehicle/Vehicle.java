/* By Motheo Brian and Leon */
package transport.model.vehicle;

public abstract class Vehicle {

    private String registration;
    private int capacity;
    private String operator;
    
    public Vehicle (String registration, int capacity, String operator){
        if (registration == null || registration.isBlank()){
            throw new IllegalArgumentException("Registration cannot be empty.");
        }if (capacity <= 0) {
            throw new IllegalArgumentException("capacity must be positive.");
        }
            this.registration = registration;
            this.capacity = capacity;
            this.operator = operator;       
    }

    public String getRegistration() { return registration; }
    public int getCapacity() { return capacity;}
    public String getOperator() { return operator; }

    public abstract String getLabel();

    @Override
    public String toString(){
        return getLabel() + " | cap: " + capacity + " | reg: " + registration;
    }

    }
