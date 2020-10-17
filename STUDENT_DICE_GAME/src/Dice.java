import java.util.Random;

public class Dice extends Game{

    /* classic dice */
    private int[] numbers = new int[]{1,2,3,4,5,6};

    public int roll() {
        Random random = new Random();
        return this.numbers[random.nextInt(this.numbers.length - 0) + 0];
    }

}
