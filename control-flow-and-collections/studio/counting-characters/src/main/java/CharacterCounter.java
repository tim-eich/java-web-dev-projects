import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class CharacterCounter {
    public static void main(String[] args) {
        String paragraph = "If the product of two terms is zero then common sense says at least one of the two terms has to be" +
                " zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that " +
                "can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty " +
                "straightforward from there.";

        char[] charsInString = paragraph.toCharArray();
        HashMap<Character, Integer> characterCount = new HashMap<>();
        for (int i = 0; i < charsInString.length; i++) {
            //System.out.println(charsInString[i]);
            if (characterCount.keySet().contains(charsInString[i])) {
                characterCount.put(charsInString[i], characterCount.get(charsInString[i]) + 1);
            } else {
                characterCount.put(charsInString[i], 1);
            }
        }
        for (char i : characterCount.keySet()) {
            System.out.println(i + ": " + characterCount.get(i));
        }
    }
}
