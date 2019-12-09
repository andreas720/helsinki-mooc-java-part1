
public class NumberStatistics {
    private int amountOfNumbers = 0;
    private int sum = 0;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        this.amountOfNumbers++;

        if (this.amountOfNumbers == 0) {
            sum = 0;
        } else {
            sum += number;
        }
    }

    public int amountOfNumbers() {
        return amountOfNumbers;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        if (this.amountOfNumbers == 0) {
            return 0;
        } else {
            return (sum / (double) amountOfNumbers);
        }
    }


}
