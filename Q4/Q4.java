import java.util.Scanner;

class TemperatureCoverter{
    protected double temperature;

    public TemperatureCoverter() {
        this.temperature = 0;
    }
    public TemperatureCoverter(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public double celsiusToFahrenheit(double celsius){
        return (9.0 / 5.0) * celsius + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }
}

class Q4{
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        System.out.print("Enter the temperature in celsius : ");
        double celsius = io.nextDouble();

        System.out.print("Enter the temperature in farenheit :");
        double farenheit = io.nextDouble();

        TemperatureCoverter t1 = new TemperatureCoverter();
        double Fout =t1.celsiusToFahrenheit(celsius);
        double Cout =t1.fahrenheitToCelsius(farenheit);
        System.out.println();
        System.out.println(celsius+ " Celsius is equal to " + Fout + " Fahrenheit");
        System.out.println(farenheit+ " Celsius is equal to " + Cout + " Fahrenheit");

    }
}