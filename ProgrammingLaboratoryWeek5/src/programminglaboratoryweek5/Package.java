package programminglaboratoryweek5;

public class Package {

    String names;
    String addresss;
    String citys;
    String states;
    int zipcodes;
    String namer;
    String addressr;
    String cityr;
    String stater;
    int zipcoder;
    double weight;
    double cost;

    public Package(String names, String addresss, String citys, String states, int zipcodes, String namer, String addressr, String cityr, String stater, int zipcoder, double weight, double cost) {
        if (weight <= 0 || cost <= 0) {
            throw new ExceptionInInitializerError();
        } else {
            this.weight = weight;
            this.cost = cost;
        }

        this.names = names;
        this.addresss = addresss;
        this.citys = citys;
        this.states = states;
        this.zipcodes = zipcodes;

        this.namer = namer;
        this.addressr = addressr;
        this.cityr = cityr;
        this.stater = stater;
        this.zipcoder = zipcoder;
    }

    public double calculateCost() {
        return this.weight * this.cost;
    }

    public void display() {
        System.out.println("=== STANDART SHIPPING ===");
        System.out.println("Sender: " + this.names + ", " + this.addresss + ", " + this.states + ", " + this.citys + ", " + this.zipcodes);
        System.out.println("Reciever: " + this.namer + ", " + this.addressr + ", " + this.stater + ", " + this.cityr + ", " + this.zipcoder);
        System.out.println("Weight: " + this.weight + " | Cost: " + this.cost);
        System.out.println("Total Cost: " + this.calculateCost());
        System.out.println("");
    }
}
