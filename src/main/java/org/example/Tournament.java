package org.example;
import java.util.ArrayList;
import java.util.Collections;

public class Tournament {
    private String name;
    private double totalPrizeMoney;
    private ArrayList<SnookerPlayer> snookerPlayers;

    public Tournament(String name) {
        this.name = name;
        this.totalPrizeMoney = 0.0;
        this.snookerPlayers = new ArrayList<>();

    }

    public Tournament(String name, double totalPrizeMoney, ArrayList<SnookerPlayer> snookerPlayers) {
        this.name = name;
        this.totalPrizeMoney = totalPrizeMoney;
        this.snookerPlayers = snookerPlayers;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<SnookerPlayer> getSnookerPlayers() {
        return snookerPlayers;
    }

    public void setSnookerPlayers(ArrayList<SnookerPlayer> snookerPlayers) {
        this.snookerPlayers = snookerPlayers;
    }

    public double getTotalPrizeMoney() {
        return totalPrizeMoney;
    }

    public void setTotalPrizeMoney(double totalPrizeMoney) {
        this.totalPrizeMoney = totalPrizeMoney;
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "name='" + name + '\'' +
                ", totalPrizeMoney=" + totalPrizeMoney +
                ", snookerplayer=" + snookerPlayers +
                '}';
    }

    public void IncreaseAll(double amount) {
        for (SnookerPlayer player : snookerPlayers) {
            player.increasePrizeMoney(amount);
        }

    }

    public void addPlayer(SnookerPlayer player) {
        snookerPlayers.add(player);
    }

    public void displayPerf() {
        System.out.println("Snooker Player Performance Table - " + name);
        System.out.println("Player Name" + "Games Played" + "Games Won" + "Prize Money");
        for (SnookerPlayer player : snookerPlayers) {
            System.out.println(
                    player.getName() + "     " + player.getGamesPlayed() + "        " + player.getGamesWon() + "       " + player.getPrizeMoney());
        }
    }

    public double totalPlayersPrize() {
        double totalPrizeMoney = 0.0;
        for (SnookerPlayer player : snookerPlayers) {
            totalPrizeMoney += player.getPrizeMoney();
        }
        return totalPrizeMoney;
    }

    public void sortPlayers() {
        Collections.sort(snookerPlayers);
    }
    public void result(String winnerName, String loserName){
        SnookerPlayer winner = null;
        SnookerPlayer looser = null;

        for(SnookerPlayer player : snookerPlayers){
            if(player.getName().equals(winnerName)){
                winner = player;
            }else if(player.getName().equals(loserName)){
                looser = player;
            }
        }

        if(winner != null && looser != null){
            winner.updatePerformance(true);
            looser.updatePerformance(false);
            System.out.println("update made the winner was: " + winnerName );
        }


    }

}
