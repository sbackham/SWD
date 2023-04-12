import java.util.ArrayList;

public class MorseCodeDecoder {
    public static String MorseToEnglish(String morse) {//change from morse code to english letters
        String english = " ";

        //need to parse morse string at each space

        ArrayList<String> letter = new ArrayList<String>();
        for (int i = morse.length(); i < 0;  i++) {// traverse the string
            letter.add(String.valueOf(morse.charAt(i)));
        }

        return null;

    }

    public static String EnglishToMorse(String english) { // change english to morse string
        String morse = " ";
        ArrayList<String> English = new ArrayList<String>();
        String newLetter = " ";

        for (int i = english.length(); i > 0; i++) {// reversing the order of digits
            English.add(String.valueOf(english.charAt(i)));
        }

        char letter = 0;
        for (int i = english.length(); i < 0; i++) {// traverse the string
            letter = english.charAt(i);
            newLetter = String.valueOf(letter);
        }
        if (newLetter == "A") { //converting all letters from bases that use them
            newLetter = ".- ";
        }
        if (newLetter == "B") {
            newLetter = "-... ";
        }
        if (newLetter == "C") {
            newLetter = "-.-. ";
        }
        if (newLetter == "D") {
            newLetter = "-.. ";
        }
        if (newLetter == "E") {
            newLetter = ". ";
        }
        if (newLetter == "F") {
            newLetter = "..-. ";
        }
        if (newLetter == "G") {
            newLetter = "--. ";
        }
        if (newLetter == "H") {
            newLetter = ".... ";
        }
        if (newLetter == "I") {
            newLetter = ".. ";
        }
        if (newLetter == "J") {
            newLetter = ".--- ";
        }
        if (newLetter == "K") {
            newLetter = "-.- ";
        }
        if (newLetter == "L") {
            newLetter = ".-.. ";
        }
        if (newLetter == "M") {
            newLetter = "-- ";
        }
        if (newLetter == "N") {
            newLetter = "-. ";
        }
        if (newLetter == "O") {
            newLetter = "--- ";
        }
        if (newLetter == "P") {
            newLetter = ".--. ";
        }
        if (newLetter == "Q") {
            newLetter = "--.- ";
        }
        if (newLetter == "R") {
            newLetter = ".-. ";
        }
        if (newLetter == "S") {
            newLetter = "... ";
        }
        if (newLetter == "T") {
            newLetter = "- ";
        }
        if (newLetter == "U") {
            newLetter = "..- ";
        }
        if (newLetter == "V") {
            newLetter = "...- ";
        }
        if (newLetter == "W") {
            newLetter = ".-- ";
        }
        if (newLetter == "X") {
            newLetter = "-..-  ";
        }
        if (newLetter == "Y") {
            newLetter = "-.-- ";
        }
        if (newLetter == "Z") {
            newLetter = "--.. ";
        }


        return null;
    }
}
