package org.example;

import java.util.ArrayList;

public class MainApp {

    public static void main(String[] args) {
        SnookerPlayer one = new SnookerPlayer("dan", "irish", 0, 0, 0);
        SnookerPlayer two = new SnookerPlayer("becca", "british", 0, 0, 0);
        SnookerPlayer three = new SnookerPlayer("Leah", "French", 0, 0, 0);
        ArrayList<SnookerPlayer>snookerPlayers = new ArrayList<>();
        snookerPlayers.add(one);
        snookerPlayers.add(two);
        snookerPlayers.add(three);
        Tournament worldChampionship = new Tournament("worldChampionship", 3000000.00,snookerPlayers);

        System.out.println(worldChampionship);
        worldChampionship.IncreaseAll(10000);
        System.out.println(worldChampionship);
        one.updatePerformance(true);
        one.updatePerformance(true);
        three.updatePerformance(true);
        worldChampionship.displayPerf();


        SnookerPlayer player1 = new SnookerPlayer("Alex","irish", 200,3,2);
        SnookerPlayer player2 = new SnookerPlayer("Dan","German", 100,3,1);
        Tournament uKMasters = new Tournament("uKMasters");
        uKMasters.addPlayer(player1);
        uKMasters.addPlayer(player2);

        System.out.println( "total prize one: "+uKMasters.totalPlayersPrize());
    }
}