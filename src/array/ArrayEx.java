package array;

import java.util.Arrays;

/* 배열: 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것.
조금 바꿈 */
class ArrayEx {
    public static void main(String[] args){
/*배열 선언 방법: 배열임을 의미하는 대괄호[]를 타입 뒤에 붙여도 되고 변수 이름 뒤에 붙여도 된다.
타입[] 변수이름; or 타입 변수이름[]; 앞에거 선호

배열을 선언(배열을 다루기 위한 참조변수 선언)한 뒤에는 배열을 생성해야 한다.
변수이름 = new 타입[배열길이]; 배열을 생성(실제 저장공간을 생성).

int[] score = new int[5]; 배열 선언과 생성을 동시에. (길이가 5인 int 배열)
 */
        String[] myFamily = new String[]{"Gauthier", "Mother", "Gabi"};
        //변수 myFamily는 배열을 다루는데 필요한 참조변수일 뿐 값을 저장하는 공간은 아니다.
        System.out.println(myFamily); //이 배열을 가리키는 첨조변수만 출력하면 타입@주소가 나옴
        System.out.println(myFamily[0]); //배열은 0부터 세는 위치값이 지정되어 있다.
// 배열의 인덱스(index): 배열의 요소마다 붙여진 일련번호로 범위는 0부터 '배열길이-1'까지. 배열이름[인덱스]
        System.out.println("--------------------------");

        //for문을 이용한 배열 출력
        for(int i=0; i<myFamily.length; i++){
//자바에서는 JVM이 모든 배열의 길이를 별도로 관리하며, '배열이름.length'를 통해 배열길이 정보를 알 수 있다.
            System.out.println(myFamily[i]);
        }
        System.out.println("--------------------------");

        //while문을 이용한 배열 출력
        String[] myFam = {"Gauthier", "Daughter", "Son"};
//배열 초기화 방식 ex) int[] score = new int[]{50, 60, 70, 80, 90}; new int[]는 생략할 수 있다.
        int t =0; //while의 조건문에는 변수 t를 지역적으로 정의할 수 없으므로 밖에서 선언 및 초기화 해주어야 한다.
        while(t<myFam.length){
            System.out.println(myFam[t]);
            t++;
        }
/*Array.toString(배열이름) 메서드 사용하여 출력하기 : 이 메서드는 배열의 모든 요소를 [ , , ...]형식의 문자열로 만들어 반환한다.
(import.java.util.Arrays;를 추가해야함.) */
        System.out.println(Arrays.toString(myFamily));
        System.out.println(Arrays.toString(myFam));
    }
}
