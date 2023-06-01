package PrizeGenerators;

import GameItems.*;
import Generator.*;
import Rewards.*;

public class TicketGenerator extends ItemGenerator {

    // prize creation method: Ticket
    @Override
    public GameItem createItem() {
        return new TicketReward();
    }
}