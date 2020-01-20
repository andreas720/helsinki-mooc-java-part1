public class BoundedCounter {
    private int value;
    private int upperLimit;


    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public BoundedCounter(int upperLimit, int value) {
        this.value = value;
        this.upperLimit = upperLimit;
    }

    public void next() {
        if (value >= upperLimit) {
            value = 0;
        } else {
            value++;
        }
    }

    public String toString() {
        if (value < 10) {
            return "0" + value;
        } else {
            return "" + value;
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if ((value < 0) || (value > upperLimit))  {
        } else {
            this.value = value;
        }
    }

}