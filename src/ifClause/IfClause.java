package ifClause;

class IfClause {
    public static void main(String[] args){

        boolean isAlien = true;
        if (isAlien == false) {//조건식 안의 내용이 true이면 그 아래의 블럭을 실행하고,
            System.out.println("It is not an alien!");
        }else{//false이면 else블럭을 실행하라.
            System.out.println("I am an alien");
        }//둘 중에 하나는 실행하고 이 조건문을 벗어난다.

        System.out.println("---------------------------");

        int topScore = 89;
        if (90<topScore) //조건식의 결과는 반드시 true 아니면 false여야 한다.
            System.out.println("Excellent!"); //참이면 실행하고 아니면 그냥 실행 안하고 아래로 넘어간다.
//실행할 내용이 한 줄이면 {}를 생략할 수 있다.
        int secondTopScore = 81;
        if (topScore > secondTopScore && topScore < 100) //if문에 사용되는 조건식은 일반적으로 비교연산자와 논리연산자로 구성된다.
            System.out.println("secondTopScore는 topScore보다 작고 topScore는 100보다 작다.");
    }
}
