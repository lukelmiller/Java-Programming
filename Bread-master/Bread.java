/** @author Luke Miller
 */
public class Bread {
    private String type;
    private int calories;
    public final static String MOTTO = "The Staff of Life";
    public Bread(String type){
        this.type = type;
    }
    public Bread(int calories){
        this.calories = calories;
    }
    public Bread(String type, int calories){
        this.type = type;
        this.calories = calories;
    }
    public void setCalories(int calories){
        this.calories = calories;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public int getCalories(){
        return calories;
    }
    public void printBread(){
        System.out.printf("%s: %s calories\n", type, calories);
    }
}
