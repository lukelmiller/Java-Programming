// @author lukemiller
 
public class TestBloodData {
    public static void main(String[] args) {
        
        BloodData tbd = new BloodData();
        System.out.println("Show the default has been initialized:");
        System.out.println("Default Blood Type: " + tbd.getType());
        System.out.println("Default RH Type: " + tbd.getRhFactor());
        System.out.println("********************");
        System.out.println("Second Test: change the fields"); 
        tbd.setType("A");
        tbd.setRhFactor("-");
        System.out.println("New Blood Type: " + tbd.getType());
        System.out.println("New RH Type: " + tbd.getRhFactor());
        System.out.println("**************");
        System.out.println("Third Test: Use overloaded constructor");
        BloodData tbd2 = new BloodData("AB", "+");
        System.out.printf("Blood type: %s\nRHFactor: %s", tbd2.getType(),tbd2.getRhFactor());

    }
}
