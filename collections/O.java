package LittleAlchemyCombinations.collections;

import java.util.Scanner;
import LittleAlchemyCombinations.AbstractAlpha;
import LittleAlchemyCombinations.*;
public class O extends AbstractAlpha{
    public void alpha() {
        System.out.println("Oasis\nObsidian\nOcean\nOil\nOmelette\nOptical Fiber\nOrchard\nOre\nOrganic Matter\nOrigami\nOstrich\nOwl\nOxygen\nOzone");
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
