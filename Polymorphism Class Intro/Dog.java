/**
 * @author lukelmiller
 */

public class Dog extends Animal{
    public Dog(int age, String color){
        super(age, color);
    }
    public void speak(){
        System.out.println("I bark");
    }
}
