
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros
        int cashInRegisterAtStart = 1000;
        this.cashInRegister = cashInRegisterAtStart;
    }

    public double payEconomical(double cashGiven) {

        if (cashGiven >= 2.50) {
            this.cashInRegister += 2.50;
            this.economicalSold++;
            return cashGiven - 2.50;
        } else {
            return cashGiven;
        }
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price
        // if not enough money given, all is returned and nothing else happens

    }

    public boolean payEconomical(LyyraCard card) {
        double priceOfEconomicalLunch = 2.50;
        if (card.balance() >= priceOfEconomicalLunch) {
            card.pay(priceOfEconomicalLunch);
            economicalSold++;
            return true;
        } else {
            return false;
        }
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= 4.00) {
            cashInRegister += 4.00;
            gourmetSold++;
            return cashGiven - 4.00;
        } else {
            return cashGiven;
        }
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        //    the price of lunch is added to register
        //    the amount of sold lunch is incremented by one
        //    method returns cashGiven - lunch price 
        // if not enough money given, all is returned and nothing else happens
    }

    public boolean payGourmet(LyyraCard card) {
        double priceOfGourmetLunch = 4.00;
        if (card.balance() >= priceOfGourmetLunch) {
            card.pay(priceOfGourmetLunch);
            gourmetSold++;
            return true;
        } else {
            return false;
        }
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum >= 0) {
            card.loadMoney(sum);
            cashInRegister += sum;
        } else {

        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
