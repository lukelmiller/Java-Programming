/**
 * @author lukelmiller
 */

public class Faculty extends CollegeEmployee{
    
    public Faculty(String firstName){
        super(firstName);
    }
    
    @Override
    public void display(){
        super.display();
        setSalary(95000);
        System.out.printf("I am a faculty member\n");
        
    }
    
}
