/**
 * @author lukelmiller
 */
import java.util.ArrayList;
import java.util.Scanner;

public class WeddingPlanner {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);


        System.out.println("What is the Bride's Name?");
        String bfn = inp.next();
        String bln = inp.next();
        System.out.println("What is the Groom's Name?");
        String gfn = inp.next();
        String gln = inp.next();
        inp.nextLine();
        System.out.println("Date of wedding: [yyyy mm dd]");
        //inp.nextLine();
        String wd = inp.nextLine();
        System.out.println("What is the location? ");
        String loc = inp.nextLine();
        
        ArrayList<Guest> gue = new ArrayList<Guest>();
        String flag = "no";
        while(!"quit".equals(flag)){
            System.out.println("Guest Name: [enter 'quit' to stop]");
            String gufn = inp.next();
            //System.out.println(gufn);
            if("quit".equals(gufn)){
                flag=gufn;
                break;
            }
            String guln = inp.next();
            flag=gufn;
            gue.add(new Guest(gufn,guln));
        }
        
        Wedding weddin = new Wedding(bfn,bln,gfn,gln,wd,loc,gue);
        
        System.out.printf("Details of %s %s and %s %s Wedding\n", weddin.getcTb().getBride().getFirstName(),weddin.getcTb().getBride().getLastName(), weddin.getcTb().getGroom().getFirstName(), weddin.getcTb().getGroom().getLastName());
        System.out.printf("The wedding will be held at %s\n", weddin.getLocation());
        System.out.println(weddin.getWedDate());
        for(int temp=0; temp < gue.size(); temp++){
            System.out.printf("%s %s RSVP'd: %s\n", weddin.getGuests(temp).getGuest().getFirstName(), weddin.getGuests(temp).getGuest().getLastName(), weddin.getGuests(temp).getRsvpDate());
        }
        
        inp.close();
    }
    
}
