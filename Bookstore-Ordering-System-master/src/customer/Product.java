/**
 * @author lukelmiller
 */

package customer;

public class Product {
    private String itemCode;
    String itemName;
    double price;
    String description;

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }
    
    public String getItemCode() {
        return itemCode;
    }
    
    public Product(String itemCode, String itemName, String description, Double price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.description = description;
        this.price = price;
    }
    
    public void display(){
        
        System.out.printf("%s %s\n", itemCode, itemName);
        
    }
    
    
    
    
    
    
}
