// @author lukemiller

public class Patient {
    private int idNum;
    private int age;
    BloodData blood = new BloodData();
    public Patient(){
        idNum = 0;
        age = 0;
        
    }
    public int getId(){
        return idNum;
    }
    public int getAge(){
        return age;
    }
    public void setId(int idNum){
        this.idNum = idNum;
    }
    public void setAge(int age){
        this.age = age;
    }
    public Patient(int idNum, int age){
        this.idNum = idNum;
        this.age = age;
    }
            
    
}
