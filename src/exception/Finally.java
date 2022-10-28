package exception;

class Finally {
    public static void main(String[] args){
        try {//예외가 발생할 가능성이 있는 문장들을 넣는다.
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        }catch (Exception e){//예외처리를 위한 문장을 적는다.
            System.out.println("Something went wrong.");
        }finally {//예외 발생여부 관계없이 항상 수행할 문장들.
            System.out.println("The 'try catch' is finished.");
        }

/*        try{
            startInstall();
            copyFiles();
            deleteTempFiles();
        }catch (Exception e){
            e.printStackTrace();
            deleteTempFiles();
        }

        try{
            startInstall();
            copyFiles();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            deleteTempFiles();
        }
 */
    }
}
