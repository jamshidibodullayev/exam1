package uz.pdp;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String suz=scanner.nextLine();

        if (suz.length()>30){
            System.out.println("Siz satrning uzunligi 30 belgidan uzun so`z kiritdingiz. ");
            main(args);
        }

        String sifrlanganSuz="";
        for (int i = 0; i < suz.length(); i++) {
            switch (suz.charAt(i)){
                case 'r': sifrlanganSuz+="s"; break;
                case 'o': sifrlanganSuz+="l"; break;
                case 'b': sifrlanganSuz+="c"; break;
                case 'c': sifrlanganSuz+="d"; break;
                case 'n': sifrlanganSuz+="k"; break;
                case 't': sifrlanganSuz+="e"; break;
                case 'e': sifrlanganSuz+="p"; break;
                case 's': sifrlanganSuz+="t"; break;
                case 'd': sifrlanganSuz+="o"; break;
                case 'a': sifrlanganSuz+="t"; break;
                case 'u': sifrlanganSuz+="f"; break;
                case 'h': sifrlanganSuz+="e"; break;
                case 'i': sifrlanganSuz+="f"; break;
                case 'f': sifrlanganSuz+="y"; break;
                case 'l': sifrlanganSuz+="a"; break;
                case 'k': sifrlanganSuz+="p"; break;
                case 'j': sifrlanganSuz+="o"; break;
                case 'q': sifrlanganSuz+="s"; break;
                case 'w': sifrlanganSuz+="r"; break;
                case 'y': sifrlanganSuz+="w"; break;
                case 'p': sifrlanganSuz+="u"; break;
                case 'g' : sifrlanganSuz+="i"; break;
                case 'z' : sifrlanganSuz+="z"; break;
                case 'x' : sifrlanganSuz+="x"; break;
                case 'v' : sifrlanganSuz+="m"; break;
                case 'm' : sifrlanganSuz+="n"; break;
            }

        }

        System.out.println("Siz kiritgan so`z: "+suz+" Sifrlanan so`z "+sifrlanganSuz);


    }
}
