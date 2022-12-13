package transport;

public class Bus extends Transport {

    private int cost;
    private int time;
    private String departureStation;
    private String arrivalStation;

    @Override
    public void refill() {
        System.out.println("Автобус заправляется топливом" + getFuel());
        setPercentageFuel(100);
    }

    public Bus(String brand,
               String model,
               String color,
               int productionYear,
               String productionCountry,
               int maxSpeed, String fuel,
               int cost,
               int time,
               String departureStation,
               String arrivalStation,
               double percentageFuel) {
        super(brand, model, color, productionYear, productionCountry, maxSpeed, fuel, percentageFuel);
        this.cost = cost;
        this.time = time;
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDepartureStation() {
        return departureStation;
    }

    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    public String getArrivalStation() {
        return arrivalStation;
    }

    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }



    @Override
    public String toString() {
        return "Bus{" +
                "cost=" + cost +
                ", time=" + time +
                ", departureStation='" + departureStation + '\'' +
                ", arrivalStation='" + arrivalStation + '\'' +
                "} " + super.toString();
    }
}
