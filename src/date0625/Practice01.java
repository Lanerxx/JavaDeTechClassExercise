package date0625;

import java.io.*;

public class Practice01 {
    public static void main(String[] args) throws IOException {
        String path = "src/date0625/practice01.txt";
        DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path),30));
        String str = "zheshi adsadasdsfjhdskjhfksdjhfkjsd";
        System.out.println("UTF的长度：" + "\u0000#zheshi adsadasdsfjhdskjhfksdjhfkjsd".length());
        System.out.println("String的长度：" + str.length());
        dos.writeUTF(str);

//        DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(path)));

    }
}
