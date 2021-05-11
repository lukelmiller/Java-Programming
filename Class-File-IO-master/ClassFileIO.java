/**
 * @author lukemiller
 */

import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;

public class ClassFileIO {

    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("important.txt");
        System.out.println(file.exists());
        if(!file.exists()){
            PrintWriter pw = new PrintWriter("important.txt");
            pw.println("Something new new");
            pw.close();
        }

    }
    
}
