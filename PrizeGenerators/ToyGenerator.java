package PrizeGenerators;

import GameItems.*;
import Generator.*;
import Rewards.*;

public class ToyGenerator extends ItemGenerator {

    // prize creation method: Toy
    @Override
    public GameItem createItem() {
        return new ToyReward();
    }
}