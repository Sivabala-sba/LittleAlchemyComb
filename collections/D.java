package LittleAlchemyCombinations.collections;

import java.util.Scanner;
import LittleAlchemyCombinations.AbstractAlpha;
import LittleAlchemyCombinations.*;

public class D extends AbstractAlpha{
    @Override
    public void alpha() {
        System.out.println("dam\ndarkness\ndawn\nday\ndeath\ndesert\ndew\ndiamond\ndinosaur\ndiver\ndoctor\ndog\ndoge\ndoghouse\ndomestication\ndonquixote\ndonut\ndoublerainbow!\ndough\ndragon\ndrone\ndrum\ndrunk\ndryice\nduck\nduckling\ndune\ndust\ndynamite");
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the Word : ");
        String d = getInput.nextLine();
        switch (d) {
            case "dam" -> Combination.dam();
            case "darkness" -> Combination.darkness();
            case "dawn" -> Combination.dawn();
            case "day" -> Combination.day();
            case "death" -> Combination.death();
            case "desert" -> Combination.desert();
            case "dew" -> Combination.dew();
            case "diamond" -> Combination.diamond();
            case "dinosaur" -> Combination.dinosaur();
            case "diver" -> Combination.diver();
            case "doctor" -> Combination.doctor();
            case "dog" -> Combination.dog();
            case "doge" -> Combination.doge();
            case "doghouse" -> Combination.doghouse();
            case "domestication" -> Combination.domestication();
            case "donquixote" -> Combination.donquixote();
            case "donut" -> Combination.donut();
            case "doublerainbow!" -> Combination.doublerainbow();
            case "dough" -> Combination.dough();
            case "dragon" -> Combination.dragon();
            case "drone" -> Combination.drone();
            case "drum" -> Combination.drum();
            case "drunk" -> Combination.drunk();
            case "dryice" -> Combination.dryice();
            case "duck" -> Combination.duck();
            case "duckling" -> Combination.duckling();
            case "dune" -> Combination.dune();
            case "dust" -> Combination.dust();
            case "dynamite" -> Combination.dynamite();
        }
    }
}
