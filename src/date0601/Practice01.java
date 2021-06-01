package date0601;

import java.util.Arrays;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        function01();
        function02();
        function03();
        function04();
        function05();
        function06();
        function07();
    }
    public static void function01(){
        System.out.println("第一题");
        int[] arr = {12, 234, 12, 44, 56, 3};
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void function02(){
        System.out.println("第二题");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
    public static void function03(){
        System.out.println("第三题");
        int[] arr = {12, 34, 2, -34, 565, 234, 23, -6, 66};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("最大值为：" + max + "  最小值为：" + min);

        System.out.println();
    }
    public static void function04(){
        System.out.println("第四题");
        int[] arr = {12, 34, 2, -34, 565, 234, 23, -6, 66};
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        System.out.println("最大值为：" + max + "  最大值的下标是：" + index);
        System.out.println();
    }
    public static void function05(){
        System.out.println("第五题");
        int[] arr = {4, 0, 34, 22, 98};
        boolean flag = false;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 5){
                flag = true;
            }
        }
        System.out.println(flag ? "5存在于数组中" : "数组中没有5");
        System.out.println();
    }
    public static void function06(){
        System.out.println("第六题");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您要查找的数：");
        int target = scanner.nextInt();
        int[] arr = {3, 34, 2, 54, 656, -123, 23, -4, 45, 234, -65};
        boolean flag = false;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                flag = true;
            }
        }
        System.out.println(flag ? "数组中有" + target : "数组中没有" + target);
        System.out.println();
    }
    public static void function07(){
        System.out.println("第七题");
        int[] arr = {1, 23, -23, 2, 43, 45, 3, 6565, -4354, 45};
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println("均值：" + (sum / arr.length));
        System.out.println();
    }
}
