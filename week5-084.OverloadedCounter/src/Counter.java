public class Counter {


    private int value;
    private boolean check;


    public Counter(int startingValue, boolean check) {
        this.value = startingValue;
        this.check = check;

        if (check) {
            this.check = true;
        }
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0);
        if (check) {
            this.check = true;
        }
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void increase(int increaseAmount) {
        if (increaseAmount < 0) {
        } else {
            this.value += increaseAmount;
        }
    }

    public void decrease() {

        if (check) {
            if (this.value > 0) {
                this.value--;
            }
        } else {
            this.value--;
        }

//        if (!check) {
//            this.value--;
//        } else {
//            while (this.value > 0) {
//                this.value--;
//            }
//        }

    }

    public void decrease(int decreaseAmount) {

        if (decreaseAmount < 0) {
        } else {
            if ((check)) {
                if (this.value - decreaseAmount < 0) {
                    this.value = 0;
                }
            } else {
                this.value = this.value - decreaseAmount;
            }
        }
    }
}

