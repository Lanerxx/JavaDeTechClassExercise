package date0602;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        function01();
        function02();
    }
    public static void function01(){
        System.out.println("练习1");
        int[] arr1 = {10, 20, 30};
        int[] arr2 = {1, 2, 3};
        int[][] arr = {arr1, arr2};
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void function02(){
        System.out.println("练习2");
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入二维数组的长度：");
        int n = scanner.nextInt();
        int[][] arr_d = new int[n][];
        for (int i = 0; i < n; i++){
            System.out.print("请输入第" + (i + 1) + "个数组的长度：");
            int m = scanner.nextInt();
            int[] arr = new int[m];
            for (int j = 0; j < m; j++){
                System.out.print("请输入第" + (i + 1) + "个数组的第" + (j + 1) + "个数据:");
                arr[j] = scanner.nextInt();
            }
            arr_d[i] = arr;
        }
        for (int i = 0; i < arr_d.length; i++){
            for (int j = 0; j < arr_d[i].length; j++){
                System.out.print(arr_d[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
