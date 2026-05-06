class Vehicle{
    protected String brand;
    protected  double price;

    public Vehicle(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void displayDetails(){
        System.out.println("Vehicle Brand is : " + getBrand());
        System.out.println("Vehicle Price is :($)" + getPrice());
    }
}


class ElectricVehicle extends Vehicle{
    protected int batteryCapacity;

    public ElectricVehicle(String brand, double price, int batteryCapacity) {
        super(brand, price);
        this.batteryCapacity = batteryCapacity;
    }
    public void displayEVDetails(){
        super.displayDetails();
        System.out.println("Battery Capacity : " + batteryCapacity + " Ahw");
    }
}

class VehicleApp{
    public static void main(String[] args) {
        ElectricVehicle ev1 = new ElectricVehicle("Tesla", 4500000.00, 75);
        ev1.displayEVDetails();
    }
}