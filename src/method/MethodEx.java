package method;

import org.w3c.dom.ls.LSOutput;

class MethodEx {
    static void myMethod(){ //매개변수 없음
        System.out.println("자바가 재밌습니다.");
    }
    static void myMethod2(String name){ //매개변수를 받는 메소드
        System.out.println(name + " Lambert");
    }
    public static void main(String[] args){
        myMethod();
        System.out.println("---------------------");
        myMethod2("Dayoung");
    }
}
