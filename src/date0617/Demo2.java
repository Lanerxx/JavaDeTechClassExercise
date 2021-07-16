package date0617;


import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Demo2 {

    public static void main(String[] args) {

        Date date = new Date("2021/6/17 15:07:12");
        Date date1 = new Date(2021, 12, 1);
        System.out.println(date1);
//        Date date = new Date(1626164307648);

//        System.out.println(date);

        System.out.println(date.getYear()+1900);
        System.out.println(date.getMonth()+1);
        System.out.println(date.getDate());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getSeconds());

        System.out.println(date);


//        fun1();
//        fun2();
//        fun3();
    }

    public static void fun1(){
        Random random = new Random();
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(5)+1;
        }

        System.out.println(Arrays.toString(arr));

    }

    public static void fun2(){
        Random random = new Random(50);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(100)+1;
        }

        Random random1 = new Random(50);
        int[] arr1 = new int[5];
        for(int i=0;i<arr1.length;i++){
            arr1[i] = random1.nextInt(100)+1;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
    }

    public static void fun3(){
        Random random = new Random(50);
        for (int j = 0; j < 8; j++) {
            System.out.print(" " + random.nextInt(100) + ", ");
        }
        System.out.println();
        for (int j = 0; j < 8; j++) {
            System.out.print(" " + random.nextInt(100) + ", ");
        }
        System.out.println();
        Random random2 = new Random(50);
        for (int j = 0; j < 8; j++) {
            System.out.print(" " + random2.nextInt(100) + ", ");
        }
        System.out.println();
        for (int j = 0; j < 8; j++) {
            System.out.print(" " + random2.nextInt(100) + ", ");
        }
        System.out.println();

        System.out.println("-----------------------------------");
        Random random3 = new Random();
        for (int j = 0; j < 8; j++) {
            System.out.print(" " + random3.nextInt(100) + ", ");
        }
        System.out.println();
        Random random4 = new Random();
        for (int j = 0; j < 8; j++) {
            System.out.print(" " + random4.nextInt(100) + ", ");
        }
        System.out.println();
    }
}
