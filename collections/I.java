package LittleAlchemyCombinations.collections;

import java.util.Scanner;
import LittleAlchemyCombinations.AbstractAlpha;
import LittleAlchemyCombinations.*;

public class I extends AbstractAlpha{
    @Override
    public void alpha() {
        System.out.println("Ice\nIce Cream\nIce Cream Truck\nIce Sculpture\nIceberg\nIced Tea\nIdea\nIgloo\nInternet\nIsland\nIvy");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String i = input.nextLine();
        switch (i){
            case "ice" -> Combination.ice();
            case "ice cream" -> Combination.icecream();
            case "ice cream truck" -> Combination.icecreamtruck();
            case "ice sculpture" -> Combination.icesculpture();
            case "iceberg" -> Combination.iceberg();
            case "iced tea" -> Combination.icedtea();
            case "idea" -> Combination.idea();
            case "igloo" -> Combination.igloo();
            case "internet" -> Combination.internet();
            case "island" -> Combination.island();
            case "ivy" -> Combination.ivy();
        }
    }
}
