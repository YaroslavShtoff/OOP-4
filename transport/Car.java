package transport;

import java.time.LocalDate;

public class Car extends Transport {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private boolean summerTyres;


    private Key key;
    private insurance insurance;


    @Override
    public void refill() {
        System.out.println("Автомобиль заправляется топливом" + getFuel());
        setPercentageFuel(100);

    }


    public Car(String brand,
               String model,
               String color,
               int maxSpeed,
               int productionYear,
               String productionCountry,
               double engineVolume,
               String bodyType,
               int numberOfSeats,
               String transmission,
               String registrationNumber,
               boolean summerTyres,
               String fuel,
               double percentageFuel){
        super(brand, model, color, productionYear,productionCountry, maxSpeed, fuel,percentageFuel);

        if (brand == null || brand.isEmpty()) {
            brand = "default";
        }
        this.brand = brand;
        if (model == null) {
            model = "default";
        }
        this.model = model;
        setEngineVolume(engineVolume);
        this.engineVolume = engineVolume;
        if (color == null) {
            color = "белый";
        }
        this.color = color;
        if (productionYear < 0) {
            productionYear = 2000;
        }
        this.productionYear = productionYear;

        if (productionCountry == null) {
            productionCountry = "default";
        }
        this.productionCountry = productionCountry;
        if (bodyType == null || bodyType.isEmpty()) {
            bodyType = "SUV";
        }
        this.bodyType = bodyType;
        if (numberOfSeats == 0) {
            numberOfSeats = 5;
        }
        this.numberOfSeats = numberOfSeats;

        if (transmission == null || transmission.isEmpty()) {
            transmission = "АКПП";
        }
        this.transmission = transmission;

        if (registrationNumber == null || registrationNumber.isEmpty()) {
            registrationNumber = "х000хх000";
        }
        this.registrationNumber = registrationNumber;

        setSummerTyres(summerTyres);
        this.summerTyres = summerTyres;
        setKey(null);
        setInsurance(null);


    }

    public Key getKey() {
        return key;

    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key =key;
    }




    public Car.insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Car.insurance insurance) {
        if (insurance == null) {
            insurance = new insurance(null, 9_000, null);
        }
        this.insurance = insurance;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (Double.compare(engineVolume, 0D) == 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {

        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {

        this.registrationNumber = registrationNumber;

    }

    public boolean isSummerTyres() {
        return summerTyres;
    }

    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public void changeSummerTyres() {
        setSummerTyres(!summerTyres);
    }

    public boolean isValidNumber() {
        boolean result = true;
        result = result && registrationNumber.length() == 9;
        result = result && Character.isLetter(registrationNumber.charAt(0))
                && Character.isLetter(registrationNumber.charAt(4))
                && Character.isLetter(registrationNumber.charAt(5));
        result = result && Character.isDigit(registrationNumber.charAt(1))
                && Character.isDigit(registrationNumber.charAt(2))
                && Character.isDigit(registrationNumber.charAt(3))
                && Character.isDigit(registrationNumber.charAt(6))
                && Character.isDigit(registrationNumber.charAt(7))
                && Character.isDigit(registrationNumber.charAt(8));

        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", summerTyres=" + summerTyres +
                ", key=" + key +
                ", insurance=" + insurance +
                '}';
    }

    public void carID() {
        System.out.println(this);

    }

    public static class Key {
        private final boolean remoteRun;
        private final boolean withoutKeyAccess;

        public Key(boolean remoteRun, boolean withoutKeyAccess) {
            this.remoteRun = remoteRun;
            this.withoutKeyAccess = withoutKeyAccess;
        }

        public boolean isRemoteRun() {
            return remoteRun;
        }

        public boolean isWithoutKeyAccess() {
            return withoutKeyAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteRun=" + remoteRun +
                    ", withoutKeyAccess=" + withoutKeyAccess +
                    '}';
        }
    }

    public static class insurance {
        private final LocalDate expireDate;
        private final int price;
        private final String number;

        public insurance(LocalDate expireDate, int price, String number) {
            if (expireDate == null) {
                expireDate = LocalDate.now().plusDays(365);
            }
            this.expireDate = expireDate;
            if (price <= 0) {
                price = 9_000;
            }
            this.price = price;
            if (number == null || number.isEmpty()) {
                number = "AAA111";
            }
            this.number = number;
        }

        public void printCheckExpired() {
            boolean isExpired = expireDate.isAfter(LocalDate.now());
            if (isExpired) {
                System.out.println("Пора менять страховку");
            }
        }

        public void printCheckNumber() {
            boolean correct = number.length() == 9;
            System.out.println("Номер страховки не корректный!");
        }

        public LocalDate getExpireDate() {
            return expireDate;
        }

        public int getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }

        @Override
        public String toString() {
            return "insurance{" +
                    "expireDate=" + expireDate +
                    ", price=" + price +
                    ", number='" + number + '\'' +
                    '}';
        }
    }

}
