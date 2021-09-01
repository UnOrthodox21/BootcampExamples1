package rihards.game;

public class Game {

    public static void main(String[] args) {
        Player player1 = new Player("Luke Skywalker", new Weapon(8, "Lightsaber"));
        Player player2 = new Player("The Black Mamba", new Weapon(10, "Hatori Hanzo Sword"));

        battle(player1, player2);
        determineWinner(player1, player2);
    }

    public static void battle(Player player1, Player player2) {
        for (int i = 0; i < 100; i++) {
            if (player1.getHealth() == 0 || player2.getHealth() == 0){
                break;
            }
            player1.attack(player2);
            player2.attack(player1);
        }
    }

    public static void determineWinner(Player player1, Player player2) {
        int points;
         if (player1.getHealth() > player2.getHealth()) {
             points = player1.getHealth() - player2.getHealth();
             System.out.println(player1.getName() + " won against " + player2.getName() + " by " + points + " points.");
         } else if (player2.getHealth() > player1.getHealth()) {
             points = player2.getHealth() - player1.getHealth();
             System.out.println(player2.getName() + " won against " + player1.getName() + " by " + points + " points.");
         } else {
             System.out.println("The battle between " + player1.getName() + " and " + player2.getName() + " ended in a draw!");
         }
    }
}
