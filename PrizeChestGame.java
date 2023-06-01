import Generator.ItemGenerator;
import PrizeGenerators.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class PrizeChestGame {
    public static void main(String[] args) {

        List<ItemGenerator> generatorList = new ArrayList<>(); // creation list of generator Items
        generatorList.add(new GemGenerator());
        generatorList.add(new GoldGenerator());
        generatorList.add(new TicketGenerator());
        generatorList.add(new ToyGenerator());
        generatorList.add(new CoinGenerator());
        generatorList.add(new CandyGenerator());
        generatorList.add(new NoPrizeGenerator());
        System.out.println("enter the number of opening the chest with prizes:");
        Scanner in = new Scanner(System.in);
        int numberOfPrizes = in.nextInt();
        in.close();
        System.out.println("you got the following prizes:");
        for (int i = 0; i < numberOfPrizes; i++) {
            int index = new Random().nextInt(generatorList.size());
            ItemGenerator itemGenerator = generatorList.get(index); // receiving a random reward
            itemGenerator.openReward();     // opening the chest with the reward
        }
    }
}
