package PrizeGenerators;

import GameItems.*;
import Generator.*;
import Rewards.*;

public class GoldGenerator extends ItemGenerator {

    // prize creation method: Gold
    @Override
    public GameItem createItem() {          // ��������������� ������ ��� ��������  �������� � �������
        return new GoldReward();            // ������� ����� � ������������ ����� GoldReward
    }
}