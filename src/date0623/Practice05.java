package date0623;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;

public class Practice05 {
    public static void main(String[] args) {
        Tempt tempt1 = new Tempt(1);
        Tempt tempt2 = new Tempt(1);
        System.out.println(tempt1.hashCode());
        System.out.println(tempt2.hashCode());
        System.out.println(tempt1.equals(tempt2));

        Map<Tempt, String> map = new HashMap<>();
        map.put(tempt1, "sada");
        map.put(tempt2, "sad2a");

        map.forEach(new BiConsumer<Tempt, String>() {
            @Override
            public void accept(Tempt tempt, String s) {
                System.out.println(tempt);
            }
        });

        System.out.println(map.get(tempt1));
    }
}

class Tempt{
    int number;
    Tempt(int number){
        this.number = number;
    }

    @Override
    public String toString() {
        return "Tempt{" +
                "number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tempt tempt = (Tempt) o;
        return number == tempt.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}