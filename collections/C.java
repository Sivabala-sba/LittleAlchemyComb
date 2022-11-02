package LittleAlchemyCombinations.collections;

import java.util.Scanner;
import LittleAlchemyCombinations.AbstractAlpha;
import LittleAlchemyCombinations.*;

public class C extends AbstractAlpha{
    @Override
    public void alpha() {
        System.out.println("cablecar\ncactus\ncage\ncake\ncamel\ncampfire\ncandle\ncandycane\ncannon\ncanvas\ncar\ncaramel\ncarbondioxide\ncarrot\ncart\ncashmere\ncastle\ncat\ncatnip\ncauldron\ncave\ncaviar\ncentaur\ncereal\nchain\nchainsaw\nchameleon\ncharcoal\ncheese\ncheeseburger\nchicken\nchickencoop\nchickensoup\nchickenwing\nchill\nchimney\nchocolate\nchocolatemilk\nchristmasstocking\nchristmastree\ncigarette\ncity\nclay\nclock\ncloset\ncloud\ncoal\ncoconut\ncoconutmilk\ncoffin\ncold\ncombustionengine\ncomputer\ncomputermouse\nconfetti\nconstellation\ncontainer\ncontinent\ncook\ncookbook\ncookie\ncookiecutter\ncookiedough\ncoral\ncorpse\ncotton\ncottoncandy\ncow\ncrayon\ncrow\ncrystalball\ncuckoo\ncup\ncurrent\ncuttingboard\ncyborg\ncyclist");
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter the Word : ");
        String c = getInput.nextLine();
        switch (c){
            case "cablecar" -> Combination.cablecar();
            case "cactus" -> Combination.cactus();
            case "cage" -> Combination.cage();
            case "cake" -> Combination.cake();
            case "camel" -> Combination.camel();
            case "campfire" -> Combination.campfire();
            case "candle" -> Combination.candle();
            case "candycane" ->Combination.candycane();
            case "cannon" -> Combination.cannon();
            case "canvas" -> Combination.canvas();
            case "car" -> Combination.car();
            case "caramel" -> Combination.caramel();
            case "carbondioxide" -> Combination.carbondioxide();
            case "carrot" -> Combination.carrot();
            case "cart" -> Combination.cart();
            case "cashmere" -> Combination.cashmere();
            case "castle" -> Combination.castle();
            case "cat" -> Combination.cat();
            case "catnip" -> Combination.catnip();
            case "cauldron" -> Combination.cauldron();
            case "cave" -> Combination.cave();
            case "caviar" -> Combination.caviar();
            case "centaur" -> Combination.centaur();
            case "cereal" -> Combination.cereal();
            case "chain" -> Combination.chain();
            case "chainsaw" -> Combination.chainsaw();
            case "chameleon" -> Combination.chameleon();
            case "charcoal" -> Combination.charcoal();
            case "cheese" -> Combination.cheese();
            case "cheeseburger" -> Combination.cheeseburger();
            case "chicken" -> Combination.chicken();
            case "chickencoop" -> Combination.chickencoop();
            case "chicken Soup" -> Combination.chickensoup();
            case "chickenwing" -> Combination.chickenwing();
            case "chill" -> Combination.chill();
            case "chimney" -> Combination.chimney();
            case "chocolate" -> Combination.chocolate();
            case "chocolatemilk" -> Combination.chocolatemilk();
            case "christmasstocking" -> Combination.christmasstocking();
            case "christmastree" -> Combination.christmastree();
            case "cigarette" -> Combination.cigarette();
            case "city" -> Combination.city();
            case "clay" -> Combination.clay();
            case "clock" -> Combination.clock();
            case "closet" -> Combination.closet();
            case "cloud" -> Combination.cloud();
            case "coal" -> Combination.coal();
            case "coconut" -> Combination.coconut();
            case "coconutmilk" -> Combination.coconutmilk();
            case "coffin" -> Combination.coffin();
            case "cold" -> Combination.cold();
            case "combustionengine" -> Combination.combustionengine();
            case "computer" -> Combination.computer();
            case "computermouse" -> Combination.computermouse();
            case "confetti" -> Combination.confetti();
            case "constellation" -> Combination.constellation();
            case "container" -> Combination.container();
            case "continent" -> Combination.continent();
            case "cook" -> Combination.cook();
            case "cookbook" -> Combination.cookbook();
            case "cookie" -> Combination.cookie();
            case "cookiecutter" -> Combination.cookiecutter();
            case "cookiedough" -> Combination.cookiedough();
            case "coral" -> Combination.coral();
            case "corpse" -> Combination.corpse();
            case "cotton" -> Combination.cotton();
            case "cottoncandy" -> Combination.cottoncandy();
            case "cow" -> Combination.cow();
            case "crayon" -> Combination.crayon();
            case "crow" -> Combination.crow();
            case "crystalball" -> Combination.crystalball();
            case "cuckoo" -> Combination.cuckoo();
            case "cup" -> Combination.cup();
            case "current" -> Combination.current();
            case "cuttingboard" -> Combination.cuttingboard();
            case "cyborg" -> Combination.cyborg();
            case "cyclist" -> Combination.cyclist();
        }
    }
}
