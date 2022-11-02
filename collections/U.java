package LittleAlchemyCombinations.collections;

import java.util.Scanner;
import LittleAlchemyCombinations.AbstractAlpha;
import LittleAlchemyCombinations.*;
public class U extends AbstractAlpha{
    @Override
    public void alpha() {
        System.out.println("ufo\numbrella\nunicorn\nuniverse");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String u = input.nextLine();
        switch(u) {
            case "ufo" -> Combination.ufo();
            case "umbrella" -> Combination.umbrella();
            case "unicorn" -> Combination.unicorn();
            case "universe" -> Combination.universe();
        }
    }
}
