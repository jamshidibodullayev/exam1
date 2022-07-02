package uz.pdp;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int [][] matrix=new int[7][7];

        int vertikal=0;
        int gorizontal = 0;


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                boolean bool=true;
                while (bool) {
                    System.out.println(i+"qator "+j+" ustun uchun 0-1 oraliqdagi son kiriting.");
                    int num = scanner.nextInt();
                    if (num == 0 || num == 1){
                        matrix[i][j] = num;
                        bool=false;
                        if (1==num) {
                          vertikal=i;
                          gorizontal=j;
                        }
                    }else {
                        System.out.println("Qaytadan kiriting");
                    }
                }
            }
        }

        int count=0;

        if (vertikal>3){
            count+=vertikal-3;
        }else {
            count+=3-vertikal;
        }



        if (gorizontal>3){
            count+=gorizontal-3;
        }else {
            count+=3-gorizontal;
        }
        System.out.println("Natija"+count);

    }
}
