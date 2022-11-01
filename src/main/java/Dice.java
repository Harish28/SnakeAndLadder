public class Dice {
    private final int numberOfDice;
    private final int noOfFaces;
    public Dice(int numberOfDice,int noOfFaces) {
        this.numberOfDice = numberOfDice;
        this.noOfFaces = noOfFaces;
    }

    public int rollDice() {
        return ((int) (Math.random()*(noOfFaces*numberOfDice - 1*numberOfDice))) + 1;
    }
}
