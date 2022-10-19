package operators;

class Operator {
    public static void main(String[] args) {


        int a = 1;
        int b = 2;
        int result;
//변수(result)는 바뀌어 담길 수 있다.
        result = a + b;
        System.out.println(result);
        result = result*10;
        System.out.println(result);
        result = result/5; //나누기
        System.out.println(result);
/*나누기 연산자의 경우 두 피연산자가 모두 int이면 연산 결과 역시 int로 나온다. 실제 결과가 2.5이면 2로 소수점 이하는 버려져서 나옴.
둘 중에 어느 한쪽은 실수형으로 나누어져야 다른 한 쪽도 같이 실수형으로 자동 형변환되어 결국 실수형의 결과값을 얻는다. */
        result = result%4; //나머지
        System.out.println(result);
        System.out.println("------------------------------");

        //축약표현
        result = 1;

        result++; //result = result + 1;
        System.out.println(result);
        result--; //result = result - 1;
        System.out.println(result);

        result+=2; //result = result + 2;
        System.out.println(result);
        result-=2; // result = result - 2;
        System.out.println(result);

        result*=10; //result = result*10;
        System.out.println(result);
        result/=3; //result = result/3;
        System.out.println(result);

        //증감연산자 ++와 --
        int i=5, j=0;
        //postfix
        j= i++; //5를 j에 넣은 후에 +1 (참조하여 대입 후에 증가)
        System.out.println("j=i++; 실행 후, i="+i+", j="+j);

        i = 5;
        j = 0;
        //prefix
        j = ++i; //5에 +1하고 그 값을 j에 넣는다. (증가 후에 참조하여 대입)
        System.out.println("j=++i; 실행 후, i="+i+", j="+j);

    }
}
