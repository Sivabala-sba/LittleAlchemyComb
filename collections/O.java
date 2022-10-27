package LittleAlchemyCombinations.collections;

import java.util.Scanner;
import LittleAlchemyCombinations.AbstractAlpha;
import LittleAlchemyCombinations.*;
public class O extends AbstractAlpha{
    public void alpha() {
        System.out.println("Lake\nLamp\nLand\nLaptop\nLasso\nLava\nLava Lamp\nLawn\nLawn Mower\nLeaf\nLeather\nLegend\nLens\nLetter\nLibrarian\nLibrary\nLife\nLight\nLight Bulb\nLight Sword\nLighthouse\nLightning\nLion\nLiquid\nLittle Alchemy\nLivestock\nLizard\nLog Cabin\nLove\nLumberjack");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String o = input.nextLine();
        switch (o) {
            case "oasis" -> Combination.oasis();
            case "obsidian" -> Combination.obsidian();
            case "ocean" -> Combination.ocean();
            case "oil" -> Combination.oil();
            case "omelette" -> Combination.omelette();
            case "optical fiber" -> Combination.opticalfibre();
            case "orchard" -> Combination.orchard();
            case "ore" -> Combination.ore();
            case "organic matter" -> Combination.organicmatter();
            case "origami" -> Combination.origami();
            case "ostrich" -> Combination.ostrich();
            case "owl" -> Combination.owl();
            case "oxygen" -> Combination.oxygen();
            case "ozone" -> Combination.ozone();
        }
    }
}
