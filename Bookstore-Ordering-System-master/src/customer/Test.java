/**
 * @author lukelmiller
 */

package customer;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;


public class Test {
    
    
    
    
    
    public static void main(String[] args) throws FileNotFoundException{
        
        
        //Import Book Inventory
        ArrayList<Book> book = new ArrayList<Book>();
        
        File fn = new File("Books.txt");
        //System.out.println(fn.exists());
        String[] line = new String[5];
        
        try{
            Scanner readFile = new Scanner(fn);
            while(readFile.hasNext()){
                line = readFile.nextLine().split(",");
                
                
                for(int i = 4; i < line.length; i++){
                    String itemCode = line[0];
                    String itemName = line[1];
                    String description = line[2];
                    Double price = Double.parseDouble(line[3]);
                    String author = line[4];
                    Book bk = new Book(itemCode, itemName, description, price, author);
                    book.add(bk);
                }
            }
        }catch (FileNotFoundException e){
            e.getMessage();
        }
        
        //Import Game Inventory
        File fng = new File("Games.txt");
        //System.out.println(fng.exists());
        String[] lineg = new String[5];
        ArrayList<Game> game = new ArrayList<Game>();
        
        try{
            Scanner readFile = new Scanner(fng);
            while(readFile.hasNext()){
                line = readFile.nextLine().split(",");
                
                for(int i = 4; i < lineg.length; i++){
                    String itemCode = line[0];
                    String itemName = line[1];
                    String description = line[2];
                    Double price = Double.parseDouble(line[3]);
                    String rating = line[4];
                    Game gm = new Game(itemCode, itemName, description, price, rating);
                    game.add(gm);
                }
            }
        }catch (FileNotFoundException e){
            e.getMessage();
        }
        
        
       
        
        Scanner key = new Scanner(System.in);
        System.out.println("WELCOME TO FROGGY’S BOOK STORE!");
        System.out.println("Your Name: ");
        String inp = key.nextLine();
        Customer cf = new Customer();
        cf.setName(inp);
        System.out.println("Books Available:");
        for(int i=0; i<book.size(); i++){
            book.get(i).display();
        }
        
        System.out.println("\nGames Available:");
        for(int i=0; i<game.size(); i++){
            game.get(i).display();
        }
        //Which would you like? A100 	You chose World of Crafting. How many would you like? 2
	//Qty: 2 	Item: World of Crafting
	//Price: 4.95  	SubTotal: 9.90
	//Would you like another item? Y or N
        
        Double subtotal = 0.0;
        Double tax = .076;
        
        
        ArrayList<CartItem> prods = new ArrayList<CartItem>();
        
        String flag ="";
        int count = 0;
        
        while(!"N".equals(flag)){
            
            System.out.println("Which would you like? ");
            inp = key.next();
            for(int i=0; i<book.size(); i++){
                if(inp.equals(book.get(i).getItemCode())){
                    CartItem prod = new CartItem();
                    prod.itemPurchased = book.get(i);
                    prods.add(prod);
                }
                
            }
            for(int i=0; i<game.size(); i++){
                if(inp.equals(game.get(i).getItemCode())){
                    CartItem prod = new CartItem();
                    prod.itemPurchased = game.get(i);
                    prods.add(prod);
                }
            } 
            System.out.println("You chose "+ prods.get(count).itemPurchased.itemName );
            System.out.println("How many would you like? ");
            int inp2 = key.nextInt();
            prods.get(count).qty = inp2;
            System.out.println("Qty: " + prods.get(count).qty);
            System.out.println("Item: " + prods.get(count).itemPurchased.itemName);
            System.out.println("Price: $"+ prods.get(count).itemPurchased.price);
            
            subtotal = subtotal + prods.get(count).itemPurchased.price*prods.get(count).qty;
            System.out.printf("Subtotal: $%.2f\n", subtotal);
            System.out.println("Would you like another item? Y or N");
            flag = key.next();
            
            count++;
        }
        tax = subtotal*tax;
        Double total = subtotal + tax;
        
        PrintWriter pw = new PrintWriter(cf.getName()+".txt");
            
        pw.println("**********************************************************\n" +
        "Thank you " + cf.getName()+ " for your purchase at Froggy’s Book and Game Store\n" +
        "**********************************************************");
        System.out.println("Qty		Item                        Price			Total\n");
        for(int i=0; i<prods.size(); i++){
                pw.printf("%d\t\t%s\t\t$%.2f\t\t$%.2f\n",prods.get(i).qty,prods.get(i).itemPurchased.itemName, prods.get(i).itemPurchased.price,prods.get(i).qty*prods.get(i).itemPurchased.price);
        }
        pw.printf("Subtotal: $%.2f\n", subtotal);
        pw.printf("Tax: $%.2f\n", tax);
        pw.printf("Total: $%.2f\n",total);
        pw.close();
                           
                
                

    }
}
