package PrizeGenerators;

import GameItems.*;
import Generator.*;
import Rewards.*;

public class GemGenerator extends ItemGenerator {

    // prize creation method: gem
    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}
