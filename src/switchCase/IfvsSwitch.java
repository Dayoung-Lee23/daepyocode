package switchCase;

import java.util.Scanner;
/*if문과 달리 switch문은 단 하나의 조건식으로 많은 경우의 수를 처리할 수 있고, 표현도 간결해 처리하기 쉽다.
다만 switch문은 조건식의 결과값과 case문의 값이 무조건 정수이거나 문자열이어야 해서 어쩔 수 없이 if문으로 작성해야할 수도 있다.
 */
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
                break; //조건식의 결과가 해당 case와 일치해 case문을 실행한 뒤에는 break를 만나 switch문을 빠져나가도록 해야한다.
            default://if문의 else와 같은 역할
                System.out.println("홀수 날");
        }//default문은 보통 switch문의 마지막에 위치하기 때문에 꼭 break를 쓰진 않아도 된다.
    }
}
