package PrizeGenerators;

import GameItems.*;
import Generator.*;
import Rewards.*;

public class NoPrizeGenerator extends ItemGenerator {

    // prize creation method: no prize
    @Override
    public GameItem createItem() {
        return new NoPrizeReward();
    }
}