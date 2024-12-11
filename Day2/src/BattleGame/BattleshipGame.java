
public class BattleshipGame {

    private boolean[][] seaGrid;

    public BattleshipGame(int size) {
        seaGrid = new boolean[size][size];
    }

    public void placeShip(int x, int y) {
        if (x < 0 || x >= seaGrid.length || y < 0 || y >= seaGrid[0].length) {
            System.out.println("Invalid coordinates. Ship cannot be placed.");
            return;
        }
        seaGrid[x][y] = true;
    }

    public boolean attack(int x, int y) {
        if (x < 0 || x >= seaGrid.length || y < 0 || y >= seaGrid[0].length) {
            System.out.println("Invalid coordinates. Attack is out of bounds.");
            return false;
        }
        return seaGrid[x][y];
    }
}