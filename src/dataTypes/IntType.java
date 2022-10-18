package dataTypes;
// 변수를 설정할 때 메모리를 가장 아껴쓸 수 있는 자료형을 선택할 수 있다.
class IntType {
    public static void main(String[] args){

        int firstNumber = 5;
        int secondNumber = 12;
        int thirdNumber = 35;
        System.out.println(firstNumber + secondNumber + thirdNumber);
        int hap = firstNumber + secondNumber + thirdNumber;
        System.out.println(hap);
// byte < short < char < int < long < float < double
// int, byte, short, long : 정수를 담을 수 있는 자료형
        int firstMinIntValue = Integer.MIN_VALUE;
        int firstMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Int Min Value = " + firstMinIntValue);
        System.out.println("Int Max Value = " + firstMaxIntValue);

        byte firstMinByteValue = Byte.MIN_VALUE;
        byte firstMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Min Value = " + firstMinByteValue);
        System.out.println("Byte Max Value = " + firstMaxByteValue);

        short firstMinShortValue = Short.MIN_VALUE;
        short firstMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Min Value = " + firstMinShortValue);
        System.out.println("Short Max Value = " + firstMaxShortValue);

        long firstMinLongValue = Long.MIN_VALUE; //long이 담을 수 있는 크기가 가장 크다.
        long firstMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Min Value = " + firstMinLongValue);
        System.out.println("Long Max Value = " + firstMaxLongValue);

        // float, double : 실수값. double이 float보다 더욱 세분된 값을 가질 수 있어 더 크다고 할 수 있다.
        float firstMinFloatValue = Float.MIN_VALUE;
        float firstMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min Value = " + firstMinFloatValue);
        System.out.println("Float Max Value = " + firstMaxFloatValue);

        double firstMinDoubleValue = Double.MIN_VALUE;
        double firstMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min Value = " + firstMinDoubleValue);
        System.out.println("Double Max Value = " + firstMaxDoubleValue);
    }
}
