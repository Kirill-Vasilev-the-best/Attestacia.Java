package Rewards;
import GameItems.*;

public class CandyReward implements GameItem {
    //Candy prize opening method
    @Override
    public void open() {
        System.out.println("Candy");
    }
}
