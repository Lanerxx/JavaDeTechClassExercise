package date0623;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Practice03 {
    public static void main(String[] args) throws IOException {
        // File functions
        File file = new File("src/date0623/tempt2.txt");
        System.out.println(file.getName());
        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getParent());
        System.out.println(file.exists());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
        System.out.println(file.length());
        System.out.println(file.renameTo(new File("src/tempt2.txt")));

        File file1 = new File("src/date0623/tempt.txt");
        file1.createNewFile();

        File file2 = new File("src/date0623/firstDir/secondDir/thirdDir");
        file2.mkdirs();

        File file3 = new File("src/date0623/tempt.txt");
        file3.delete();

        File file4 = new File("src/date0623.firstDir");
        String[] list = file4.list();
        System.out.println(Arrays.toString(list));


    }
}
