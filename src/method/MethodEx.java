package method;
/* 메서드란 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것.
내부적으로 어떤지 몰라도 메서드에 넣을 값과 반환하는 결과만 알면 사용할 수 있다. ex) println() , .getConnection()

 */
class MethodEx {

    int add (int x, int y){//선언부 구성: 반환타입 메서드이름(매개변수 선언)
/*메서드의 선언부는 후에 변경되지 않도록 신중하기. 여기를 변경하면 이 메서드가 호출된 모든 곳도 함께 변경되어야 하기 때문
매개변수 부분은 메서드가 작업을 수행하는데 필요한 값들을 입력받기 위한 것. 일반적인 변수 선언과 달리 두 변수의 타입이 같아도 변수의 타입을 생략할 수 없다.
return type: 메서드의 작업수행 결과인 반환값의 타입을 적는다. 반환값이 없는 경우 void를 적어야 한다. */
        int result = x+y;//x, y, result 와 같이 메서드 내에서 선언된 변수들은 그 메서드 내에서만 사용할 수 있는 지역변수! (메서드 밖에서 같은 이름의 변수 선언 가능)
        return result; //메서드의 반환타입이 void가 아닌 경우, {}안에 return 반환값;이 반드시 포함되어야 함.
    }//return문장은 작업을 수행한 결과를 호출한 메서드로 전달하는데, 이 값의 타입은 선언부의 반환타입과 일치하거나 자동형변환이 가능한 것이어야 한다. int add() -> int result를 리턴함

    //매개변수 없는 메소드
    static void myMethod(){ //메서드의 선언부(header). 값을 입력받을 필요가 없다면 괄호를 비워둬도 된다.
        System.out.println("자바가 재밌습니다.");//메서드의 구현부(body)
    }
    //매개변수가 있는 메소드
    static String myMethod2(String name){
        return name + " Lambert";
    }
    static void myMethod3(int age){
        if (age>18){
            System.out.println(age+"세는 출입이 가능합니다.");
        }else{
            System.out.println(age+"는 미성년자로 출입이 불가합니다.");
        }
    }
    static void myFamily(String[] names, int[] age){//매개변수의 개수는 제한이 없지만 만약 입력해야할 값의 개수가 많은 경우에는 배열이나 참조변수를 사용할 수 있다.
        for (int i=0; i<names.length; i++){
            System.out.print(names[i] + "Lambert aged "+age[i]+"/ ");
        }
        System.out.println();
    }
    public static void main(String[] args){//메서드를 정의했어도 호출되지 않으면 아무 일도 안일어남.
// 메서드 호출 방법: 메서드이름(매개변수값1, 값2, ...); 메서드에서 지정한 인자와, 호출된 메서드에 넣어지는 매개변수의 '개수와 순서, 타입'이 일치해야 한다.
        myMethod();

        String myName = myMethod2("Dayoung"); //호출한 메서드의 결과를 변수에 저장 (대신 return 값이 있는 메서드)
        System.out.println(myName);
        System.out.println(myMethod2("Gauthier"));

        myMethod3(15);
        myFamily(new String[]{"Dayoung ", "Claire ", "Herve "}, new int[]{12, 34, 56});

    }
}
