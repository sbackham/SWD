public class changeComputation {
    public static double convertEuroToUSD(double euroPrice){// decided to use euro = 1.0654386 dollars
        double usd = euroPrice*1.0654386; //this is fine but we need to round to the nearest penny
        double extra = usd%0.01; //the extra cents less than pennies is accounted for
        usd  = Math.round(usd * 100.0) / 100.0;
        if(extra > 0){ // we add an extra penny if needed
            usd += 0.01;
        }
        return usd;
    }

    public static double convertUSDtoEuro(double usd){ //same as Euro to USD just inverse
        double euro = usd/1.0654386;
        double extra = euro%0.01;
        euro = Math.round(euro * 100.0) / 100.0;
        if(extra > 0){
            euro += 0.01;
        }
        return euro;
    }

    public static double computeChange(double totalPriceEuro, double customerPaid){
        customerPaid = convertUSDtoEuro(customerPaid);
        double change = customerPaid-totalPriceEuro;
        change = Math.round(change * 100.0) / 100.0;
        return change;
    }
}
