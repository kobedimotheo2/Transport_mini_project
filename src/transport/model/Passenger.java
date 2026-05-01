/*Katlego */
package transport.model;
public class Passenger {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Passenger(String firstName, String lastName, String phoneNumber )
        {
            this.firstName = firstName;
            this.lastName = lastName;
            this.phoneNumber = phoneNumber;
  
        }
   // Getters
    public String getFirstName() {
            return firstName;
        }

    public String getLastName() {
            return lastName;
        }

    public String getPhoneNumber() {
            return phoneNumber;
        }
  // Setters
    public void setFirstName(String firstName){
            if (firstName == null || firstName.trim().isEmpty()) {
                throw new IllegalArgumentException("First name cannot empty.");
            }
            this.firstName = firstName.trim();
        }

    public void setLastName(String lastName){
            if (lastName == null || lastName.trim().isEmpty()) {
                throw new IllegalArgumentException("Last name cannot empty.");
            }
            this.lastName = lastName.trim();
        }
    public void setPhoneNumber(String phoneNumber){
            if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
                throw new IllegalArgumentException("Phone number cannot empty.");
            }
            this.phoneNumber = phoneNumber.trim();
        } 
 //method for fullname
    public String getFullName() {
            return firstName + " " + lastName;
        }

        @Override
        public String toString() {
        return "PASSANGER DETAILS{"+ "Full names:" + getFullName() + ", Phone Number :" + phoneNumber + "}";
    }

}