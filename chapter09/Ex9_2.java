public class Ex9_2{
    public static void main(String[] args){
        Stock stock1 = new Stock("ORCL","Oracle Corporation");
        stock1.setPreviousClosingPrice(34.5);
        stock1.setCurrentPrice(34.35);
        System.out.printf("The price-change percentage for stock 1 is %.2f%%.", stock1.getChangePercent());
    }
}

class Stock{
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name){
    }

    public void setPreviousClosingPrice(double previousClosingPrice){
        this.previousClosingPrice = previousClosingPrice;
    }
    
    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }

    public double getChangePercent(){
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }

}
/* Write a test
program that creates a Stock object with the stock symbol ORCL, the name
Oracle Corporation, and the previous closing price of 34.5. Set a new current
price to 34.35 and display the price-change percentage. */