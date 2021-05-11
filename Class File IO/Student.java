/**
 * @author lukemiller
 */

import java.io.*;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        File fn = new File("students.txt");
        String[] line = new String[5];
        
        try{
            Scanner readFile = new Scanner(fn);
            
            while(readFile.hasNext()){
                line = readFile.nextLine().split(",");
                for(String stuff: line){
                    System.out.println(stuff);
                }
            }
        }catch (FileNotFoundException e){
            e.getMessage();
        }
    }
}
