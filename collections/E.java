package LittleAlchemyCombinations.collections;

import java.util.Scanner;
import LittleAlchemyCombinations.AbstractAlpha;
import LittleAlchemyCombinations.*;

public class E extends AbstractAlpha{
    @Override
    public void alpha() {
        System.out.println("eagle\nearth\nearthquake\neclipse\negg\neggtimer\nelectriccar\nelectriceel\nelectrician\nelectricity\nemail\nenergy\nengineer\neruption\nexcalibur\nexplosion");
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String e = getInput.nextLine();
        switch(e){
            case "eagle" -> Combination.eagle();
            case "earth" -> Combination.earth();
            case "earthquake" -> Combination.earthquake();
            case "eclipse" -> Combination.eclipse();
            case "egg" -> Combination.egg();
            case "eggtimer" -> Combination.eggtimer();
            case "electriccar" -> Combination.electriccar();
            case "electriceel" -> Combination.electriceel();
            case "electrician" -> Combination.electrician();
            case "electricity" -> Combination.electricity();
            case "email" -> Combination.email();
            case "energy" -> Combination.energy();
            case "engineer" -> Combination.engineer();
            case "eruption" -> Combination.eruption();
            case "excalibur" -> Combination.excalibur();
            case "explosion" -> Combination.explosion();
        }
    }
}
