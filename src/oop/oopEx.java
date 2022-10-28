package oop;

class oopEx {

    int x = 2;
    final int y = 5; // 이제 이 값은 다른 곳에서도 바꿀 수 없음
    //multiple attribute
    String t = "Weekend is coming";

    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects.");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects.");
    }

    public static void main(String[] args) {
        int x = 7;
        oopEx myObj = new oopEx();
        oopEx myObj1 = new oopEx();

        System.out.println(myObj);
        System.out.println(myObj.x);

        // myObj1.x = 6; 위에서 x는 final로 한정이 되었기 때문에 이렇게 해도 값이 바뀔 수 없다.
        System.out.println(myObj.y);
        System.out.println(myObj1.y);
        System.out.println(myObj.t);

        myStaticMethod(); //public이 없는 메소드는 그냥 바로 불러지지만
        myObj.myPublicMethod();//public으로 된 부분은 반드시 생성자를 통해 불러올 수 있다.

    }
}
