package PrizeGenerators;

import GameItems.*;
import Generator.*;
import Rewards.*;

public class CandyGenerator extends ItemGenerator {

    // prize creation method: candy
    @Override
    public GameItem createItem() {
        return new CandyReward();
    }
}