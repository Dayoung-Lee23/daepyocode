package ifClause;
//if-else문은 두 가지 경우 중 하나가 수행되는 구조인데, 처리해야할 경우의 수가 셋 이사이면 if-else if문을 쓴다.
// else if 를 이용해 90점 초과이면 A 90~ 80초과이면 B 80~70초과이면 C 70 이하이면 D 출력하기
class Homework20 {
    public static void main(String[] args) {
        int myScore = -12;
//첫번째 조건식부터 순서대로 평가해서 결과가 참인 조건식을 만나면, 해당 블럭{}만 수행하고 'if-if else'문 전체를 벗어난다.
        if (90 < myScore && myScore <= 100) {
            System.out.println("grade A");
        }else if(myScore <= 90 && myScore>80){
            System.out.println("grad B");
        }else if(myScore <= 80 && myScore > 70){
            System.out.println("grade C");
        }else if(myScore <= 70 && myScore>0){
            System.out.println("grade D");
        }else{//만일 위에서 결과가 참인 조건식이 하나도 없으면, 마지막에 위치한 else블럭의 문장들을 수행한다.
            System.out.println("유효한 점수가 아닙니다.");
        }//이 else블럭은 생략이 가능하다.
//else블럭이 생략되었을 때는 'if-else if'문의 어떤 블럭도 수행되지 않을 수 있다.
    }
}
