/**
 * @author lukelmiller
 */

import java.util.Scanner;

public class VorC {

    public static void main(String[] args) {
        System.out.println("Enter a letter: ");
        Scanner sc = new Scanner(System.in);
        String userLetter = sc.nextLine();
        char le = userLetter.charAt(0);
        if(le == 97 || le ==65|| le ==69|| le ==101|| le ==73|| le ==105|| le ==79|| le ==111|| le ==85|| le ==117){
        System.out.println("is a vowel");
        }else if((le >= 65 && le <= 90) || (le >= 97 && le <= 122 )){
            System.out.println("is a consonant");
        }else{
            System.out.println("is an invalid input");
        }
        sc.close();
    }
    
}
