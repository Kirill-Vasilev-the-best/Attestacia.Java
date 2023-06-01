package PrizeGenerators;

import GameItems.*;
import Generator.*;
import Rewards.*;

public class GoldGenerator extends ItemGenerator {

    // prize creation method: Gold
    @Override
    public GameItem createItem() {          // переопределение метода для создания  сундучка с золотом
        return new GoldReward();            // возврат приза с определенным типом GoldReward
    }
}