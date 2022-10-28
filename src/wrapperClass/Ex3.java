package wrapperClass;

class Ex3 {
    public static void main(String[] args){
        Integer myInt = 100;
        String myString = myInt.toString(); //object형이므로 .toString() 메서드도 사용가능
        System.out.println(myString.length());
    }
}
