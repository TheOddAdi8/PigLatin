//Adi Duggal 9/8/2023 PigLatin assignment

import java.util.Scanner;

public class PigLatin {

    char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
    char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) {

        Scanner pigBot = new Scanner(System.in);

        String word = pigBot.nextLine();

        word = word.toLowerCase();

        int len = word.length();

        //int consonantsLen = 21;
        //int vowelsLen = 5;

        /*for (int i = 0; i < len; i++) {
            for(int j = 0; j < consonantsLen; j++) {}
                if (word.charAt(i) == 'a') {
                    System.out.println("Found the letter 'a' at position " + i);
                }
                word.substring(i, i + 1); //up to but not including i + 1
            }
        }*/

        char letter;

        for (int k = 0; k < len; k++) {
            letter = word.charAt(k);
            for (int l = 0; l < 21; l++) {
                
            }
            word.substring(0, k + 1);

        }

        pigBot.close();

    }
}