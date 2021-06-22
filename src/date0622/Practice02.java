package date0622;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Practice02 {
    public static void main(String[] args) {
        PokerInformation pokerInformation = new PokerInformation();
        List<Poker> pokers = pokerInformation.getPokers();
        System.out.println("顺序全牌：");
        for (Poker poker : pokers) {
            System.out.print(poker + " ");
        }
        System.out.println("\n");

        System.out.println("乱序全牌：");
        Collections.shuffle(pokers);
        for (Poker poker : pokers) {
            System.out.print(poker + " ");
        }
        System.out.println("\n");

        List<Poker> pokersOne = new ArrayList<>();
        List<Poker> pokersTwo = new ArrayList<>();
        List<Poker> pokersThree = new ArrayList<>();
        List<Poker> pokersBottom = new ArrayList<>();
        for (int i = 0; i < pokers.size() - 3; i++){
            if (i % 3 == 0) pokersOne.add(pokers.get(i));
            else if (i % 3 == 1) pokersTwo.add(pokers.get(i));
            else pokersThree.add(pokers.get(i));
        }
        pokersBottom.add(pokers.get(51));
        pokersBottom.add(pokers.get(52));
        pokersBottom.add(pokers.get(53));

        System.out.println("第一个人的牌：");
        TreeSet<Poker> pokersOneT = new TreeSet<>(pokersOne);
        for (Poker poker : pokersOneT) {
            System.out.print(poker + " ");
        }
        System.out.println("\n");

        System.out.println("第二个人的牌：");
        TreeSet<Poker> pokersTwoT = new TreeSet<>(pokersTwo);
        for (Poker poker : pokersTwoT) {
            System.out.print(poker + " ");
        }
        System.out.println("\n");

        System.out.println("第三个人的牌：");
        TreeSet<Poker> pokersThreeT = new TreeSet<>(pokersThree);
        for (Poker poker : pokersThreeT) {
            System.out.print(poker + " ");
        }
        System.out.println("\n");

        System.out.println("底牌：");
        for (Poker poker : pokersBottom) {
            System.out.print(poker + " ");
        }
        System.out.println("\n");
    }
}
