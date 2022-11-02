package LittleAlchemyCombinations.collections;

import java.util.Scanner;
import LittleAlchemyCombinations.AbstractAlpha;
import LittleAlchemyCombinations.*;

public class Z extends AbstractAlpha{
    public void alpha(){
        System.out.println("Zombie\nZoo");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word: ");
        String z = input.nextLine();
        switch (z){
            case "zombie" -> Combination.zombie();
            case "zoo" -> Combination.zoo();
        }
    }
}
