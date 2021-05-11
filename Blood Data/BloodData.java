// @author lukemiller

public class BloodData {
    
    private String type;
    private String rhFactor;
    
    public BloodData(){
        type = "O";
        rhFactor = "+";
    }
    public BloodData(String type, String rhFactor){
        this.type = type;
        this.rhFactor = rhFactor;
    }  
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }public void setRhFactor(String rhFactor){
        this.rhFactor = rhFactor;
    }
    public String getRhFactor(){
        return rhFactor;
    }
    
   
    
}
