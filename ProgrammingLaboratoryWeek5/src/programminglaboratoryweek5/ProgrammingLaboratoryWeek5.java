package programminglaboratoryweek5;

public class ProgrammingLaboratoryWeek5 {

// (weight*per ounce) + flat fee = twodaypackage
// (weight*per ounce) + (weight*additionalfee) = overnightpackage
    public static void main(String[] args) {
        Package obj1 = new Package("Selenay", "Kocasinan", "Kayseri", "İç Anadolu", 38500, "Zehra", "Yahyalı", "Kayseri", "İç Anadolu", 38600, 10.5, 2.0);
        obj1.display();

        TwoDaysPackage obj2 = new TwoDaysPackage("Güven", "Beyoğlu", "İstanbul", "Turkey", 34000, "Furkan", "Bahçelievler", "İstanbul", "Turkey", 34180, 15.0, 2.0, 5.0);
        obj2.display();

        OvernightPackage obj3 = new OvernightPackage("Yeter", "İldem", "Kayseri", "Turkey", 38200, "Esra", "Cumhuriyet", "Kayseri", "Turkey", 38000, 8.0, 2.0, 1.5);
        obj3.display();
    }
}
