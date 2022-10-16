package LittleAlchemyCombinations;

import LittleAlchemyCombinations.collections.Z;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the alphabet: ");
        char letter = input.next().charAt(0);
        if(letter=='z'){
            Z obj = new Z();
            obj.alpha();
        }
    }
}
