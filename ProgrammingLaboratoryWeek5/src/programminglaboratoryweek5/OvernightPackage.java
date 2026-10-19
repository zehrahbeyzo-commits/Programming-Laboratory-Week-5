package programminglaboratoryweek5;

public class OvernightPackage extends Package {

    double additionalfee;

    public OvernightPackage(String names, String addresss, String citys, String states, int zipcodes, String namer, String addressr, String cityr, String stater, int zipcoder, double weight, double cost, double additionalfee) {
        super(names, addresss, citys, states, zipcodes, namer, addressr, cityr, stater, zipcoder, weight, cost);

        if (additionalfee <= 0) {
            throw new ExceptionInInitializerError();
        } else {
            this.additionalfee = additionalfee;
        }
    }

    @Override
    public double calculateCost() {
        return super.calculateCost() + weight * this.additionalfee;
    }

    public void display() {
        System.out.println("=== OVERNIGHT SHIPPING ===");
        System.out.println("Sender: " + this.names + ", " + this.addresss + ", " + this.states + ", " + this.citys + ", " + this.zipcodes);
        System.out.println("Reciever: " + this.namer + ", " + this.addressr + ", " + this.stater + ", " + this.cityr + ", " + this.zipcoder);
        System.out.println("Weight: " + this.weight + " | Cost: " + this.cost);
        System.out.println("Overnight Shipping Cost (per ounce): " + this.additionalfee);
        System.out.println("Total Cost: " + this.calculateCost());
        System.out.println("");
    }
}
