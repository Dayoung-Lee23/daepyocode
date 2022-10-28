package enumEx;

enum Level1{
    LOW,
    MEDIUM,
    HIGH
}

class EnumEx1 {
    public static void main(String[] args){
        Level1 myVar = Level1.MEDIUM;
        System.out.println(myVar);
    }
}
