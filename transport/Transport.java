package transport;

public  abstract class Transport {

    private final String brand;
    private final String model;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private  int maxSpeed;
    private String fuel;
    private double percentageFuel;



    public Transport(String brand,
                     String model,
                     String color,
                     int productionYear,
                     String productionCountry,
                     int maxSpeed,
                     String fuel,
                     double percentageFuel) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.maxSpeed = maxSpeed;
        this.fuel = fuel;
        this.percentageFuel = percentageFuel;
    }

    public abstract void refill();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null|| color.isEmpty()) {
            color = "белый";
        }
        this.color = color;

    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getFuel() {
        return fuel;
    }

    public double getPercentageFuel() {
        return percentageFuel;
    }

    public void setPercentageFuel(double percentageFuel) {
        this.percentageFuel = percentageFuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0 || color.isEmpty()) {
            maxSpeed = 230;
        }
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", fuel='" + fuel + '\'' +
                ", percentageFuel=" + percentageFuel +
                '}';
    }
}
