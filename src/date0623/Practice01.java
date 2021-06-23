package date0623;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Practice01 {
    public static void main(String[] args) {
        //map的四种迭代方式
        Map<String, String> map = new HashMap<>();
        map.put("第一", "sdskj");
        map.put("第二", "asdsa");
        map.put("第三", "24jjj");
        map.put("第四", "dfd3");

        //first
        Set<String> stringSet = map.keySet();
        for (String s : stringSet) {
            System.out.print(map.get(s) + " ");
        }
        System.out.println("\n");

        //second
        Set<Map.Entry<String, String>> set = map.entrySet();
        for(Map.Entry<String, String> entry : set){
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        System.out.println("\n");

        //third
        Iterator<Map.Entry<String, String>> setIterator = set.iterator();
        while (setIterator.hasNext()){
            System.out.println(setIterator.next());
        }
        System.out.println("\n");

        //fourth
        map.forEach(new BiConsumer<String, String>(){
            @Override
            public void accept (String s1, String s2){
                System.out.println(s1 + ", " + s2);
            }
        });

    }
}
