package date0618;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Practice01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(10);
        list.add(12);
        System.out.println(list.lastIndexOf(10));
    }
}
