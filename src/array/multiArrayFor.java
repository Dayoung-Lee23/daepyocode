package array;
//다차원배열
class multiArrayFor {
    public static void main(String[] args){
/*2차원 배열을 선언하는 방식은 1차원과 같고 다만 []가 하나 더 들어간다. (차원 수만큼 [] 추가)
2차원배열은 주로 테이블 형식 int[][] score = new int[4][3]; -> 4행 3열
 */
        int[][] myNumbers = {{1,2,3,4}, {5,6,7}};//{}앞에 new int[][]가 생략됨
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
