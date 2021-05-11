/**
 * @author lukelmiller
 */

import java.util.ArrayList;
import java.util.Set;

public class CollegeList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<Person>();
        Person aPerson = new Person("Fred");
        aPerson.setLastName("Monster");
        //aPerson.display();
        
        CollegeEmployee aCollegeEmployee = new CollegeEmployee("Dracula");
        aCollegeEmployee.setLastName("Vampire");
        aCollegeEmployee.setSalary(45000);
        //aCollegeEmployee.display();
        
        Faculty aMember = new Faculty("Locness");
        aMember.setLastName("Monster");
        aMember.setSalary(12000);

        
        //aMember.display();
        
        
        people.add(aPerson);
        people.add(aCollegeEmployee);
        people.add(aMember);
        
        for(Person person: people){
            person.display();
        }
        
        
    }
    
}
