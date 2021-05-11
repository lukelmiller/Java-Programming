/**
 * @author lukelmiller
 */

public class Couple {
    private Person bride;
    private Person groom;
    
    public Couple(String bFName, String bLName, String gFName, String gLName){
        bride = new Person(bFName,bLName);
        groom = new Person(gFName, gLName);
    }
    public void setBride(String bFName, String bLName) {
        bride.setLastName(bLName);
        bride.setFirstName(bFName);
    }
    public void setGroom(String gFName, String gLName) {
        groom.setLastName(gLName);
        groom.setFirstName(gFName);
    }
    public Person getBride() {
        return bride;
    }
    public Person getGroom() {
        return groom;
    }
    
}
