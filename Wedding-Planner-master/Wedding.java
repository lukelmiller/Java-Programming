/**
 * @author lukelmiller
 */

import java.util.ArrayList;

public class Wedding {
    private Couple cTb;
    private String wedDate;
    private String location;
    private ArrayList<Guest> guests = new ArrayList<Guest>();
    
    public Wedding(String bFName, String bLName, String gFName,String gLName, String wDate, String location, ArrayList<Guest> gue){
        cTb = new Couple(bFName,bLName,gFName, gLName);
        wedDate = wDate;
        this.location = location;
        guests = new ArrayList<Guest>(gue);
    }
    
    
    
    public void setcTb(Couple cTb) {
        this.cTb = cTb;
    }

    public void setWedDate(String wedDate) {
        this.wedDate = wedDate;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setGuests(ArrayList<Guest> guests) {
        this.guests = guests;
    }

    public Couple getcTb() {
        return cTb;
    }

    public String getWedDate() {
        return wedDate;
    }

    public String getLocation() {
        return location;
    }

    public Guest getGuests(int i) {
        return guests.get(i);
    }
    
    
}
