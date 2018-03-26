package f18.mar21;

/**
 *
 * @author Calum
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String emailAddress;

    public Contact(String firstName, String lastName, String emailAddress) {
        setFirstName(firstName);
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }
    
    public String getFirstName() {
        return firstName;
    }

public void setFirstName(String firstName){
     try {
        // Check whether first Name is empty
        if (firstName.isEmpty()) {
            throw new BlankException();         
            }
            // If not set first name as first name
            this.firstName = firstName;
            }
        catch(BlankException ex){
            System.out.println(ex.getMessage());
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
      try {
        if (lastName.isEmpty()) {
            throw new BlankException();         
            }
            this.lastName = lastName;
            }
        catch(BlankException ex){
            System.out.println(ex.getMessage());
        }
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
      try {
        if (emailAddress.isEmpty()) {
            throw new BlankException();         
            }
            this.emailAddress = emailAddress;
            }
        catch(BlankException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    
}
