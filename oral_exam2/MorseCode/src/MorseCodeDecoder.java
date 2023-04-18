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
                String engLetter = "";
                if (Objects.equals(j, ".-")) { //converting all letters from bases that use them
                    engLetter = "A";
                }
                if (Objects.equals(j, "-...")) {
                    engLetter = "B";
                }
                if (Objects.equals(j, "-.-.")) {
                    engLetter = "C";
                }
                if (Objects.equals(j, "-..")) {
                    engLetter = "D";
                }
                if (Objects.equals(j, ".")) {
                    engLetter = "E";
                }
                if (Objects.equals(j, "..-.")) {
                    engLetter = "F";
                }
                if (Objects.equals(j, "--.")) {
                    engLetter = "G";
                }
                if (Objects.equals(j, "....")) {
                    engLetter = "H";
                }
                if (Objects.equals(j, "..")) {
                    engLetter = "I";
                }
                if (Objects.equals(j, ".---")) {
                    engLetter = "J";
                }
                if (Objects.equals(j, "-.-")) {
                    engLetter = "K";
                }
                if (Objects.equals(j, ".-..")) {
                    engLetter = "L";
                }
                if (Objects.equals(j, "--")) {
                    engLetter = "M";
                }
                if (Objects.equals(j, "-.")) {
                    engLetter = "N";
                }
                if (Objects.equals(j, "---")) {
                    engLetter = "O";
                }
                if (Objects.equals(j, ".--.")) {
                    engLetter = "P";
                }
                if (Objects.equals(j, "--.-")) {
                    engLetter = "Q";
                }
                if (Objects.equals(j, ".-.")) {
                    engLetter = "R";
                }
                if (Objects.equals(j, "...")) {
                    engLetter = "S";
                }
                if (Objects.equals(j, "-")) {
                    engLetter = "T";
                }
                if (Objects.equals(j, "..-")) {
                    engLetter = "U";
                }
                if (Objects.equals(j, "...-")) {
                    engLetter = "V";
                }
                if (Objects.equals(j, ".--")) {
                    engLetter = "W";
                }
                if (Objects.equals(j, "-..-")) {
                    engLetter = "X";
                }
                if (Objects.equals(j, "-.--")) {
                    engLetter = "Y";
                }
                if (Objects.equals(j, "--..")) {
                    engLetter = "Z";
                }
                if (Objects.equals(j, "   ")) {
                    engLetter = " ";
                }
                decodedWord.add(engLetter);
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

