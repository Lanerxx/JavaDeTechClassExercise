package date0623;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.function.BiConsumer;

public class Practice02 {
    public static void main(String[] args) throws IOException {
        //HashMap Hashtable LinkedHashMap TreeMap Properties

        Number0623 number06231 = new Number0623("201702", "aksjd2");
        Number0623 number06232 = new Number0623("201707", "aksjd3");
        Number0623 number06233 = new Number0623("201705", "aksjd12");
        Number0623 number06234 = new Number0623("201705", "aksjd32");

        //HashMap
        System.out.println("HashMap");
        HashMap<Number0623, Integer> hashMap = new HashMap<>();
        hashMap.put(number06231, 11);
        hashMap.put(number06232, 12);
        hashMap.put(number06233, 13);
        hashMap.put(number06234, 14);
        hashMap.forEach(new BiConsumer<Number0623, Integer>() {
            @Override
            public void accept(Number0623 number0623, Integer integer) {
                System.out.println(number0623 + " " + integer);
            }
        });
        System.out.println("\n");

        //LinkedHashMap
        System.out.println("LinkedHashMap");
        LinkedHashMap<Number0623, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(number06231, 11);
        linkedHashMap.put(number06232, 12);
        linkedHashMap.put(number06233, 13);
        linkedHashMap.put(number06234, 14);
        linkedHashMap.forEach(new BiConsumer<Number0623, Integer>() {
            @Override
            public void accept(Number0623 number0623, Integer integer) {
                System.out.println(number0623 + " " + integer);
            }
        });
        System.out.println("\n");

        //TreeMap
        System.out.println("TreeMap");
        TreeMap<Number0623, Integer> treeMap = new TreeMap<>(new Comparator<Number0623>() {
            @Override
            public int compare(Number0623 n1, Number0623 n2) {
                return n1.getNumber().compareTo(n2.getNumber());
            }
        });
        treeMap.put(number06231, 11);
        treeMap.put(number06232, 12);
        treeMap.put(number06233, 13);
        treeMap.put(number06234, 14);
        treeMap.forEach(new BiConsumer<Number0623, Integer>() {
            @Override
            public void accept(Number0623 number0623, Integer integer) {
                System.out.println(number0623 + " " + integer);
            }
        });
        System.out.println("\n");

        //Properties
        System.out.println("Properties");
        Properties pro = new Properties();
        pro.load(new FileInputStream("src/user.properties"));
        System.out.println(pro.get("userName") + ", " + pro.get("userPassword"));

    }
}
class Number0623{
    String number;
    String string;

    public Number0623(String number, String string){
        this.number = number;
        this.string = string;
    }

    public String getNumber() {
        return number;
    }

    public String getString() {
        return string;
    }

    @Override
    public String toString() {
        return "Number0623{" +
                "number='" + number + '\'' +
                ", string='" + string + '\'' +
                '}';
    }
}
