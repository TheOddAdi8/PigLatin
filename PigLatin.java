//Adi Duggal 9/8/2023 PigLatin assignment

import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args) {

        String word = "";

        int len = word.length()

        for (int i = 0; i < len; i++) {
            if (word[i].equals("a")) {
                System.out.println("Found the letter a");
            }
            word.substring(i, i + 1); //up to but not including i + 1
        }

    }
}