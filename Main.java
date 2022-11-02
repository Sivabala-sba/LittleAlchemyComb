package LittleAlchemyCombinations;

import LittleAlchemyCombinations.collections.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the alphabet: ");
        char letter = input.next().charAt(0);
        if(letter=='a'){
            A obj = new A();
            obj.alpha();
        }
        else if(letter=='b'){
            B obj = new B();
            obj.alpha();
        }
        else if(letter=='c'){
            C obj = new C();
            obj.alpha();
        }
        else if(letter=='d'){
            D obj = new D();
            obj.alpha();
        }
        else if(letter=='e'){
            E obj = new E();
            obj.alpha();
        }
        else if(letter=='f'){
            F obj = new F();
            obj.alpha();
        }
        else if(letter=='g'){
            G obj = new G();
            obj.alpha();
        }
        else if(letter=='h'){
            H obj = new H();
            obj.alpha();
        }
        else if(letter=='i'){
            I obj = new I();
            obj.alpha();
        }
        else if(letter=='j'){
            J obj = new J();
            obj.alpha();
        }
        else if(letter=='k'){
            K obj = new K();
            obj.alpha();
        }
        else if(letter=='l'){
            L obj = new L();
            obj.alpha();
        }
        else if(letter=='m'){
            M obj = new M();
            obj.alpha();
        }
        else if(letter=='n'){
            N obj = new N();
            obj.alpha();
        }
        else if(letter=='o'){
            O obj = new O();
            obj.alpha();
        }
        else if(letter == 'p'){
            P obj = new P();
            obj.alpha();
        }
        else if(letter == 'q'){
            Q obj = new Q();
            obj.alpha();
        }
        else if(letter == 'r'){
            R obj = new R();
            obj.alpha();
        }
        else if(letter == 's'){
            S obj = new S();
            obj.alpha();
        }
        else if(letter == 't'){
            T obj = new T();
            obj.alpha();
        }
        else if(letter == 'u'){
            U obj = new U();
            obj.alpha();
        }
        else if(letter == 'v'){
            V obj = new V();
            obj.alpha();
        }
        else if(letter == 'w'){
            W obj = new W();
            obj.alpha();
        }
        else if(letter == 'x'){
            System.out.println("There is no combinations present in x!");
        }
        else if(letter == 'y'){
            Y obj = new Y();
            obj.alpha();
        }
        else if(letter == 'z'){
            Z obj = new Z();
            obj.alpha();
        }
        else {
            System.out.println("Wrong alphabet is entered !");
            System.out.println("Please try again !");
        }
    }
}
