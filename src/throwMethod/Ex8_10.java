package throwMethod;

import java.io.File; //io : input output 내장 패키지 (여러 내장함수 포함)
//이걸로 File과 관련된 것들을 쓸 수 있다.

/*
1. 키워드 throw를 사용해서 고의로 예외를 발생시킬 수 있다.
2. 예외를 메서드에 선언할 수도 있다.
- 메서드의 선언부에 키워드 throws를 사용해서 메서드 내에서 발생할 수 있는 예외를 적어주기만 하면 된다.
void method() throws Exception, Exception1, Exception2, ... { 메서드 내용 }
- 예외를 발생시킨 메서드 내에서 예외처리를 하든, 다른 데 호출해서 쓰이는 곳에서 예외처리를 하든 어디선가 반드시 try-catch문으로 예외처리를 해줘야 함!
 */

class Ex8_10 {
    public static void main(String[] args){
        try{
            File f = createFile("");
/*
- 이 괄호 매개변수에 "test.txt"같은 거 넣으면 실제로 해당 이름으로 파일이 생성이 되고, 예외가 발생하지 않았으므로 catch문은 실행하지 않는다.
- if 조건문에 해당하는 빈 값이 들어가면 if 실행문에서 만든 Exception 생성자 내의 메세지가 getMessage()로 불러와진다.
- 매개변수에 args[0] 같은 걸 넣으면, createFile 메서드 안 if문의 조건에 해당되는 매개변수라서 예외가 아닌, 그냥 유효하지 않은 값이므로 예외가 된건데(이 부분 맞나 확인)
이 경우엔 if문에서 설정된 예외메세지가 보여지는게 아니고 일반적으로 만들어진 에러 메세지가 전달이 된다.
 */
            System.out.println(f.getName()+" 파일이 성공적으로 생성되었습니다.");
        }catch (Exception e){
            System.out.println("getMessage() : " + e.getMessage() + "// 다시 입력해 주시기 바랍니다.");
            e.printStackTrace();
        }
    }

    static File createFile(String fileName) throws Exception{ //모든 예외의 최고조상인 Exception클래스를 메서드에 선언, 이 메서드는 모든 종류의 예외가 발생할 가능성이 있다는 뜻.
        if (fileName==null || fileName.equals("")){ //조건: 아무 값도 넣지 않거나 빈칸이면
        //*고의로 예외를 발생시키는 방법
            Exception e = new Exception("파일이름이 유효하지 않습니다.");//연산자 new로 발생시키려는 예외클래스의 객체를 만든 다음
            throw e; //키워드 throw를 이용해서 예외를 발생시킨다.
/*위 두 줄을 throw new Exception("파일이름이 유효하지 않습니다."); 이렇게 한 줄로 줄여 쓸 수 있다.
Exception인스턴스를 생성할 때 생성자에 String을 넣어주면, 이게 인스턴스에 메세지로 저장되어 getMessage()를 이용해서 얻을 수 있다. */
        }
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}
