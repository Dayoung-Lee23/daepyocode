package iterator;

import java.util.ArrayList;
import java.util.Iterator;

class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volve");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        Iterator<String> it = cars.iterator();
//Iterator라는 utility 드라이브를 불러왔어.
        while (it.hasNext()) {
            System.out.println(it.next()); //it에 담겨있는 내용들을 뽑기
        }//hasNext를 해야 it.next가 mazda 까지 나옴. it.next만 쓰면 volvo만 나오고 끝남.
        //그냥 .next랑 .hasNext랑 반환값이 다르다.


        //특정 값만 배열로 출력하기
        ArrayList<Integer> num = new ArrayList<>();
        num.add(12);
        num.add(8);
        num.add(2);
        num.add(23);
        System.out.println(num);
//output값이 array형태로 나와야할 때가 있음
        Iterator<Integer> itnum = num.iterator();
        while (itnum.hasNext()) {
            Integer i = itnum.next();
            if(i<10){//i가 10보다 작은 거에 참이면 remove 적용 후 num에 담김.
                itnum.remove();
            }
        }
        System.out.println(num);
    }
}
