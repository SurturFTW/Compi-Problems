class Vehicle {
    protected String brand = "Ford";

    public void honks() { // Typo
        System.out.println("Tuut, tuut!");
    }
}

class q19 extends Vehicle {
    private String modelName = "Mustang";

    public static void main(String[] args) {
        q19 myFastCar = new q19();
        myFastCar.honk();
        System.out.println(myFastCar.Brand + " " + myFastCar.modelname); // typo
    }
}
