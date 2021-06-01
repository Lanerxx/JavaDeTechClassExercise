package date0601;

import java.util.Arrays;
import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        function01();
        function02();
        function03();
        function04();
        function05();
        function06();
        function07();
        function08();
    }
    public static void function01(){
        System.out.println("第一题：");
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void function02(){
        System.out.println("第二题：");
        int[] arr = {10, 20, 11, 35, 6, 89};
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    int tempt = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempt;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
    public static void function03(){
        System.out.println("第三题：");
        int[][] arr = {{1}, {2, 3} ,{4 ,5, 6}};
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void function04(){
        System.out.println("第四题：");
        int[] oldArr = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};
        int count = 0;
        for (int i = 0; i < oldArr.length; i++){
            if (oldArr[i] != 0) count++;
        }
        int[] newArr = new int[count];
        int j = 0;
        for (int i = 0; i < oldArr.length; i++){
            if (oldArr[i] != 0){
                newArr[j++] = oldArr[i];
            }
        }
        System.out.println(Arrays.toString(newArr));
        System.out.println();
    }
    public static void function05(){
        System.out.println("第五题：");
        int[] arr1 = {1, 7, 9, 11, 13, 15, 17, 19};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] arr = new int[arr1.length + arr2.length];
        int i1 = 0;
        int i2 = 0;
        int i = 0;
        while (i1 != arr1.length && i2 != arr2.length){
            if (arr1[i1] < arr2[i2]){
                arr[i++] = arr1[i1++];
            }else {
                arr[i++] = arr2[i2++];
            }
        }
        while (i1 < arr1.length){
            arr[i++] = arr1[i1++];
        }
        while (i2 < arr2.length){
            arr[i++] = arr2[i2++];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
    public static void function06(){
        System.out.println("第六题：");
        int[][] arr = {{11, 15, 32, 21}, {2, 3}, {4, 5, 6}};
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                for (int k = j; k < arr[i].length; k++){
                    if (arr[i][j] > arr[i][k]){
                        int tempt = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = tempt;
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void function07(){
        System.out.println("第七题：");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入杨辉三角的行数：");
        int n = scanner.nextInt();
        int[][] arr_d = new int[n][];
        for (int i = 0; i < n; i++){
            int[] arr = new int[i + 1];
            for (int j = 0; j <= i; j++){
                if (j == 0 || j == i){
                    arr[j] = 1;
                }
                else {
                    arr[j] = arr_d[i - 1][j - 1] + arr_d[i - 1][j];
                }
            }
            arr_d[i] = arr;
        }
        for (int i = 0; i < n; i++){
            System.out.println(Arrays.toString(arr_d[i]));
        }
        System.out.println();
    }
    public static void function08(){
        System.out.println("第八题：");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 5; i++){
            System.out.print("请输入第" + (i + 1) + "个数:");
            arr[i] = scanner.nextInt();
        }
        System.out.println("当前数组为：" + Arrays.toString(arr));
        System.out.println("请选择您要插入的位置：（0～9）");
        int index = scanner.nextInt();
        System.out.println("请选择您要插入的数据：");
        int data = scanner.nextInt();
        for (int i = 4; i >= index; i--){
            arr[i + 1] = arr[i];
        }
        arr[index] = data;
        System.out.println("当前数组为：" + Arrays.toString(arr));

        System.out.println("请选择您要删除的位置：（0～9）");
        index = scanner.nextInt();
        for (int i = index; i < arr.length - 1; i++){
            arr[i] = arr[i+1];
        }
        int[] arrNew = Arrays.copyOf(arr, arr.length - 1);
        System.out.println("当前数组为：" + Arrays.toString(arrNew));
        System.out.println();
    }
}
