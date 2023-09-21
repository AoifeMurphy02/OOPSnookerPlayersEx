package org.example;

public class mainAppPlayers {
    public static void main(String[] args) {
      SnookerPlayer one = new SnookerPlayer("dan", "irish", 600.00, 10,6);
        System.out.println(one);
        SnookerPlayer two = new SnookerPlayer("becca", "british", 300.00, 18,3);
        System.out.println(two);
        one.increasePrizeMoney(100);
        System.out.println(one);
        one.updatePerformance(true);
        System.out.println(one);
    }
}
