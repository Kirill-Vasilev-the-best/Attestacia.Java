package Rewards;
import GameItems.*;

public class NoPrizeReward implements GameItem {
    //no prize opening method
    @Override
    public void open() {
        System.out.println("no prize");
    }
}