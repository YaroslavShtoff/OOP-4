package transport;

public class Track extends Transport implements Competing {


    public Track(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }
    @Override
    public void start() {
        System.out.println("Автомобиль \"" +getBrand() +"\" (\""+ getModel() +"\") начал движение");

    }

    @Override
    public void stop() {
        System.out.println("Автомобиль \"" + getBrand() +"\" (\"" + getModel() + "\") окончил движение");

    }
    @Override
    public void pitStop() {
        System.out.println("Грузовик прошел пит-стоп");
    }

    @Override
    public int bestTimeLap() {
        System.out.println();
        return (int) (Math.random() * 8);

    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random() * 200);

    }


}

