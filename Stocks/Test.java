/**
 * @author lukelmiller
 */

public class Test {
    public static void main(String[] args) {
        //Write a test program that creates a Stock object with the stock symbol ORCL , 
        //the name Oracle Corporation , and the previous closing price of 34.5 . Set a new current price to 34.35 and display the price-change percentage.
        
        Stock oC = new Stock();
        oC.symbol = "ORCL";
        oC.name = "Oracle Corporation";
        oC.previousClosingPrice = 34.5;
        oC.currentPrice = 34.35;
        Double percent = oC.getChangePercent();
        oC.printStock(percent);
    }
}
