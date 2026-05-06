class Vehicle{
    protected String model;
    protected  double rentalPrieperday;

    public Vehicle(String model ,double rentalPrieperday) {
        this.rentalPrieperday = rentalPrieperday;
        this.model = model;
    }
    public double calculateRentalCost(int days){
        return this.rentalPrieperday * days;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPrieperday() {
        return rentalPrieperday;
    }
}



class Car extends Vehicle{
    protected int seatnumber;

    public Car(String model, double rentalPrieperday, int seatnumber) {
        super(model, rentalPrieperday);
        this.seatnumber = seatnumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return super.calculateRentalCost(days);
    }

    public void DisplaycarDetails(){
        System.out.println("Car Model : " + getModel());
        System.out.println("seat number : " + this.seatnumber);
        System.out.println("Rental pra day : $" + getRentalPrieperday());
    }
}


class MotorCycle extends Vehicle{
    protected int engineCapacity;

    public MotorCycle(String model, double rentalPrieperday, int engineCapacity) {
        super(model, rentalPrieperday);
        this.engineCapacity = engineCapacity;
    }

    public void DisplayMotorCycleDetails(){
        System.out.println("MotorCycle Model : " + getModel());
        System.out.println("Engine capacity  : CC" + this.engineCapacity);
        System.out.println("Rental pra day : $" + getRentalPrieperday());
    }

}


class Q1{
    public static void main(String[] args) {
        Car car = new Car("Toyota" , 4, 50);
        MotorCycle bike1 = new MotorCycle("Yamaha" , 100 , 1000);

        double piceforcar = car.calculateRentalCost(100);
        double piceformotorcyle = bike1.calculateRentalCost(160);

        car.DisplaycarDetails();
        System.out.println("Price for Car : $" + piceforcar);
        System.out.println();
        bike1.DisplayMotorCycleDetails();
        System.out.println("Price for Motorcycle : $" + piceformotorcyle);
    }
}