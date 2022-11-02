package LittleAlchemyCombinations.collections;

import java.util.Scanner;
import LittleAlchemyCombinations.AbstractAlpha;
import LittleAlchemyCombinations.*;
public class Y extends AbstractAlpha{
    @Override
    public void alpha() {
        System.out.println("yeti\nyoghurt");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String y = input.nextLine();
        switch(y) {
            case "yeti" -> Combination.yeti();
            case "yoghurt" -> Combination.yoghurt();
        }
    }
}
