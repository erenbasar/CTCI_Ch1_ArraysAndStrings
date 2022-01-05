package PermutationOfPalindrome;

import java.util.Hashtable;

public class PermutationOfPalindrome {

    public static boolean isPermutationOfPalindrome(String phrase) {
        Hashtable<Character,Integer> ht = new Hashtable<>();
        phrase = phrase.toLowerCase();

        for (int i = 0; i<phrase.length();i++){
            if(phrase.charAt(i) != ' ') {
                if (!ht.containsKey(phrase.charAt(i)))
                    ht.put(phrase.charAt(i), 1);
                else
                    ht.put(phrase.charAt(i), ht.get(phrase.charAt(i)) + 1);
            }
            System.out.println(ht);
        }

        int singleValue = 0;

        for (Integer value: ht.values()) {
            if(value%2 != 0 ) {
                singleValue++;
                if(singleValue > 1)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pali = "Pay ederek iki kerede yap";
        System.out.println(isPermutationOfPalindrome(pali));
    }

}
