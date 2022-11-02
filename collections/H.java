package LittleAlchemyCombinations.collections;

import java.util.Scanner;
import LittleAlchemyCombinations.AbstractAlpha;
import LittleAlchemyCombinations.*;

public class H extends AbstractAlpha{
    @Override
    public void alpha() {
        System.out.println("hacker\nhail\nham\nhamburger\nhammer\nhamster\nhangar\nharp\nhay\nhaybale\nheat\nhedge\nhedgehog\nhelicopter\nhero\nhill\nhippo\nhoney\nhorizon\nhorse\nhorseshoe\nhospital\nhotchocolate\nhourglass\nhouse\nhuman\nhummingbird\nhurricane\nhusky");
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String h = getInput.nextLine();
        switch (h) {
            case "hacker" -> Combination.hacker();
            case "hail" -> Combination.hail();
            case "ham" -> Combination.ham();
            case "hamburger" -> Combination.hamburger();
            case "hammer" -> Combination.hammer();
            case "hamster" -> Combination.hamster();
            case "hanger" -> Combination.hanger();
            case "harp" -> Combination.harp();
            case "hey" -> Combination.hay();
            case "haybale" -> Combination.haybale();
            case "heat" -> Combination.heat();
            case "hedge" -> Combination.hedge();
            case "hedgehog" -> Combination.hedgehog();
            case "helicopter" -> Combination.helicopter();
            case "hero" -> Combination.hero();
            case "hill" -> Combination.hill();
            case "hippo" -> Combination.hippo();
            case "honey" -> Combination.honey();
            case "horizon" -> Combination.horizon();
            case "horse" -> Combination.horse();
            case "horseshoe" -> Combination.horseshoe();
            case "hospital" -> Combination.hospital();
            case "hotchocolate" -> Combination.hotchocolate();
            case "hourglass" -> Combination.hourglass();
            case "house" -> Combination.house();
            case "human" -> Combination.human();
            case "hummingbird" -> Combination.hummingbird();
            case "hurricane" -> Combination.hurricane();
            case "husky" -> Combination.husky();
        }
    }
}
