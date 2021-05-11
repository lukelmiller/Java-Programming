/**
 * @author lukelmiller
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class QuizGame {

    public static void main(String[] args) throws FileNotFoundException{
        
        Scanner scan = new Scanner(System.in);
        int score = 0;
        
        File fn = new File("importan.txt");
        
        Scanner readFile = new Scanner(fn);
        int prevScore = readFile.nextInt();
        
        
        ArrayList<String> que = new ArrayList<String>();
        que.add("Who was the orginal 'Chosen One'?\nA. Harry Potter\nB. Neville Longbottom\nC. Dumbledore");
        que.add("Which of these is NOT part of the Deathly Hallows?\nA. Wand\nB. Cloak\nC. Staff");
        que.add("Who is Harry's best friend?\nA.Draco Malfoy\n.Neville Longbottom\nC. Ron Weasley");
        que.add("Who dies saving Harry?\nA. Cedric Diggory\nB. Severus Snape\nC. Ron Weasley");
        que.add("Who kills Bellarix Lestrange?\nA. Molly Weasley\nB. Alan Rickman\nC. Austin Salazar");
      
        ArrayList<String> ans = new ArrayList<String>();
        ans.add("B");
        ans.add("C");
        ans.add("C");
        ans.add("A");
        ans.add("A");
        for(int i= 0; i < ans.size(); i++){
            
            System.out.println(que.get(i));
            System.out.println("Choose an option: ");
            String anser = scan.next();
            if (anser.equals(ans.get(i))){
                System.out.println("Correct");
                score++;
                
                
            };
            if (score > prevScore){
                PrintWriter pw = new PrintWriter(fn);
                pw.println(score);
                pw.close();
            
            }
        }
        }
        
    }
    

