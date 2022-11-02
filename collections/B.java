package LittleAlchemyCombinations.collections;

import java.util.Scanner;
import LittleAlchemyCombinations.AbstractAlpha;
import LittleAlchemyCombinations.*;

public class B extends AbstractAlpha{
    @Override
    public void alpha() {
        System.out.println("bacon\nbacteria\nbaker\nbakery\nbanana\nbananabread\nbandage\nbank\nbarn\nbat\nbatter\nbattery\nbayonet\nbbq\nbeach\nbeaver\nbee\nbeechive\nbeekeeper\nbeer\nbell\nbicycle\nbig\nbinoculars\nbird\nbirdcage\nbirdhouse\nblackhole\nblade\nblender\nblizzard\nblood\nbloodbag\nboat\nboiler\nbone\nbonsaitree\nbook\nbottle\nboulder\nbow\nbox\nbread\nbrick\nbridge\nbroom\nbucket\nbullet\nbulletproofvest\nbus\nbutcher\nbutter\nbutterfly\nbutterflynet");
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the Word : ");
        String b = getInput.nextLine();
        switch (b){
            case "bacon" -> Combination.bacon();
            case "bacteria" -> Combination.bacteria();
            case "baker" -> Combination.baker();
            case "bakery" -> Combination.bakery();
            case "banana" -> Combination.banana();
            case "bananabread" -> Combination.bananabread();
            case "bandage" -> Combination.bandage();
            case "bank" -> Combination.bank();
            case "barn" -> Combination.barn();
            case "bat" -> Combination.bat();
            case "batter" -> Combination.batter();
            case "battery" -> Combination.battery();
            case "bayonet" -> Combination.bayonet();
            case "bbq" -> Combination.bbq();
            case "beach" -> Combination.beach();
            case "beaver" -> Combination.beaver();
            case "bee" -> Combination.bee();
            case "beechive" -> Combination.beehive();
            case "beekeeper" -> Combination.beekeeper();
            case "beer" -> Combination.beer();
            case "bell" -> Combination.bell();
            case "bicycle" -> Combination.bicycle();
            case "big" -> Combination.big();
            case "binoculars" -> Combination.binoculars();
            case "bird" -> Combination.bird();
            case "birdcage" -> Combination.birdcage();
            case "birdhouse" -> Combination.birdhouse();
            case "blackhole" -> Combination.blackhole();
            case "blade" -> Combination.blade();
            case "blender" -> Combination.blender();
            case "blizzard" -> Combination.blizzard();
            case "blood" -> Combination.blood();
            case "bloodbag" -> Combination.bloodbag();
            case "boat" -> Combination.boat();
            case "boiler" -> Combination.boiler();
            case "bone" -> Combination.bone();
            case "bonesaitree" -> Combination.bonsaitree();
            case "book" ->Combination.book();
            case "bottle" -> Combination.bottle();
            case "boulder" -> Combination.boulder();
            case "bow" -> Combination.bow();
            case "box" -> Combination.box();
            case "bread" -> Combination.bread();
            case "brick" -> Combination.brick();
            case "bridge" -> Combination.bridge();
            case "broom" -> Combination.broom();
            case "bucket" -> Combination.bucket();
            case "bullet" -> Combination.bullet();
            case "bulletproofvest" -> Combination.bulletproofvest();
            case "bus" -> Combination.bus();
            case "butcher" -> Combination.butcher();
            case "butter" -> Combination.butter();
            case "butterfly" -> Combination.butterfly();
            case "butterflynet" -> Combination.butterflynet();
        }
    }
}
