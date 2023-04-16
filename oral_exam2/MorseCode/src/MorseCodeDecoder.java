import java.util.ArrayList;
import java.util.Objects;

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
                if (Objects.equals(j, ".- ")) { //converting all letters from bases that use them
                    j = "A";
                }
                if (Objects.equals(j, "-... ")) {
                    j = "B";
                }
                if (Objects.equals(j, "-.-. ")) {
                    j = "C";
                }
                if (Objects.equals(j, "-.. ")) {
                    j = "D";
                }
                if (Objects.equals(j, ". ")) {
                    j = "E";
                }
                if (Objects.equals(j, "..-. ")) {
                    j = "F";
                }
                if (Objects.equals(j, "--. ")) {
                    j = "G";
                }
                if (Objects.equals(j, ".... ")) {
                    j = "H";
                }
                if (Objects.equals(j, ".. ")) {
                    j = "I";
                }
                if (Objects.equals(j, ".--- ")) {
                    j = "J";
                }
                if (Objects.equals(j, "-.- ")) {
                    j = "K";
                }
                if (Objects.equals(j, ".-.. ")) {
                    j = "L";
                }
                if (Objects.equals(j, "-- ")) {
                    j = "M";
                }
                if (Objects.equals(j, "-. ")) {
                    j = "N";
                }
                if (Objects.equals(j, "--- ")) {
                    j = "O";
                }
                if (Objects.equals(j, ".--. ")) {
                    j = "P";
                }
                if (Objects.equals(j, "--.- ")) {
                    j = "Q";
                }
                if (Objects.equals(j, ".-. ")) {
                    j = "R";
                }
                if (Objects.equals(j, "... ")) {
                    j = "S";
                }
                if (Objects.equals(j, "- ")) {
                    j = "T";
                }
                if (Objects.equals(j, "..- ")) {
                    j = "U";
                }
                if (Objects.equals(j, "...- ")) {
                    j = "V";
                }
                if (Objects.equals(j, ".-- ")) {
                    j = "W";
                }
                if (Objects.equals(j, "-..- ")) {
                    j = "X";
                }
                if (Objects.equals(j, "-.-- ")) {
                    j = "Y";
                }
                if (Objects.equals(j, "--.. ")) {
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
        String newLetter = "";
        String[] splitEnglish = english.split(" "); // splits the original string of english into an array of words
        ArrayList<String> encodedWord = new ArrayList<String>();

        for (int i =0; i < splitEnglish.length; i++) {//
            ArrayList<String> word = new ArrayList<String>();
            word.add(splitEnglish[i]);
            for (int j =0; j < english.length(); j++){ // traverse for each letter in a word
                String J = String.valueOf(english.charAt(j));
                if (Objects.equals(J, "A")) { //converting all letters from bases that use them
                    newLetter = ".- ";
                }
                if (Objects.equals(J, "B")) {
                    newLetter = "-... ";
                }
                if (Objects.equals(J, "C")) {
                    newLetter = "-.-. ";
                }
                if (Objects.equals(J, "D")) {
                    newLetter = "-.. ";
                }
                if (Objects.equals(J, "E")) {
                    newLetter = ". ";
                }
                if (Objects.equals(J, "F")) {
                    newLetter = "..-. ";
                }
                if (Objects.equals(J, "G")) {
                    newLetter = "--. ";
                }
                if (Objects.equals(J,  "H")) {
                    newLetter = ".... ";
                }
                if (Objects.equals(J, "I")) {
                    newLetter = ".. ";
                }
                if (Objects.equals(J, "J")) {
                    newLetter = ".--- ";
                }
                if (Objects.equals(J, "K")) {
                    newLetter = "-.- ";
                }
                if (Objects.equals(J, "L")) {
                    newLetter = ".-.. ";
                }
                if (Objects.equals(J, "M")) {
                    newLetter = "-- ";
                }
                if (Objects.equals(J, "N")) {
                    newLetter = "-. ";
                }
                if (Objects.equals(J, "O")) {
                    newLetter = "--- ";
                }
                if (Objects.equals(J, "P")) {
                    newLetter = ".--. ";
                }
                if (Objects.equals(J, "Q")) {
                    newLetter = "--.- ";
                }
                if (Objects.equals(J, "R")) {
                    newLetter = ".-. ";
                }
                if (Objects.equals(J, "S")) {
                    newLetter = "... ";
                }
                if (Objects.equals(J, "T")) {
                    newLetter = "- ";
                }
                if (Objects.equals(J, "U")) {
                    newLetter = "..- ";
                }
                if (Objects.equals(J, "V")) {
                    newLetter = "...- ";
                }
                if (Objects.equals(J, "W")) {
                    newLetter = ".-- ";
                }
                if (Objects.equals(J, "X")) {
                    newLetter = "-..-  ";
                }
                if (Objects.equals(J, "Y")) {
                    newLetter = "-.-- ";
                }
                if (Objects.equals(J, "Z")) {
                    newLetter = "--.. ";
                }
                if (Objects.equals(J, " ")) {
                    newLetter = "   ";
                    i++;
                }
                encodedWord.add(newLetter); //add each letter to create a new encoded word
            }
            String space = "  ";
            encodedWord.add(space);
            Morse = Morse + encodedWord;
        }
        return Morse;
    }
}
