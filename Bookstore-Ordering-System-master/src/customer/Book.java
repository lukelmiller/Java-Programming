/**
 * @author lukelmiller
 */

package customer;

import java.io.*;
import java.util.Scanner;

public class Book extends Product{
    private String author;
    
    
    
    public Book(String itemCode, String itemName, String description, Double price, String author) {
        super(itemCode, itemName, description, price);
        this.author = author;
    }
    public void display(){
        //System.out.println("Books Available:");
        super.display();
        
    }
    
}
