package uz.pdp;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("N sonini kiriting: ");

        int N=scanner.nextInt();

        if (1>N || N>1018){
            System.out.println("Siz 1 dan katta 1019 gacha (1019 kirmaydi) bo`lgan sonni kiriting. ");
            main(args);
        }

        int tubSonKupaytmasi=1;
        for (int i = 1; i <=N; i++) {
            int count=0;
            for (int j = 1; j < i/2+1; j++) {
                if (i%j==0){
                   count++;
                }
            }if (count==1){
                System.out.println(i);
              tubSonKupaytmasi*=i;
            }
        }
        if (tubSonKupaytmasi==1){
            System.out.println("1 bilan siz kiritgan son orasidagi tub sonlar mavjud emas");
        }
        else {
            System.out.println("1 bilan siz kiritgan sonlar orasidagi tub sonlar ko`paytmasi: "+tubSonKupaytmasi);
        }

    }

}
