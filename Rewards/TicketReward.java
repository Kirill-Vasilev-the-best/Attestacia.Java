package Rewards;
import GameItems.*;

public class TicketReward implements GameItem {
    //Ticket prize opening method
    @Override
    public void open() {
        System.out.println("Ticket");
    }
}