/**
 * @author lukelmiller
 */

package customer;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Game extends Product{
    private String rating;
    
    
    public Game(String itemCode, String itemName, String description, Double price, String rating) {
        super(itemCode, itemName, description, price);
        this.rating = rating;
    }
    
    public void display(){
        //System.out.println("Games Available:");
        super.display();
        
    }
    
    
}
