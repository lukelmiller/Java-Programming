/**
 * @author lukelmiller
 */

public class CollegeEmployee extends Person{
    String ssn;
    String dept;
    double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
    public CollegeEmployee(String firstName){
        super(firstName);
    }
    
    @Override
    public void display(){
        super.display();//uses the supers diplay then we can do the rest of the overriden display for collegeEmployee class
        System.out.printf("I make little bucks: %.2f\n", salary);
    }
    
    
    
}
