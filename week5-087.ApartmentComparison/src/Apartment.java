
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;




    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger (Apartment otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment otherApartment) {
        int priceOfThisApartment = this.squareMeters * this.pricePerSquareMeter;
        int priceOfOtherApartment = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;

        int difference = Math.abs(priceOfThisApartment - priceOfOtherApartment);
        return difference;
    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        int priceOfThisApartment = this.squareMeters * this.pricePerSquareMeter;
        int priceOfOtherApartment = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;

        if (priceOfThisApartment > priceOfOtherApartment) {
            return true;
        } else {
            return false;
        }
    }
}
