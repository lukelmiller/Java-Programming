/**
 * @author lukelmiller
 */

public class Stock {
    String symbol;
    String name;
    Double previousClosingPrice;
    Double currentPrice;
    
    public Double getChangePercent(){
        Double percent = (currentPrice - previousClosingPrice)/previousClosingPrice*100;
        return percent;
    }
    public void printStock(Double percent){
                System.out.printf("%s %s\nOriginal Price: %.2f\nCurrent Price: %.2f\nPercentage Change: %s %.2f", symbol, name, previousClosingPrice, currentPrice, "%", percent);
    }
}
