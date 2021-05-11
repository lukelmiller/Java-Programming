/**
 * @author lukemiller
 */

import java.io.*;

public class IO2 {
    public static void main(String[] args) {
        File fn = new File("printObject.txt");
        
        try{
            fn.createNewFile();
            PrintWriter pw = new PrintWriter(fn);
        } catch (FileNotFoundException e){
            e.getMessage();
        } catch (IOException e){
            e.getMessage();
        }
        
    }
    
}
