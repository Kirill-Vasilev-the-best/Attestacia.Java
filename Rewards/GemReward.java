package Rewards;

import GameItems.*;

public class GemReward implements GameItem {

    //Gem prize opening method
    @Override
    public void open() {
        System.out.println("Gem");
    }
}