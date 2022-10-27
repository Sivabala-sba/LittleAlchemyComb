package LittleAlchemyCombinations.collections;

import java.util.Scanner;
import LittleAlchemyCombinations.AbstractAlpha;
import LittleAlchemyCombinations.*;

public class L extends AbstractAlpha{
    public void alpha() {
        System.out.println("Lake\nLamp\nLand\nLaptop\nLasso\nLava\nLava Lamp\nLawn\nLawn Mower\nLeaf\nLeather\nLegend\nLens\nLetter\nLibrarian\nLibrary\nLife\nLight\nLight Bulb\nLight Sword\nLighthouse\nLightning\nLion\nLiquid\nLittle Alchemy\nLivestock\nLizard\nLog Cabin\nLove\nLumberjack");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String l = input.nextLine();
        switch (l) {
            case "lake" -> Combination.lake();
            case "lamp" -> Combination.lamp();
            case "land" -> Combination.land();
            case "laptop" -> Combination.laptop();
            case "lasso" -> Combination.lasso();
            case "lava" -> Combination.lava();
            case "lava lamp" -> Combination.lavalamp();
            case "lawn" -> Combination.lawn();
            case "lawn mower" -> Combination.lawnmover();
            case "leaf" -> Combination.leaf();
            case "leather" -> Combination.leather();
            case "legend" -> Combination.legend();
            case "lens" -> Combination.lens();
            case "letter" -> Combination.letter();
            case "librarian" -> Combination.librarian();
            case "library" -> Combination.library();
            case "life" -> Combination.life();
            case "light" -> Combination.light();
            case "light bulb" -> Combination.lightbulb();
            case "light sword" -> Combination.lightsword();
            case "lighthouse" -> Combination.lighthouse();
            case "lightning" -> Combination.lightning();
            case "lion" -> Combination.lion();
            case "liquid" -> Combination.liquid();
            case "little alchemy" -> Combination.littlealchemy();
            case "livestock" -> Combination.livestock();
            case "lizard" -> Combination.lizard();
            case "log cabin" -> Combination.logcabin();
            case "love" -> Combination.love();
            case "lumberjack" -> Combination.lumberjack();
        }
    }
}
