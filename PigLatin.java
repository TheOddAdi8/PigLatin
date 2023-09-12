//Adi Duggal 9/8/2023 PigLatin assignment

import java.util.Scanner;

public class PigLatin {

    public static void main(String[] args) {

        Scanner pigBot = new Scanner(System.in);

        String phrase;
        int len;
        String temp;
        String constant = "ay";

        System.out.print("Enter a word: ");

        phrase = pigBot.nextLine().toLowerCase();
        len = phrase.length();
        temp = phrase.substring(0, 1);
        if (temp.equals("a") || temp.equals("e") || temp.equals("i") || temp.equals("o") || temp.equals("u")) {
            System.out.println(phrase + "w" + constant);
        }
        else {
            System.out.println(phrase.substring(1, len) + temp + constant);
        }

        pigBot.close();

    }
}