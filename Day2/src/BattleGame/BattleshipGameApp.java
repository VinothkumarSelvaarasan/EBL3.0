public class BattleshipGameApp {

    public static void main(String[] args) {
        BattleshipGame game = new BattleshipGame(8); // Create a game with 8x8 sea grid

        game.placeShip(2, 3);
        game.placeShip(5, 5);
        game.placeShip(7, 1);

        System.out.println("Attack result at (2, 3): " + game.attack(2, 3)); // Should print true (hit)
        System.out.println("Attack result at (5, 5): " + game.attack(5, 5)); // Should print true (hit)
        System.out.println("Attack result at (7, 1): " + game.attack(7, 1)); // Should print true (hit)
        System.out.println("Attack result at (0, 0): " + game.attack(0, 0)); // Should print false (miss)
        System.out.println("Attack result at (9, 9): " + game.attack(9, 9)); // Should print "Invalid coordinates. Attack is out of bounds." and return false (out of bounds)
    }
}