package date0617;

public class Practice01 {
    public static void main(String[] args) {
        Integer ii2 = Integer.valueOf("213");
        Integer ii3 = 100;
        int i = ii2.intValue();
        System.out.println(i);

        Character cc = 's';
        char c = cc.charValue();
        System.out.println(c);

        int[] maths = new int[5];
        for (int j = 0; j < 5; j++) {
            maths[j] = (int)((Math.random() * 10) + 1);
        }
        for (int j = 0; j < maths.length; j++) {
            System.out.print(maths[j] + ' ');
        }
        System.out.println();

        Object0617 object0617 = new Object0617();
        object0617.setId(10);
        object0617.setDetail("jadshakjsdh");

        Object0617 object06172 = new Object0617();
        object06172.setId(10);
        object06172.setDetail("jadshakjsdh");

        System.out.println(object0617);
        System.out.println(object0617.equals(object06172));
        object0617 = null;
        object06172 = null;
        System.gc();

    }
}
