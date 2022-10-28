package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

class LambdaEx2 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> method = (n) -> {System.out.println(n);};
//람다함수를 저장할 수 있는 Consumer라는 내장 인터페이스를 통해, 람다함수를 변수화한 것. 그럼 어디서든 불러서 쓸 수 있다.
        numbers.forEach( method );
    }
}
