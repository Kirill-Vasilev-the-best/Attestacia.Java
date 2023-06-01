package Rewards;

import GameItems.*;

public class GoldReward implements GameItem {

    //Gold prize opening method
    @Override
    public void open() {
        System.out.println("Gold");
    }
}