package date0625;

import java.io.*;

public class Practice02 {
    public static void main(String[] args) throws IOException {
        //Reader FileReader BufferedReader PrintReader
        //Writer FileWriter BufferedWriter
        //OutputStreamReader
        //InputStreamReader


        PrintWriter pw = new PrintWriter("src/date0625/practice02.txt");
        pw.append("asdjhaskdhjash");
        pw.close();
        FileWriter fw = new FileWriter("src/date0625/practice02.txt",true);
//        fw.write("first.");
//        fw.write("second.");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("asdjasjkd");
        bw.newLine();
        bw.write(111);
        fw.close();



    }
}
