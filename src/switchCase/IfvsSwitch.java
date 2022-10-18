package switchCase;

import java.util.Scanner;

class IfvsSwitch {
    public static void main(String[] args){
        int num=2;

        Scanner sc = new Scanner(System.in);
        System.out.print("if 날짜를 입력하시오: ");
        int day = sc.nextInt();

        if (day%num==0){
            System.out.println("짝수 날");
        }else{
            System.out.println("홀수 날");
        }
        System.out.println("--------------------");

        Scanner sc1 = new Scanner(System.in);
        System.out.print("switch case 날짜를 입력하시오: ");
        int date = sc1.nextInt();

        switch (date%num){
            case 0:
                System.out.println("짝수 날");
                break;
            default:
                System.out.println("홀수 날");
                break;
        }
    }
}
