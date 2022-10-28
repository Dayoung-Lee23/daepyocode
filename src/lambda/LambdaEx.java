package lambda;

import java.util.ArrayList;

class LambdaEx {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach( (n) -> { System.out.println(n);}); //이 부분을 메서드화 할 수도 있는데 하나의 명령어로 다 해버림
        //for문의 forEach 안에 있는 걸 하나씩 전부다 뽑아주는 거.
        //메서드화 해서 분리, 클래스화 해야하는 불편함 없이 바로 명령어로 바로 뽑아버리는 편리함이 있다.
    }
}
