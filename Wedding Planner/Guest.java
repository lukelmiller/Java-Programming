/**
 * @author lukelmiller
 */

import java.time.LocalDate;

public class Guest {
    private Person guest;
    private LocalDate rsvpDate = LocalDate.now();
    
    public Guest(String gLName, String gFName){
        guest = new Person(gLName, gFName);
    }
    
    public void setGuest(String lName, String fName){
        guest.setLastName(lName);
        guest.setFirstName(fName);
    }

    public void setRsvpDate(LocalDate rsvpDate) {
        this.rsvpDate = rsvpDate;
    }
    
    public Person getGuest() {
        return guest;
    }

    public LocalDate getRsvpDate() {
        return rsvpDate;
    }
}

