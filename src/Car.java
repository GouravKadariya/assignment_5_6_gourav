public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private int gas;

    public Car(String brand, String model, int year, String color, double price, int gas) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.gas = gas;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public void honk() {
        System.out.println("Tuut tuut");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Car(brand=%s,model=%s,year=%d,color=%s,price=%f,gas=%d)",brand,model,year,color,price,gas);
    }
}
