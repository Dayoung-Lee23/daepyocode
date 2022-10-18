package array;

class ArrayEx {
    public static void main(String[] args){

        String[] myFamily = {"Gauthier", "Mother", "Gabi"};
        System.out.println(myFamily); //이 배열 객체의 주소가 나옴
        System.out.println(myFamily[0]); //배열은 0부터 세는 위치값이 지정되어 있다.
        System.out.println("--------------------------");
//for문을 이용한 배열 출력
        for(int i=0; i<myFamily.length; i++){
            System.out.println(myFamily[i]);
        }
        System.out.println("--------------------------");
//while문을 이용한 배열 출력
        String[] myFam = {"Gauthier", "Daughter", "Son"};
        int t =0;
        while(t<myFam.length){ //while의 조건문에는 변수 t를 지역적으로 정의할 수 없으므로 밖에서 선언 및 초기화 해주어야 한다.
            System.out.println(myFam[t]);
            t++;
        }
    }
}
