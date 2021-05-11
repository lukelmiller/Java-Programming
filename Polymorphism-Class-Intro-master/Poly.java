/**
 * @author lukelmiller
 */

import java.util.ArrayList;

public class Poly {

    public static void main(String[] args) {
        Lion lion =new Lion(6, "beige");
        Fish fish = new Fish(2, "gold");
        Dog dog = new Dog(7, "Black");
        
        ArrayList<Animal> aryAnimal = new ArrayList<Animal>();
        aryAnimal.add(lion);
        aryAnimal.add(dog);
        aryAnimal.add(fish);
        
        for(int i =0; i < aryAnimal.size(); i++){
            allSpeak(aryAnimal.get(i));
        }
        
        
        //allSpeak(fish);
    }

    public static void allSpeak(Animal animal){
        animal.speak();
    }
}
