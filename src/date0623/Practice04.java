package date0623;

import java.io.File;

public class Practice04 {
    public static void main(String[] args) {
        //recursion
        File file = new File("src/date0623/firstDir");
        deleteFiles(file);
        file.delete();
    }

    public static void deleteFiles(File file){
        File[] files = file.listFiles();

        for (File f : files) {
            if (f.isDirectory()){
                deleteFiles(f);
            }
            f.delete();
        }
    }
}
