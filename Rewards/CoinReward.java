package Rewards;
import GameItems.*;

public class CoinReward implements GameItem {
    //Coin prize opening method
    @Override
    public void open() {
        System.out.println("Coin");
    }
}