class Car {
    String brand;
    int speed;

    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void displayInfo() {
        System.out.println("Brand: " + brand + ", Speed: " + speed + " km/h");
    }

    void fuelConsumption() {
        System.out.println("Unknown fuel consumption");
    }
}

class Sedan extends Car {
    Sedan(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void fuelConsumption() {
        System.out.println("Sedan consumption: 7L/100km");
    }
}

class Truck extends Car {
    Truck(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void fuelConsumption() {
        System.out.println("Truck consumption: 20L/100km");
    }
}

class SUV extends Car {
    SUV(String brand, int speed) {
        super(brand, speed);
    }

    @Override
    void fuelConsumption() {
        System.out.println("SUV consumption: 10L/100km");
    }
}
