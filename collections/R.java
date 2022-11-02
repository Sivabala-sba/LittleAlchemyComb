package LittleAlchemyCombinations.collections;

import java.util.Scanner;
import LittleAlchemyCombinations.AbstractAlpha;
import LittleAlchemyCombinations.*;
public class R extends AbstractAlpha{
    @Override
    public void alpha() {
        System.out.println("rabbit\nrain\nrainbow\nrainforest\nrat\nrecipe\nreed\nreindeer\nring\nriver\nrivulet\nrobot\nrobot vacuum\nrock\nrocket\nroe\nroller coaster\nrope\nrose\nruins\nruler\nrust\nrv");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String r = input.nextLine();
        switch(r) {
            case "rabbit" -> Combination.rabbit();
            case "rain" -> Combination.rain();
            case "rainbow" -> Combination.rainbow();
            case "rainforest" -> Combination.rainforest();
            case "rat" -> Combination.rat();
            case "recipe" -> Combination.recipe();
            case "reed" -> Combination.reed();
            case "reindeer" -> Combination.reindeer();
            case "ring" -> Combination.ring();
            case "river" -> Combination.river();
            case "rivulet" -> Combination.rivulet();
            case "robot" -> Combination.robot();
            case "robot vacuum" -> Combination.robotvacuum();
            case "rock" -> Combination.rock();
            case "rocket" -> Combination.rocket();
            case "roe" -> Combination.roe();
            case "roller coaster" -> Combination.rollercoaster();
            case "rope" -> Combination.rope();
            case "rose" -> Combination.rose();
            case "ruins" -> Combination.ruins();
            case "ruler" -> Combination.ruler();
            case "rust" -> Combination.rust();
            case "rv" -> Combination.rv();
        }
    }
}
