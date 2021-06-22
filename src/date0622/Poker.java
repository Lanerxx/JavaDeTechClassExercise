package date0622;

import java.util.Arrays;

public class Poker implements Comparable<Poker>{
    private String[] styles = {"♥", "♠", "♣", "♦", ""};
    private String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2", "小王", "大王"};

    private int style_index;
    private int number_index;

    public Poker(int style_index, int number_index){
        this.style_index = style_index;
        this.number_index = number_index;
    }

    public int getStyle_index() {
        return style_index;
    }

    public int getNumber_index() {
        return number_index;
    }

    public void setStyle_index(int style_index) {
        this.style_index = style_index;
    }

    public void setNumber_index(int number_index) {
        this.number_index = number_index;
    }

    @Override
    public String toString() {
        return styles[style_index] + numbers[number_index];
    }

    @Override
    public int compareTo(Poker poker) {
        return this.number_index == poker.getNumber_index() ? this.style_index - poker.getStyle_index() : this.number_index - poker.getNumber_index();
    }
}
