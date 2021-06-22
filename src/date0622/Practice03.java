package date0622;

import java.util.*;

public class Practice03 {
    public static void main(String[] args) {
        Map<Integer, Poker> map = new HashMap<>();
        List<Poker> pokerList = new PokerInformation().getPokers();
        for (int i = 0; i < pokerList.size(); i++){
            map.put(i, pokerList.get(i));
        }
        System.out.println(map);

        Set<Map.Entry<Integer, Poker>> entries = map.entrySet();
        List<Map.Entry<Integer, Poker>> entries1 = new ArrayList<>(entries);
        Collections.shuffle(entries1);


        Map<Integer, Poker> mapOne = new HashMap<>();
        Map<Integer, Poker> mapTwo = new HashMap<>();
        Map<Integer, Poker> mapThree = new HashMap<>();
        Map<Integer, Poker> mapBottom = new HashMap<>();

        for (int i = 0; i < entries1.size() - 3; i++){
            if (i % 3 == 0) mapOne.put(entries1.get(i).getKey(), entries1.get(i).getValue());
            else if (i % 3 == 1) mapTwo.put(entries1.get(i).getKey(), entries1.get(i).getValue());
            else mapThree.put(entries1.get(i).getKey(), entries1.get(i).getValue());
        }
        mapBottom.put(entries1.get(51).getKey(), entries1.get(51).getValue());
        mapBottom.put(entries1.get(52).getKey(), entries1.get(52).getValue());
        mapBottom.put(entries1.get(53).getKey(), entries1.get(53).getValue());

        TreeMap<Integer, Poker> treeMap1 = new TreeMap<>(mapOne);
        TreeMap<Integer, Poker> treeMap2 = new TreeMap<>(mapTwo);
        TreeMap<Integer, Poker> treeMap3 = new TreeMap<>(mapThree);
        TreeMap<Integer, Poker> treeBottom = new TreeMap<>(mapBottom);
        System.out.println(treeMap1);
        System.out.println(treeMap2);
        System.out.println(treeMap3);
        System.out.println(treeBottom);
    }
}
