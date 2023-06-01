package PrizeGenerators;

import GameItems.*;
import Generator.*;
import Rewards.*;

public class CoinGenerator extends ItemGenerator {

    // prize creation method: Coin
    @Override
    public GameItem createItem() {
        return new CoinReward();
    }
}