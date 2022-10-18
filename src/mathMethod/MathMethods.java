package mathMethod;

class MathMethods {
    public static void main(String[] args){
        int firstNum = 4;
        int secondNum = 6;
        int thirdNum = 65;
        double fourthNum = -4.7;

        System.out.println("Math.max(firstNum, secondNum): "+Math.max(firstNum, secondNum)); //두 값 중 큰 값. 두 값 넘게 못들어감
        System.out.println("Math.min(40, 23): "+Math.min(40, 23));
        System.out.println("Math.sqrt(thirdNum): "+Math.sqrt(thirdNum)); //65의 루트값. 실수로 나옴.
        System.out.println("Math.abs(fourthNum): "+Math.abs(fourthNum)); //absolute 절대값 처리
        System.out.println("Math.random(): "+Math.random()); //자바가 아무 실수값을 랜덤으로 생성해줌

        int num = (int) Math.random();
        System.out.println(num);

    }
}
