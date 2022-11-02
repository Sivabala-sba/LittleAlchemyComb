package LittleAlchemyCombinations.collections;

import java.util.Scanner;
import LittleAlchemyCombinations.AbstractAlpha;
import LittleAlchemyCombinations.*;

public class F extends AbstractAlpha{
    @Override
    public void alpha() {
        System.out.println("fabric\nfactory\nfairytale\nfamily\nfamilytree\nfarm\nfarmer\nfaun\nfence\nfield\nfire\nfireextinguisher\nfirefighter\nfireplace\nfirestation\nfiretruck\nfirewall\nfireworks\nfish\nfishingrod\nflamethrower\nflashlight\nflood\nflour\nflower\nflute\nflyingfish\nflyingsquirrel\nfog\nforceknight\nforest\nfork\nfortunecookie\nfossil\nfountain\nfox\nfrankensteinmonster\nfrenchfries\nfridge\nfrog\nfrozenyogurt\nfruit\nfruittree");
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String f = getInput.nextLine();
        switch (f){
            case "fabric" -> Combination.fabric();
            case "factory" -> Combination.factory();
            case "fairytale" -> Combination.fairytale();
            case "family" -> Combination.family();
            case "familytree" -> Combination.familytree();
            case "farm" -> Combination.farm();
            case "farmer" -> Combination.farmer();
            case "faun" -> Combination.faun();
            case "fence" -> Combination.fence();
            case "field" -> Combination.field();
            case "fire" -> Combination.fire();
            case "fireextinguisher" -> Combination.fireextinguisher();
            case "firefighter" -> Combination.firefighter();
            case "fireplace" -> Combination.fireplace();
            case "firestation" -> Combination.firestation();
            case "firetruck" -> Combination.firetruck();
            case "firewall" -> Combination.firewall();
            case "fireworks" -> Combination.fireworks();
            case "fish" -> Combination.fish();
            case "fishingrod" -> Combination.fishingrod();
            case "flamethrower" -> Combination.flamethrower();
            case "flashlight" -> Combination.flashlight();
            case "flood" -> Combination.flood();
            case "flour" -> Combination.flour();
            case "flower" -> Combination.flower();
            case "flute" -> Combination.flute();
            case "flyingfish" -> Combination.flyingfish();
            case "flyingsquirrel" -> Combination.flyingsquirrel();
            case "fog" -> Combination.fog();
            case "forceknight" -> Combination.forceknight();
            case "forest" -> Combination.forest();
            case "fork" -> Combination.fork();
            case "fortunecookie" -> Combination.fortunecookie();
            case "fossil" -> Combination.fossil();
            case "fountain" -> Combination.fountain();
            case "fox" -> Combination.fox();
            case "frankensteinmonster" -> Combination.frankensteinmonster();
            case "frenchfries" -> Combination.frenchfries();
            case "fridge" -> Combination.fridge();
            case "frog" -> Combination.frog();
            case "frozenyogurt" -> Combination.frozenyogurt();
            case "fruit" -> Combination.fruit();
            case "fruittree" -> Combination.fruittree();
        }
    }
}
