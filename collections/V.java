package LittleAlchemyCombinations.collections;

import java.util.Scanner;
import LittleAlchemyCombinations.AbstractAlpha;
import LittleAlchemyCombinations.*;
public class V extends AbstractAlpha{
    @Override
    public void alpha() {
        System.out.println("vacuum cleaner\nvampire\nvase\nvault\nvegetable\nvenus\nvillage\nvine\nvinegar\nvolcano\nvulture");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String v = input.nextLine();
        switch(v) {
            case "vacuum cleaner" -> Combination.vacuumcleaner();
            case "volcano" -> Combination.valcano();
            case "vampire" -> Combination.vampire();
            case "vas" -> Combination.vas();
            case "vault" -> Combination.vault();
            case "vegetable" -> Combination.vegetable();
            case "venus" -> Combination.venus();
            case "village" -> Combination.village();
            case "vine" -> Combination.vine();
            case "vinegar" -> Combination.vinegar();
            case "vulture" -> Combination.vulture();
        }
    }
}
