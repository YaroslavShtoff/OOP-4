package transport;

public class Bus extends Transport implements Competing {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Автобус \"" +getBrand() +"\" (\""+ getModel() +"\") начал движение");

    }

    @Override
    public void stop() {
        System.out.println("Автобус \"" + getBrand() +"\" (\"" + getModel() + "\") окончил движение");

    }

    @Override
    public void pitStop() {
        System.out.println("Автобус прошел пит-стоп");
    }

    @Override
    public int bestTimeLap() {
        return (int) (Math.random() * 10);

    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 160);

    }
}
