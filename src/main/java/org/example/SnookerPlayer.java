package org.example;

import java.util.Objects;

public class SnookerPlayer implements Comparable<SnookerPlayer> {
    //i.	Fields for name, nationality, prize money won at the tournament, number of games played and number of games won at the tournament by the snooker player.
    private String name;
    private String nationality;
    private double prizeMoney;
    private int gamesPlayed;
    private int gamesWon;

    public SnookerPlayer() {

    }

    public SnookerPlayer(String name, String nationality, double prizeMoney, int gamesPlayed, int gamesWon) {
        this.name = name;
        this.nationality = nationality;
        this.prizeMoney = prizeMoney;
        this.gamesPlayed = gamesPlayed;
        this.gamesWon = gamesWon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public double getPrizeMoney() {
        return prizeMoney;
    }

    public void setPrizeMoney(double prizeMoney) {
        this.prizeMoney = prizeMoney;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    @Override
    public String toString() {
        return "SnookerPlayer{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", prizeMoney=" + prizeMoney +
                ", gamesPlayed=" + gamesPlayed +
                ", gamesWon=" + gamesWon +
                '}';
    }

    public double increasePrizeMoney(double amount) {

        return prizeMoney += amount;
    }

    public int updatePerformance(boolean won) {
        if (won) {
            gamesWon += 1;
        }
        gamesPlayed++;
        return gamesWon;
    }


    @Override
    public int compareTo(SnookerPlayer player) {
        return Integer.compare(player.getGamesWon(), this.getGamesWon());
    }
}
