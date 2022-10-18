package whileFor;

class WhileFor {
    public static void main(String[] args){
        int t = 0;
        while(t<6){
            System.out.println("while 종이접기" + t + "번쨰");
            t++;
            if(t==4){
                break;
            }
        }
        for(int i=0; i<6; i++){
            if (i==4){
                break;
            }
            System.out.println("for 종이접기" + i + "번째");
        }
    }
}
