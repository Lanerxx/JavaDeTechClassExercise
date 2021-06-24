package date0624;

import java.io.*;

public class Practice03 {
    public static void main(String[] args) throws IOException {
        String originPath = "/Volumes/Macintosh HD/Users/apple/Desktop/留学/中文-考核类型说明.jpg";
        String targetPath = "src/date0624/a.jpg";
        copyImage(originPath, targetPath);
    }
    public static void copyImage(String originPath, String targetPath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(originPath);
        FileOutputStream fileOutputStream = new FileOutputStream(targetPath);

        byte[] bytes = new byte[1024];

        int len = -1;
        while ((len = fileInputStream.read(bytes)) != -1){
            fileOutputStream.write(bytes, 0, len);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
