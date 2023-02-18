public class ChangeComputation {
    public static double convertEuroToUSD(double euroPrice){// decided to use euro = 1.0654386 dollars
        double usd = euroPrice*1.0654386; //this is fine but we need to round to the nearest penny
        double extra = usd%0.01; //the extra cents less than pennies is accounted for
        if(extra > 0){ // we add an extra penny if needed
            usd += 0.01;
        }
        usd = Math.round(usd * 100.0) / 100.0;


        return usd;
    }

    public static double convertUSDtoEuro(double usd){ //same as Euro to USD just inverse
        double euro = usd/1.0654386;
        double extra = euro%0.01;
        if(extra > 0){
            euro += 0.01;
        }
        euro = Math.round(euro * 100.0) / 100.0;
        return euro;
    }

    public static double computeChange(double totalPriceEuro, double customerPaid){
        double change = customerPaid-totalPriceEuro;
        change = Math.round(change * 100.0) / 100.0;
        return change;
    }

    public static String getBillsBack(double change){
        int twenty = 0;
        int ten=0;
        int five=0;
        int one= 0;
        int quarter= 0;
        int dime= 0;
        int nickle= 0;
        int penny=0;

        while(change> 0.01){

            twenty = (int)(change/20);
            while (change>= 20){
                change = change - twenty*20;
            }

            ten = (int)(change/10);
            while(change>= 10){
                change = change - ten*10;
            }

            five = (int)(change/5);
            while(change>= 5){
                change = change - five*5;
            }

            one = (int)(change/1);
            while(change>=1){
                change = change - one*1;
            }

            quarter = (int)(change/0.25);
            while(change>= 0.25){
                change = change - quarter*0.25;
            }

            dime = (int)(change/0.1);
            while(change>=0.1){
                change = change - dime*0.1;
            }

            nickle = (int)(change/0.05);
            while(change>=0.05){
                change = change -nickle*0.05;
            }

            penny = (int)(change/0.01);
            while(change>0.01){
                change = change - penny*0.01;
            }
        }

        return ("Twenties: " + twenty+ "\nTens: " + ten + "\nFives: " +five+ "\nOnes: " +one+ "\nQuarters: "+ quarter + "\nDimes: " + dime
        + "\nNickles: " + nickle + "\nPennies: " + penny);
    }
}
