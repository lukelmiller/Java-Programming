// @author Luke Miller
 
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int i=99; i>-1; i--){
            if(i>2)
                System.out.println(i + " bottles of beer on the wall, "+ i + " bottles of beer.\n Take one down, pass it around, "+ (i-1) + " bottles of beer on the wall...");
            else if(i==2){
                System.out.println(i + " bottles of beer on the wall, "+ i + " bottles of beer.\n Take one down, pass it around, "+ (i-1) + " bottle of beer on the wall...");
            }
            else if (i==1){
                System.out.println(i + " bottle of beer on the wall, "+ i + " bottle of beer.\n Take one down, pass it around no more bottles of beer on the wall...");
            }
            else if (i==0){
                System.out.println("No bottles of beer on the wall, no bottles of beer.\n Take one down, pass it around, we wish we had more bottles of beer on the wall...");
            }
        }
       
    }
    
}
