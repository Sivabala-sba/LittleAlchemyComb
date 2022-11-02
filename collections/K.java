package LittleAlchemyCombinations.collections;

import java.util.Scanner;
import LittleAlchemyCombinations.AbstractAlpha;
import LittleAlchemyCombinations.*;

public class K extends AbstractAlpha{
    public void alpha() {
        System.out.println("Kaiju\nKatana\nKite\nKnife\nKnight");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String k = input.nextLine();
        switch (k) {
            case "kaiju" -> Combination.kaiju();
            case "katana" -> Combination.katana();
            case "kite" -> Combination.kite();
            case "knife" -> Combination.knife();
            case "knight" -> Combination.knight();
        }
    }
}
