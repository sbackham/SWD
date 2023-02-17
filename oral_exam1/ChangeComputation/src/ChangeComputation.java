public class ChangeComputation {
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

        while(change>= 0){
            double leftoverTwenty = change%20;
            twenty = (int)(change/20);
            while(change>0){
                change =- twenty*20;
            }

            double leftoverTen = change%10;
            ten = (int)(leftoverTwenty/10);
            while(leftoverTwenty>0){
                change =- ten*10;
            }

            double leftoverFive = change%5;
            five = (int)(leftoverTen/5);
            while(leftoverTen>0){
                change =- five*5;
            }

            double leftoverOne = change%1;
            one = (int)(leftoverFive/1);
            while(leftoverFive>0){
                change =- one*1;
            }

            double leftoverQuarter = change%0.25;
            quarter = (int)(leftoverOne/0.25);
            while(leftoverOne>0){
                change =- quarter*0.25;
            }

            double leftoverDime = change%0.1;
            dime = (int)(leftoverQuarter/0.1);
            while(leftoverQuarter>0){
                change =- dime*0.1;
            }

            double leftoverNickle = change%0.05;
            nickle = (int)(leftoverDime/0.05);
            while(leftoverDime>0){
                change =- nickle*0.05;
            }

            double leftoverPenny = change%0.01;
            penny = (int)(leftoverNickle/0.01);
            while(leftoverNickle>=0){
                change =- penny*0.01;
            }
        }

        return ("Twenty: " + twenty+ "\nTens: " + ten + "\nFives: " +five+ "\nOnes: " +one+ "\nQuarters: "+ quarter + "\nDimes: " + dime
        + "\nNickles: " + nickle + "\nPennies: " + penny);
    }
}
