/**
 * @author lukelmiller
 */

public class Person {
    protected String firstName;
    protected String lastName;
    protected String address;
    protected String zip;
    protected String phoneNumber;

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    
    public Person(String firstName){
        this.firstName = firstName;
        
    }
    
    public void display(){
        System.out.printf("I am a person. My name is %s %s!\n", firstName, lastName);
    };
            
}
