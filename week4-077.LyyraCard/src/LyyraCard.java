public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance = balanceAtStart;
    }

    public String toString() {
        // write code here
        return "The card has " + balance + " euros";
    }

    public void payEconomical() {
        if (balance < 2.50) {
        } else {
            balance = balance - 2.50;
        }
    }

    public void payGourmet() {
        if (balance < 4) {

        } else {
            balance = balance - 4;
        }
    }

    public void loadMoney (double amount) {
        if (amount < 0) {

        } else {
            this.balance += amount;
            if (balance > 150) {
                balance = 150;
            }
        }
    }

}
