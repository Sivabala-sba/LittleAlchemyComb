package LittleAlchemyCombinations.collections;

import java.util.Scanner;
import LittleAlchemyCombinations.AbstractAlpha;
import LittleAlchemyCombinations.*;
public class W extends AbstractAlpha{
    @Override
    public void alpha() {
        System.out.println("wagon\nwall\nwand\nwarmth\nwarrior\nwatch\nwater\nwater gun\nwaterlily\nwater pipe\nwaterfall\nwave\nwax\nweb\nwerewolf\nwheat\nwheel\nwild boar\nwind\nwind turbine\nwindmill\nwindsurfer\nwine\nwire\nwitch\nwizard\nwolf\nwood\nwoodpecker\nwool\nwrapping paper\nwriter");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String w = input.nextLine();
        switch(w) {
            case "wagon" -> Combination.wagon();
            case "wall" -> Combination.wall();
            case "wand" -> Combination.wand();
            case "warmth" -> Combination.warmth();
            case "warrior" -> Combination.warrior();
            case "watch" -> Combination.watch();
            case "water" -> Combination.water();
            case "waterfall" -> Combination.waterfall();
            case "water gun" -> Combination.watergun();
            case "waterlily" -> Combination.waterlily();
            case "water pipe" -> Combination.waterpipe();
            case "wave" -> Combination.wave();
            case "wax" -> Combination.wax();
            case "web" -> Combination.web();
            case "werewolf" -> Combination.werewolf();
            case "wheat" -> Combination.wheat();
            case "wheel" -> Combination.wheel();
            case "wild boar" -> Combination.wildboar();
            case "wind" -> Combination.wind();
            case "windmill" -> Combination.windmill();
            case "windsurfer" -> Combination.windsurfer();
            case "wind turbine" -> Combination.windturbine();
            case "wine" -> Combination.wine();
            case "wire" -> Combination.wire();
            case "witch" -> Combination.witch();
            case "wizard" -> Combination.wizard();
            case "wolf" -> Combination.wolf();
            case "wood" -> Combination.wood();
            case "woodpecker" -> Combination.woodpecker();
            case "wool" -> Combination.wool();
            case "wrapping paper" -> Combination.wrappingpaper();
            case "writer" -> Combination.writer();
        }
    }
}
