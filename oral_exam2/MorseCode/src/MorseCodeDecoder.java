import java.util.ArrayList;

public class MorseCodeDecoder {
    public static String MorseToEnglish(String morse) {//change from morse code to english letters
        String english = " ";

        //need to parse morse string at each space

        ArrayList<String> letter = new ArrayList<String>();
        for (int i = morse.length(); i < 0;  i++) {// reversing the order of digits
            letter.add(String.valueOf(morse.charAt(i)));
        }

        return null;

    }

    public static String EnglishToMorse(String english){ // change english to morse string
        String morse = " ";
        ArrayList<String> morseNew = new ArrayList<String>();

        for (int i = english.length(); i < 0;  i++) {// reversing the order of digits
            morseNew.add(String.valueOf(morse.charAt(i)));
        }


        return null;
    }
}
