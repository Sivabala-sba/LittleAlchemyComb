package LittleAlchemyCombinations.collections;

import java.util.Scanner;
import LittleAlchemyCombinations.AbstractAlpha;
import LittleAlchemyCombinations.*;

public class G extends AbstractAlpha{
    @Override
    public void alpha() {
        System.out.println("galaxy\ngalaxycluster\ngarage\ngarden\ngardener\ngas\ngeyser\nghost\ngift\ngingerbreadhouse\ngingerbreadman\nglacier\nglass\nglasses\ngnome\ngoat\ngold\ngolem\ngranite\ngrass\ngrave\ngravestone\ngraveyard\ngreenhouse\ngrenade\ngrilledcheese\ngrimreaper\ngun\ngunpowder\ngust");
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String g = getInput.nextLine();
        switch (g) {
            case "galaxy" -> Combination.galaxy();
            case "galaxycluster" -> Combination.galaxycluster();
            case "garage" -> Combination.garage();
            case "garden" -> Combination.garden();
            case "gardener" -> Combination.gardener();
            case "gas" -> Combination.gas();
            case "geyser" -> Combination.geyser();
            case "ghost" -> Combination.ghost();
            case "gift" -> Combination.gift();
            case "gingerbreadhouse" -> Combination.gingerbreadhouse();
            case "gingerbreadman" -> Combination.gingerbreadman();
            case "glacier" -> Combination.glacier();
            case "glass" -> Combination.glass();
            case "glasses" -> Combination.glasses();
            case "gnome" -> Combination.gnome();
            case "goat" -> Combination.goat();
            case "gold" -> Combination.gold();
            case "golem" -> Combination.golem();
            case "granite" -> Combination.granite();
            case "grass" -> Combination.grass();
            case "grave" -> Combination.grave();
            case "gravestone" -> Combination.gravestone();
            case "graveyard" -> Combination.graveyard();
            case "greenhouse" -> Combination.greenhouse();
            case "grenade" -> Combination.grenade();
            case "grilledcheese" -> Combination.grilledcheese();
            case "grimreaper" -> Combination.grimreaper();
            case "gun" -> Combination.gun();
            case "gunpowder" -> Combination.gunpowder();
            case "gust" -> Combination.gust();
        }
    }
}
