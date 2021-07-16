package date0617;


import java.util.Calendar;

public class Demo4 {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        System.out.println("年:"+calendar.get(Calendar.YEAR));
        System.out.println("月:"+ (calendar.get(Calendar.MONTH) + 1));
        System.out.println("日:"+calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("周:"+calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("天:"+calendar.get(Calendar.DAY_OF_YEAR));


    }

}
