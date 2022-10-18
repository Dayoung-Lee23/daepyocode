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


    }
}
