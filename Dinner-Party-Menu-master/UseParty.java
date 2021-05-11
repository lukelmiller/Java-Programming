/**
 * @author lukelmiller
 */

import java.util.Scanner;

public class UseParty {

    public static void main(String[] args) {
       
        int guests;
        Party aParty = new Party();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of guests for the party >> ");
        guests = keyboard.nextInt();
        aParty.setGuests(guests);
        System.out.println("The party has "+aParty.getGuests() + " guests");
        aParty.displayInvitation();
        int choice;
        DinnerParty aDinnerParty = new DinnerParty();
        System.out.println("Enter number of guests for the dinner party >> ");
        guests = keyboard.nextInt();
        aDinnerParty.setGuests(guests);
        System.out.println("Enter the menu options - 1 for chicken or 2 for Beef >>");
        choice = keyboard.nextInt();
        aDinnerParty.setDinnerChoice(choice);
        System.out.println("The dinner party has " + aDinnerParty.getGuests() + " guests");
        System.out.println("Menu option " + aDinnerParty.getDinnerChoice() + " will be served");
        keyboard.close();
    }
    
}
