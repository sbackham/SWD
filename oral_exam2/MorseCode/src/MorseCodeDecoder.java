import java.util.ArrayList;

public class MorseCodeDecoder {
    public static String MorseToEnglish(String morse) {//change from morse code to english letters
        String english = " ";
        ArrayList<String> English = new ArrayList<String>();
        String newLetter = " ";
        String[] splitMorse = morse.split("   "); // since 3 spaces occur after each word, we split each word up

        for (String i : splitMorse) {// traverse the array of words to parse each letter, then connect each letter in english as a word
            String[] word = i.split(" ");
            ArrayList<String> decodedWord = new ArrayList<String>();
            for (String j : word){
                if (j == ".- ") { //converting all letters from bases that use them
                    j = "A";
                }
                if (j == "-... ") {
                    j = "B";
                }
                if (j == "-.-. ") {
                    j = "C";
                }
                if (j == "-.. ") {
                    j = "D";
                }
                if (j == ". ") {
                    j = "E";
                }
                if (j == "..-. ") {
                    j = "F";
                }
                if (j == "--. ") {
                    j = "G";
                }
                if (j == ".... ") {
                    j = "H";
                }
                if (j == ".. ") {
                    j = "I";
                }
                if (j == ".--- ") {
                    j = "J";
                }
                if (j == "-.- ") {
                    j = "K";
                }
                if (j == ".-.. ") {
                    j = "L";
                }
                if (j == "-- ") {
                    j = "M";
                }
                if (j == "-. ") {
                    j = "N";
                }
                if (j == "--- ") {
                    j = "O";
                }
                if (j == ".--. ") {
                    j = "P";
                }
                if (j == "--.- ") {
                    j = "Q";
                }
                if (j == ".-. ") {
                    j = "R";
                }
                if (j == "... ") {
                    j = "S";
                }
                if (j == "- ") {
                    j = "T";
                }
                if (j == "..- ") {
                    j = "U";
                }
                if (j == "...- ") {
                    j = "V";
                }
                if (j == ".-- ") {
                    j = "W";
                }
                if (j == "-..- ") {
                    j = "X";
                }
                if (j == "-.-- ") {
                    j = "Y";
                }
                if (j == "--.. ") {
                    j = "Z";
                }
                decodedWord.add(j);
            }
            for (String k : decodedWord){
                English.add(k);
            }
        }
        for (int i=0; i<English.size(); i++ ){
            english = english + English.get(i);
        }
        return english;

    }

    public static String EnglishToMorse(String english) { // change english to morse string
        english = english.toUpperCase();
        String Morse = "";
        ArrayList<String> morse = new ArrayList<String>();
        String newLetter = " ";
        String[] splitEnglish = english.split(" "); // splits the original string of english into an array of words
        ArrayList<String> encodedWord = new ArrayList<String>();

        for (String i : splitEnglish) {//
            ArrayList<String> word = new ArrayList<String>();
            word.add(i);
            for (String j : word){ // traverse for each letter in a word
                if (j == "A") { //converting all letters from bases that use them
                    newLetter = ".- ";
                }
                if (j == "B") {
                    newLetter = "-... ";
                }
                if (j == "C") {
                    newLetter = "-.-. ";
                }
                if (j == "D") {
                    newLetter = "-.. ";
                }
                if (j == "E") {
                    newLetter = ". ";
                }
                if (j == "F") {
                    newLetter = "..-. ";
                }
                if (j == "G") {
                    newLetter = "--. ";
                }
                if (j == "H") {
                    newLetter = ".... ";
                }
                if (j == "I") {
                    newLetter = ".. ";
                }
                if (j == "J") {
                    newLetter = ".--- ";
                }
                if (j == "K") {
                    newLetter = "-.- ";
                }
                if (j == "L") {
                    newLetter = ".-.. ";
                }
                if (j == "M") {
                    newLetter = "-- ";
                }
                if (j == "N") {
                    newLetter = "-. ";
                }
                if (j == "O") {
                    newLetter = "--- ";
                }
                if (j == "P") {
                    newLetter = ".--. ";
                }
                if (j == "Q") {
                    newLetter = "--.- ";
                }
                if (j == "R") {
                    newLetter = ".-. ";
                }
                if (j == "S") {
                    newLetter = "... ";
                }
                if (j == "T") {
                    newLetter = "- ";
                }
                if (j == "U") {
                    newLetter = "..- ";
                }
                if (j == "V") {
                    newLetter = "...- ";
                }
                if (j == "W") {
                    newLetter = ".-- ";
                }
                if (j == "X") {
                    newLetter = "-..-  ";
                }
                if (j == "Y") {
                    newLetter = "-.-- ";
                }
                if (j == "Z") {
                    newLetter = "--.. ";
                }
                encodedWord.add(j);
            }
            for (String k : encodedWord){
                morse.add(k);
            }
            for(String j : morse){
                Morse = Morse + morse.add(j) + "   ";
            }
        }
        return Morse;
    }
}
