package array;
//다차원배열
class multiArrayFor {
    public static void main(String[] args){
        int[][] myNumbers = {{1,2,3,4}, {5,6,7}};
        int x = myNumbers[1][2];
        int z = myNumbers[0][2];
        System.out.println(x);
        System.out.println(z);
        System.out.println("----------------------------");

        //위 다차원 배열의 모든 숫자가 하나씩 출력되도록 하시오.
        for (int i=0; i<myNumbers.length; i++){
            for (int k=0; k<myNumbers[i].length; k++){
                System.out.println("myNumbers["+i+"]["+k+"] = "+myNumbers[i][k]);
            }
        }
        //중첩 for문
        for (int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
