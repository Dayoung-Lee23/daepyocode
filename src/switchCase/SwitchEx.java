package switchCase;
/*
switch문은 조건식을 먼저 계산한 다음, 그 결과와 일치하는 case문으로 이동한다.
이동한 case문 아래의 문장들을 수행하고, break문을 만나면 전체 switch문을 빠져나가게 된다.
 */
class SwitchEx {
    public static void main(String[] args) {
        int today = 6;
        switch (today) {
//switch문의 조건식은 '결과값'이 꼭 정수(혹은 문자열)이어야 한다. 이 값과 일치하는 case문으로 이동하기 때문에 case문의 값 역시 정수여야 한다.
            case 1://case문의 값은 중복되면 안된다. 같은 값이 있으면 어디로 가야할지 모름!
//또, case문의 값은 반드시 상수이어야 한다. 변수나 실수가 올 순 없음.
                System.out.println("Monday");
                break; //switch문에서 break는 각 case문의 영역을 구분하는 역할을 함.
//만약 break문을 생략하면, case들 사이의 구분이 없어지므로 다른 break를 만나거나 switch문의 블럭 {} 끝을 만날 때까지 나오는 모든 문장들을 수행한다.
            case 2:
                System.out.println("Tuesday");
                break; //따라서 꼭!! 각 case문의 끝끝마다 break를 달아줘야 한다!
            case 3:
                System.out.println("Wednesday");
                break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
        }
        System.out.println("------------------");

        //1~5는 주말을 기다리는 말, 6,7은 주말이라는 말 출력하기
        int day = 3;
        switch (day){
            case 1:
            case 2:
            case 3: case 4: case 5:
                System.out.println("주말아 빨리 와라");
                break;
            case 6: case 7:
                System.out.println("주말이다아"); break;
        }//default 활용 else같은 기능
         int week = 4;
        switch (week){
            case 6: case 7:
                System.out.println("주말이다아");
                break;
            default: //case 1~5
                System.out.println("주말아 빨리 와라");
        }
    }
}
