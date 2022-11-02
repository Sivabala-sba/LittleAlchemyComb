package LittleAlchemyCombinations.collections;

import java.util.Scanner;
import LittleAlchemyCombinations.AbstractAlpha;
import LittleAlchemyCombinations.*;
public class Q extends AbstractAlpha{
    @Override
    public void alpha() {
        System.out.println("quicksand\nquicksilver");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String q = input.nextLine();
        switch(q) {
            case "quicksand" -> Combination.quicksand();
            case "quicksilver" -> Combination.quicksliver();
        }
    }
}
