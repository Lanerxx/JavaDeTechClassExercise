package date0622;

import java.util.ArrayList;
import java.util.List;

public class PokerInformation {
    private List<Poker> pokers = new ArrayList<>();
    public PokerInformation(){
        for (int i = 0; i < 52; i++){
            this.pokers.add(new Poker(i%4, i/4));
        }
        pokers.add(new Poker(4, 13));
        pokers.add(new Poker(4, 14));
    }

    public List<Poker> getPokers(){
        return this.pokers;
    }
}
