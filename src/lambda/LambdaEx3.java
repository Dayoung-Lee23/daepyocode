package lambda;

interface StringFunction {
    String run(String str); //구현부가 없는 메소드 run이 존재
    //어떤 문자열을 받아와서 무언가를 수행하는 함수인데 아직 어떻게 구현될지 모름.
}

class LambdaEx3{
    public static void main(String[] args){
        StringFunction exclaim = (s) -> s + "!"; //이 람다식이 메소드 run을 오버라이딩하고 참조변수 exclaim에 저장
//StringFunction 인터페이스를 통해, 람다함수를 변수화한 것. 그럼 어디서든 불러서 쓸 수 있다.
        StringFunction ask = (s) -> s + "?";//다른 방식으로 오버라이드된 run메소드를 ask 참조변수로 불러올 수 있음.
        //이런식으로 StringFunction 인터페이스를 구체화함.
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }
    public static void printFormatted(String str, StringFunction format){
        String result = format.run(str);
        System.out.println(result);
    }
}
