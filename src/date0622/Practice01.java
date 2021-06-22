package date0622;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice01 {
    public static void main(String[] args) {
        String[] styles = {"♥", "♠", "♣", "♦"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] specials = {"大王 ", "小王"}; // 大🃏 小🃏

        List<String> pokerAll = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < styles.length; j++){
                pokerAll.add(styles[j] + numbers[i]);
            }
        }
        pokerAll.add(specials[0]);
        pokerAll.add(specials[1]);

        System.out.println("所有牌：");
        for (String s : pokerAll) {
            System.out.print(s + ' ');
        }
        System.out.println("\n");

        System.out.println("洗牌后：");
        Collections.shuffle(pokerAll);
        for (String s : pokerAll) {
            System.out.print(s + ' ');
        }
        System.out.println("\n");

        List<String> pokerOne = new ArrayList<>();
        List<String> pokerTwo = new ArrayList<>();
        List<String> pokerThree = new ArrayList<>();
        int point = 1; // 指向抓牌人序号 1：pokerOne 2：pokerOne 3：pokerOne
        for (int i = 0; i < pokerAll.size() - 3; i++){
            switch (point){
                case 1:
                    pokerOne.add(pokerAll.get(i));
                    point = 2;
                    break;
                case 2:
                    pokerTwo.add(pokerAll.get(i));
                    point = 3;
                    break;
                case 3:
                    pokerThree.add(pokerAll.get(i));
                    point = 1;
                    break;
            }
        }

        System.out.println("第一个人的牌（乱序）：");
        for (String s : pokerOne) {
            System.out.print(s + ' ');
        }
        System.out.println();
        System.out.println("第二个人的牌（乱序）：");
        for (String s : pokerTwo) {
            System.out.print(s + ' ');
        }
        System.out.println();
        System.out.println("第三个人的牌（乱序）：");
        for (String s : pokerThree) {
            System.out.print(s + ' ');
        }
        System.out.println("\n");

        Collections.sort(pokerOne, new charComparator());
        System.out.println("第一个人的牌（升序）：");
        for (String s : pokerOne) {
            System.out.print(s + ' ');
        }
        System.out.println();
        Collections.sort(pokerTwo, new charComparator());
        System.out.println("第二个人的牌（升序）：");
        for (String s : pokerTwo) {
            System.out.print(s + ' ');
        }
        System.out.println();
        Collections.sort(pokerThree, new charComparator());
        System.out.println("第三个人的牌（升序）：");
        for (String s : pokerThree) {
            System.out.print(s + ' ');
        }
        System.out.println();



    }
}

class charComparator implements Comparator<String>{
    @Override
    public int compare(String s1, String s2) {
        int c1 = s1.charAt(1);
        int c2 = s2.charAt(1);
        if (s1.length() == 3 && s1.charAt(2) == '0'){
            c1 = 58;
        }
        if (s2.length() == 3 && s2.charAt(2) == '0'){
            c2 = 58;
        }
        if (s1.charAt(0) == '大') c1++;
        if (s2.charAt(0) == '大') c2++;
        return c1 < c2 ? 1 : (c1 == c2 ? 0 : -1);
    }
}
