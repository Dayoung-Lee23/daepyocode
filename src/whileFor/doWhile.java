package whileFor;

import java.util.Scanner;
/*
do-while문은 기본적으로 구조는 while문과 같으나 조건식과 블럭{}의 순서를 바꿔놓은 것!
따라서 while문과 반대로 블럭{}을 먼저 수행한 후에 조건식을 평가한다.
while문은 조건식의 결과에 따라 블럭{}이 한번도 수행되지 않을 수 있지만 do-while문은 최소한 한번은 수행될 것을 보장한다.
 */
class doWhile {
    public static void main(String[] args){

        int input=0, answer=0;
        answer = (int)(Math.random()*100)+1; //1~100사이의 임의의 수 저장
        Scanner scanner = new Scanner(System.in);

        do{ //do { 조건식의 연산결과가 참일 때 수행될 문장 (첫 한번은 무조건 실행) } while(조건식);
            System.out.println("1과 100사이의 정수를 입력하세요.>");
            input = scanner.nextInt();

            if (input>answer){
                System.out.println("더 작은 수로 다시 시도해보세요.");
            }else if(input<answer){
                System.out.println("더 큰 수로 다시 시도해보세요.");
            }
        }while(input!=answer); //끝에 ; 써주기.
        System.out.println("정답입니다.");
    }
}
