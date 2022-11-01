import lombok.Getter;

import java.util.Map;

@Getter
public class Board {
    private final int boardSize;
    private final Map<Integer,Integer> snacks;
    private final Map<Integer,Integer> ladder;

    public Board(int boardSize, Map<Integer, Integer> snacks, Map<Integer, Integer> ladder) {
        this.boardSize = boardSize;
        this.snacks = snacks;
        this.ladder = ladder;
    }
}
