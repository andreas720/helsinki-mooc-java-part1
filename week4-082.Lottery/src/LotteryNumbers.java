import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();
    private static int noOfDaysInWeek = 7;


    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.numbers = new ArrayList<Integer>();
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        this.numbers = new ArrayList<Integer>();


        while (this.numbers.size() < this.noOfDaysInWeek) {
            int lottoNumber = random.nextInt(39 + 1);

            if (!(containsNumber(lottoNumber)) && (lottoNumber > 0)) {
                this.numbers.add(lottoNumber);
            } else {
            }
        }
        // We'll format a list for the numbers
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        if (this.numbers.contains(number)) {
            return true;
        } else {
            return false;
        }
    }
}
