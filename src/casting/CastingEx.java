package casting;
//자료형 크기: byte < short < char < int < long < float < double
class CastingEx {
    public static void main(String[] args){
//자바에서 ''는 char, ""가 String 또 char는 문자 하나만 담을 수 있으나 String은 문자열을 담을 수 있다.
        char firstC = 'E';
        char secondC = 'T';
        System.out.println(firstC+secondC);

        String firstS = String.valueOf(firstC);
        String secondS = String.valueOf(secondC);
        System.out.println(firstS + secondS);
        System.out.println("---------------------------------");
//더 큰 자료형에 작은 자료형을 대입하는 것은 문제가 없다.
        int myInt = 10;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);
//Casting 작은 크기에 자료형에 더 큰 자료형 넣기 -> 소수점 아래 값이 잘리고 정수값만 남음
        double secondDouble = 9.78;
        System.out.println(secondDouble);
        int secondInt = (int) secondDouble;
        System.out.println(secondInt);
    }
}
