package REVIW1;

import java.util.Scanner;

public class Exam5 {
    public static void main(String[] args) {
        //for문으로 0 1 2 3 4 5
        // for(int i = 0; i<6; i++){
        //     System.out.print(i + " ");
        // }
        // System.out.println();

        // int i=0;
        // while(i<=5){

        //     System.out.print(i + " ");
        //     i++;

        // }
        for(int i = 2;i<=9;i++){
            for(int j = 1;j<= 9;j++){
                int k = 0;
                k = i*j;
                System.out.printf("%d X %d = %d\n",i,j,k);
            }
            System.out.println("------------------------");
        }

        Scanner sc = new Scanner(System.in);

    System.out.print("원하는 단수를 입력하세요(z단까지가능) : "); int z = sc.nextInt();
        System.out.println("찾고싶어하는 단수 : "+ z);
        System.out.println("------------------");
        for(int i = 1;i<=z;i++){
            int j = 0;
            j = z*i;

            System.out.printf("%d X %d = %d\n",z,i,j);

        }
        System.out.println("------------------");

        int dan = 2;
        while (dan < 10){
            int num = 1;
            while (num < 10){
                System.out.println(dan + " * " + num + " = " + dan*num);
                num++;
            }
            dan++;
        }
        


    }
}
