import java.util.Scanner;

/**
 * Runs the user interface
 */
public class MorseCodeDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * Gets the option to encode or deocde
         */
        System.out.println("Enter '1' if you are encoding English to Morse Code and enter '2' if you are decoding Morse to English" );
        int encodeOrDecode = scanner.nextInt();
        scanner.nextLine();

        /**
         * Gets the message to be encoded or decoded
         */
        System.out.println("You may enter the message you will be encoding or decoding. Do NOT add extra spaces in the beginning or end" );
        String message = scanner.nextLine();

        /**
         * Prints message depending on encode or decode
         */
        if(encodeOrDecode == 1){
            System.out.println("Here is your message encoded in Morse Code: ");
            System.out.println(MorseCodeDecoder.EnglishToMorse(message));
        }
        if(encodeOrDecode == 2){
            System.out.println("Here is your message decoded in English: ");
            System.out.println(MorseCodeDecoder.MorseToEnglish(message));
        }
    }
}