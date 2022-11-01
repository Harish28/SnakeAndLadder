import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Application {
    public static void main(String[] args) {
        Dice dice = new Dice(1,6);
        Player p1 = new Player("Raju",1,0);
        Player p2 = new Player("Rancho",2,0);
        Player p3 = new Player("Chatur",3,0);
        Player p4 = new Player("Farhan",4,0);
        Queue<Player> players = new LinkedList<>();
        players.offer(p1);
        players.offer(p2);
        players.offer(p3);
        players.offer(p4);

        Board board = new Board(100,new HashMap<>(),new HashMap<>());
        board.getSnacks().put(10,2);
        board.getSnacks().put(99,12);
        board.getSnacks().put(5,25);
        board.getSnacks().put(40,89);
//        Cell snake1 = new Cell(10,2);
//        Cell snake2 = new Cell(99,12);
//        Cell ladder1 = new Cell(5,25);
//        Cell ladder2 = new Cell(40,89);
        Game gb=new Game(dice,board,players);
        gb.startGame();
    }
}
