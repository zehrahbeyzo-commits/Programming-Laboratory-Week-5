package programminglaboratoryweek5;

public class TwoDaysPackage extends Package {

    double flatfee;

    public TwoDaysPackage(String names, String addresss, String citys, String states, int zipcodes, String namer, String addressr, String cityr, String stater, int zipcoder, double weight, double cost, double flatfee) {
        super(names, addresss, citys, states, zipcodes, namer, addressr, cityr, stater, zipcoder, weight, cost);

        if (flatfee <= 0) {
            throw new ExceptionInInitializerError();
        } else {
            this.flatfee = flatfee;
        }
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + this.flatfee;
    }

    public void display() {
        System.out.println("=== TWO-DAY SHIPPING ===");
        System.out.println("Sender: " + this.names + ", " + this.addresss + ", " + this.states + ", " + this.citys + ", " + this.zipcodes);
        System.out.println("Reciever: " + this.namer + ", " + this.addressr + ", " + this.stater + ", " + this.cityr + ", " + this.zipcoder);
        System.out.println("Weight: " + this.weight + " | Cost: " + this.cost);
        System.out.println("Two-Day Shipping Cost: " + this.flatfee);
        System.out.println("Total Cost: " + this.calculateCost());
        System.out.println("");
    }
}
