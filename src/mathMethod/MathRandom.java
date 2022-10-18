package mathMethod;
//Math.random 함수를 이용하여 뽑기 놀이 게임 만들기
class MathRandom {
    public static void main(String[] args){
        double random = Math.random();
        System.out.println("랜덤넘버는 "+random);
        int num = (int)(random*10);
        System.out.println("당첨넘버는 "+num);

        if (num>1 && num<=3){
            System.out.println("10점 당첨");
        }else if (num>=4 && num<=6){
            System.out.println("50점 당첨");
        }else if (num>=7 && num<=9) {
            System.out.println("80점 당첨");
        }else if (num ==0){
            System.out.println("100점 당첨");
        }
    }
}
