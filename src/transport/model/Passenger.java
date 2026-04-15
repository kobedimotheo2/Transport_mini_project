
public class Passenger {
    private String firstName;
    private String surName;
    private int cellNumber;

    public Passenger (String firstName, String surName, int cellNumber){
        this.firstName = firstName;
        this.surName = surName;
        this.cellNumber = cellNumber;
    }

    public void getName(){
        System.out.println("FName"+ firstName + "Surname"+ surName + "cell:"+ cellNumber);
    }
}