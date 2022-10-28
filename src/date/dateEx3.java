package date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class dateEx3 {
    public static void main(String[] args){
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: "+ myDateObj);
        System.out.println(myDateObj.getClass().getName());//데이터 타입 자체가 LocalDateTime

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); //LocalDateTime의 데이터 타입을 형변환
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: "+ formattedDate);
        System.out.println(formattedDate.getClass().getName());//데이터 타입 알아보는 메소드! 이거는 String이 나옴.

        DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String formattedDate1 = myDateObj.format(myFormatObj1);
        System.out.println("After formatting: "+ formattedDate1);
        System.out.println(formattedDate1.getClass().getName());

        DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");
        String formattedDate2 = myDateObj.format(myFormatObj2);
        System.out.println("After formatting: "+ formattedDate2);
        System.out.println(formattedDate2.getClass().getName());

        DateTimeFormatter myFormatObj3 = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
        String formattedDate3 = myDateObj.format(myFormatObj3);
        System.out.println("After formatting: "+ formattedDate3);
        System.out.println(formattedDate3.getClass().getName());
    }
}
