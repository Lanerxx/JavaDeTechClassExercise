package date0531;

public class Practice03 {
    public static void main(String[] args) {
        int[] arr = {12, 3, 23, 232, 0, 234, 34, 4};
        int tempt;
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    tempt = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tempt;
                }
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
