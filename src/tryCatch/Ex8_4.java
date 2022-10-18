package tryCatch;
/* try-catch문으로 예외처리를 하여 중간에 예외가 발생해도 비정상적으로 종료하지 않도록 해주는 동시에,
printStackTrace() 또는 getMessage()와 같은 메서드를 통해서 예외의 발생원인을 알 수 있다.
*/
public class Ex8_4 {
    public static void main(String args[]){
        System.out.println(1);//컴파일 순서에 따라 순차적으로 먼저 실행
        System.out.println(2);
        try{//try 부분에서 예외가 나오면 catch로 뛰어넘고,
            //예외가 없으면 그대로 try 부분을 다 실행한다.
            System.out.println(3);
            System.out.println(0/0);//수학적으로 0으로 나누는건 불가
            System.out.println(4);

        }catch (ArithmeticException ae){//try부분에서 숫자와 관련된 에러가 발생할 것 같아 관련된 특정 예외를 주는 것

/*뭉뚱그려진 조상클래스인 Exeption으로 해도 예외처리가 되긴 한다. 그러나 보통 가장 있을 법한 세부적인 에러에 대한 예외처리를 가장 위에 배치하는데,
아래로 내려갈 수록 넓은 범위의 예외를 처리할 수 있는 catch문으로 배치한다. (뭉뚱그려진 Exception 같은 클래스로)
여러 catch문들이 있는 상태에서 가장 넓은 Exception을 제일 위에 배치하고 에러가 아래의 세부적인 내용으로 뜨면 오류가 난다. java: exception java.lang.ArithmeticException has already been caught */

            if (ae instanceof ArithmeticException) //참조변수 instanceof 클래스: 이 참조변수가 이 클래스의 자손이거나 본인의 것인가.
                System.out.println("true");
/*예외가 발생했을 때 생성되는 예외 클래스의 인스턴스에는 발생한 예외에 대한 정보가 담겨있으며,
Exception 클래스에 내재된 메서드인 getMessage()와 printStackTrace()를 통해서 이 정보들을 얻을 수 있다. */
            ae.printStackTrace(); //원래 발생했을 전체 에러메세지 화면 출력
            System.out.println(ae.getMessage()); //예외 원인 메세지만 따로 얻기
            System.out.println("ArithmeticException");
        }catch (NullPointerException ae){
            System.out.println("NullPointerException");
        }catch (Exception e){
            System.out.println("Exception");
        }
        System.out.println(6); //마지막 코드까지 정상 작동
    }
}


