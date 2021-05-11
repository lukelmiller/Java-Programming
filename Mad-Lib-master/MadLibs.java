/**
 * @author lukelmiller
 */

import java.util.Scanner;

public class MadLibs {
    
    public static void main(String[] args) {
        Scanner theInputObject = new Scanner(System.in);
        System.out.println("Please type a PLURAL NOUN, followed buy the RETURN key");
        String pluralNoun = theInputObject.nextLine();
        System.out.println("Please type a PLURAL NOUN, followed buy the RETURN key");
        String pluralNoun2 = theInputObject.nextLine();
        System.out.println("Please type a BODY PART, followed buy the RETURN key");
        String bodyPart = theInputObject.nextLine();
        System.out.println("Please type your favorite PHRASE followed buy the RETURN key");
        String phrase = theInputObject.nextLine();
        System.out.println("Please type a whole NUMBER");
        int aNumber = theInputObject.nextInt();
        
        System.out.println("Ducks have arroused the curiousity of " + pluralNoun +" for decades. The duck is cutest of all living "+ pluralNoun2 + ", but scientists are unable to explain how it got its long " + bodyPart +". Sometimes when I look at ducks I think "+ phrase +"! There must be at least "+ aNumber + " ducks in my head at all times.");
        theInputObject.close();
        
        
    }
    
}
