package Rewards;
import GameItems.*;

public class ToyReward implements GameItem {
    //Toy prize opening method
    @Override
    public void open() {
        System.out.println("Toy");
    }
}