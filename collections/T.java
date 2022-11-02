package LittleAlchemyCombinations.collections;

import java.util.Scanner;
import LittleAlchemyCombinations.AbstractAlpha;
import LittleAlchemyCombinations.*;
public class T extends AbstractAlpha{
    @Override
    public void alpha() {
        System.out.println("tablet\ntailor\ntank\ntea\ntelescope\ntent\nthe one ring\nthermometer\nthread\ntide\ntime\ntitanic\ntoast\ntobacco\ntool\ntoolbox\ntornado\ntoucan\ntractor\ntrain\ntrain yard\ntreasure\ntreasure map\ntree\ntreehouse\ntrojan horse\ntsunami\ntunnel\nturtle\ntwilight\ntyrannosaurus rex");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word : ");
        String t = input.nextLine();
        switch(t) {
            case "tablet" -> Combination.tablet();
            case "tailor" -> Combination.tailor();
            case "tank" -> Combination.tank();
            case "tea" -> Combination.tea();
            case "telescope" -> Combination.telescope();
            case "tent" -> Combination.tent();
            case "the one ring" -> Combination.theonering();
            case "thermometer" -> Combination.thermometer();
            case "thread" -> Combination.thread();
            case "tide" -> Combination.tide();
            case "time" -> Combination.time();
            case "titanic" -> Combination.titanic();
            case "toast" -> Combination.toast();
            case "tobacco" -> Combination.tobacco();
            case "tool" -> Combination.tool();
            case "toolbox" -> Combination.toolbox();
            case "tornado" -> Combination.tornado();
            case "toucan" -> Combination.toucan();
            case "tractor" -> Combination.tractor();
            case "train" -> Combination.train();
            case "train yard" -> Combination.trainyard();
            case "treasure" -> Combination.treasure();
            case "treasure map" -> Combination.treasuremap();
            case "tree" -> Combination.tree();
            case "treehouse" -> Combination.treehouse();
            case "trojan horse" -> Combination.trojanhorse();
            case "tsunami" -> Combination.tsunami();
            case "tunnel" -> Combination.tunnel();
            case "turtle" -> Combination.turtle();
            case "twilight" -> Combination.twilight();
            case "tyrannosaurus rex" -> Combination.tyrannosaurusrex();
        }
    }
}
