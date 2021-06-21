package date0621;

import java.util.TreeSet;

public class Practice01 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet();
        treeSet.add(10);
        treeSet.add(6);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(14);
        treeSet.add(8);

        for (Integer i : treeSet){
            System.out.println(i);
        }
    }
}
