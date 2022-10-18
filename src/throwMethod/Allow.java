package throwMethod;

import java.util.Scanner;

class Allow {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("몇 살? : ");
        int age = num.nextInt();

        try{
            allow(age); //allow가 static 메서드이고 같은 클래스 안에 있기 때문에 그냥 불러올 수가 있음
        }catch (Exception e){
            System.out.println(e.getMessage()+ "입장 불가");
        }
    }

    static void allow(int age) throws Exception{
        if (age<18) //if 뒤의 실행문이 한 줄이면 {} 안써도 됨
            throw new Exception("너는 아직 어려서 안돼! "); //if 조건문이 true일때만 실행 그러고 끝
        System.out.println("어서오십시오");
    }
}
