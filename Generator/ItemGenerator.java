package Generator;

import GameItems.*;

//  creation of prototype factories (Generators)
public abstract class ItemGenerator {

    // prize chest opening method
    public void openReward() {
        GameItem gameItem = createItem();       // creation of prize
        gameItem.open();                        // issuing a prize from the chest
    }

    // abstract method for creating a product type (prize box)
    public abstract GameItem createItem();

}