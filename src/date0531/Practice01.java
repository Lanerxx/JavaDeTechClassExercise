package date0531;

public class Practice01 {
    public static void main(String[] args) {
        char[] chars = new char[2];
        System.out.println(chars[1]);

        int[] arr = new int[40];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i * i - 2;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
