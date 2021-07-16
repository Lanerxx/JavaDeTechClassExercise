package date0617;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo5 {

    public static void main(String[] args) {
//        Date date = new Date();
//
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
//        String str_date = simpleDateFormat.format(date);
//        System.out.println(str_date);

        Date date = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        String str = simpleDateFormat.format(date);
        System.out.println(str);
    }

}
