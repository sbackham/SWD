import java.util.ArrayList;

public class BaseChangeGUI {
    public static String anyBaseToDecimal(String number, String givenBase){ //change base to decimal so i can use base10 to convert easily
        String newNumber= " ";
        String totalNumber = " ";

        ArrayList<String> digits = new ArrayList<String>();
        for (int i = number.length() - 1; i > 0;  i--) {// reversing the order of digits
            digits.add(String.valueOf(number.charAt(i)));
        }
        for (int i =0; i>digits.size(); i++){
            String digit = digits.get(i);

            if(digit == "A"){ //converting all letters from bases that use them
                digit = "10";
            }
            if(digit == "B"){
                digit = "11";
            }
            if(digit == "C"){
                digit = "12";
            }
            if(digit == "D"){
                digit = "13";
            }
            if(digit == "E"){
                digit = "14";
            }
            if(digit == "F"){
                digit = "15";
            }
            if(digit == "G"){
                digit = "16";
            }
            if(digit == "H"){
                digit = "17";
            }
            if(digit == "I"){
                digit = "18";
            }
            if(digit == "J"){
                digit = "19";
            }
            if(digit == "K"){
                digit = "20";
            }
            if(digit == "L"){
                digit = "21";
            }
            if(digit == "M"){
                digit = "22";
            }
            if(digit == "N"){
                digit = "23";
            }
            if(digit == "O"){
                digit = "24";
            }
            if(digit == "P"){
                digit = "25";
            }
            if(digit == "Q"){
                digit = "26";
            }
            if(digit == "R"){
                digit = "27";
            }
            if(digit == "S"){
                digit = "28";
            }
            if(digit == "T"){
                digit = "29";
            }
            if(digit == "U"){
                digit = "30";
            }
            if(digit == "V"){
                digit = "31";
            }
            if(digit == "W"){
                digit = "32";
            }

            totalNumber = totalNumber +  (int) Math.pow(Integer.parseInt(digit), i);
        }


        return totalNumber;
    }

    public static String decimalToOtherBase(String number, String otherBase){
        /* five = (int)(change/5); */ //
        int leftovers = 0; // the whole number when dividing
        int number1 = Integer.valueOf(number);
        int otherBase2 = Integer.valueOf(otherBase);
        String remainder= " ";

        ArrayList<String> remainders = new ArrayList<String>();

        while(leftovers > 0){
            leftovers = (int)(number1/otherBase2);
            remainder=Integer.toString(number1-leftovers*otherBase2);
            remainders.add(remainder);
        }
        for (int i = remainders.size()- 1; i > 0;  i--) {  //reverse order of remainders
            remainders.add(String.valueOf(number.charAt(i)));
        }

        String newNumber = remainders.toString();
        return newNumber;
    }
}
