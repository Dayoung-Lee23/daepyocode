package switchCase;

class SwitchEx {
    public static void main(String[] args) {
        int today = 6;
        switch (today) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
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
