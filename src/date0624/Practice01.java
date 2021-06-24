package date0624;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Practice01 {
    public static void main(String[] args) throws IOException {
        File file = new File("src/date0624/practice01.txt");
        FileInputStream fileInputStream = new FileInputStream(file);

        byte[] bytes = new byte[(int)file.length()];
        fileInputStream.read(bytes);

        String[] strs = new String(bytes).split("\n");
        Map map = new HashMap();
        map.put(strs[0].split("=")[1],strs[1].split("=")[1]);
        System.out.println(map);

    }
}
