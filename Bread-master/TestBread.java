/** @author Luke Miller
 */
public class TestBread {
    public static void main(String[] args) {
//        Bread b1 = new Bread("Rye", 120);
//        Bread b2 = new Bread("Pumperknickle", 110);
//        Bread b3 = new Bread("Sourdough", 115);
//        System.out.println(Bread.MOTTO);
//        System.out.printf("%s has %d calories\n", b1.getType(), b1.getCalories());
//        System.out.println(Bread.MOTTO);
//        System.out.printf("%s has %d calories\n", b2.getType(), b2.getCalories());
//        System.out.println(Bread.MOTTO);
//        System.out.printf("%s has %d calories\n", b3.getType(), b3.getCalories());

    System.out.println(Bread.MOTTO);
    Bread bread1 = new Bread("Rye", 5);
    bread1.printBread();
    //should be an invalid statement:
    //Bread bread2 = new Bread();
    Bread bread2 = new Bread("White", 25);
    bread2.printBread();
    Bread bread3 = new Bread("Wheat", 15);
    bread3.printBread();
    }
    
}
