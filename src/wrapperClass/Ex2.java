package wrapperClass;

class Ex2 {
    public static void main(String[] args){
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        /* 이렇게 하면 역참조가 안된다는 에러가 뜸
        int myInt = 5;
        System.out.println(myInt.intValue());
         */
    }
}
