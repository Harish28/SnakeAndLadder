import javax.swing.plaf.IconUIResource;
import java.util.List;
import java.util.Queue;

public class Game {
    private final Dice dice;
    private final Board board;
    private final Queue<Player> players;

    //I think we can use builder pattern to build the object of the Game class
    public Game(Dice dice, Board board, Queue<Player> queue) {
        this.dice = dice;
        this.board = board;
        this.players = queue;
    }

    public void startGame() {
        while(players.size() > 1) {
            Player p = players.poll();
            int value = dice.rollDice();
            System.out.println("Player " + p.getName() + " is " + p.getPosition() + " Dice face value " + value);
            int curPositionOfPlayer = p.getPosition();
            int nextPosition = curPositionOfPlayer + value;
            if(nextPosition > board.getBoardSize()) {
                players.offer(p);
                continue;
            } else if(nextPosition == board.getBoardSize()) {
                System.out.println("Player " + p.getName() + " Has won...");
            } else {
                if(board.getSnacks().containsKey(nextPosition)) {
                    nextPosition = board.getSnacks().get(nextPosition);
                } else if (board.getLadder().containsKey(nextPosition)) {
                    nextPosition = board.getLadder().get(nextPosition);
                }
                p.setPosition(nextPosition);
                players.offer(p);
            }
        }

    }
}
