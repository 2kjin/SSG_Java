package day5_6.section8;

import java.util.Scanner;

public class GuGuDan {
    public static void main(String[] args) {
        int dan = 2;
        int result = 0;
/*
        System.out.printf("%d x %d = %d\n",dan,1,dan*1 );
        System.out.printf("%d x %d = %d\n",dan,2,dan*2 );
        System.out.printf("%d x %d = %d\n",dan,3,dan*3 );
        System.out.printf("%d x %d = %d\n",dan,4,dan*4 );
        System.out.printf("%d x %d = %d\n",dan,5,dan*5 );
        System.out.printf("%d x %d = %d\n",dan,6,dan*6 );
        System.out.printf("%d x %d = %d\n",dan,7,dan*7 );
        System.out.printf("%d x %d = %d\n",dan,8,dan*8 );
//        System.out.printf("%d x %d = %d\n",dan,9,dan*9 );*/

        for(int i = 2; i <6;i++){
            System.out.println("구구단" + i + "단");
            for(int j=1;j<10;j++){
                System.out.println(i + " X " + j + " = " +(i*j));
            }

        }
        //사용자에게 원하는 단 하나만 입력받아 해당 단만 출력
        //사용자에게 예)3단~7단 해당 범위의 단을 입력 받아 해당 범위의 단만 출력

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int j = 3; j <8; j++){
            System.out.println(n + " x " + j + " = " + (n*j));
        }
    }
}
