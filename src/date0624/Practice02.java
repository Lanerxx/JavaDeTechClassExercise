package date0624;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Practice02 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/date0624/practice02.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        byte[] bytes = new byte[(int) file.length()];
        fileInputStream.read(bytes);
        String[] strs = new String(bytes).split("\n");

        Map<String, String> map = new HashMap<>();
        for (String str : strs) {
            map.put(str.split("=")[0],str.split("=")[1]);
        }

        System.out.println(map);

    }
}
