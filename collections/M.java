package LittleAlchemyCombinations.collections;

import java.util.Scanner;
import LittleAlchemyCombinations.AbstractAlpha;
import LittleAlchemyCombinations.*;
public class M extends AbstractAlpha{
    public void alpha() {
        System.out.println("Mac and Cheese\nMachine\nMagic\nMagma\nMailbox\nMailman\nMail truck\nManatee\nMap\nMaple Syrup\nMars\nMarshmallows\nMayonnaise\nMeat\nMedusa\nMercury\nMermaid\nMetal\nMeteor\nMeteoroid\nMicroscope\nMilk\nMilk Shake\nMineral\nMinotaur\nMirror\nMist\nMold\nMonarch\nMoney\nMonkey\nMoon\nMoon Rover\nMoss\nMoth\nMotion\nMotorcycle\nMountain\nMountain Goat\nMountain Range\nMouse\nMousetrap\nMud\nMummy\nMusic\nMusician");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String m = input.nextLine();
        switch (m) {
            case "mac and cheese" -> Combination.macandcheese();
            case "machine" -> Combination.machine();
            case "magic" -> Combination.magic();
            case "magma" -> Combination.magma();
            case "mailbox" -> Combination.mailbox();
            case "mailman" -> Combination.mailman();
            case "mail truck" -> Combination.mailtruck();
            case "manatee" -> Combination.manatee();
            case "map" -> Combination.map();
            case "maple" -> Combination.maplesyrup();
            case "mars" -> Combination.mars();
            case "marshmallows" -> Combination.marshmallow();
            case "mayonnaise" -> Combination.mayonnaise();
            case "meat" -> Combination.meat();
            case "medusa" -> Combination.medusa();
            case "mercury" -> Combination.mercury();
            case "mermaid" -> Combination.mermaid();
            case "metal" -> Combination.metal();
            case "meteor" -> Combination.meteor();
            case "meteoroid" -> Combination.meteoroid();
            case "microscope" -> Combination.microscope();
            case "milk" -> Combination.milk();
            case "milk shake" -> Combination.milkshake();
            case "mineral" -> Combination.mineral();
            case "minotaur" -> Combination.minotaur();
            case "mirror" -> Combination.mirror();
            case "mist" -> Combination.mist();
            case "mold" -> Combination.mold();
            case "monarch" -> Combination.monarch();
            case "money" -> Combination.money();
            case "monkey" -> Combination.monkey();
            case "moon" -> Combination.moon();
            case "moon rover" -> Combination.moonrover();
            case "moss" -> Combination.moss();
            case "moth" -> Combination.moth();
            case "motion" -> Combination.motion();
            case "motorcycle" -> Combination.motorcycle();
            case "mountain" -> Combination.mountain();
            case "mountain goat" -> Combination.mountaingoat();
            case "mountain range" -> Combination.mountainrange();
            case "mouse" -> Combination.mouse();
            case "mousetrap" -> Combination.mousetrap();
            case "mud" -> Combination.mud();
            case "mummy" -> Combination.mummy();
            case "music" -> Combination.music();
            case "musician" -> Combination.musician();
        }
    }
}
