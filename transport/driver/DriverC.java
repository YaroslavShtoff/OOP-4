package transport.driver;

import transport.Track;

public class DriverC extends Driver <Track> {
    public DriverC(String name, boolean hasDrivingLicense, int experience) {
        super(name, hasDrivingLicense, experience);
    }

    @Override
    public void startMove(Track transport) {
        transport.start();
    }

    @Override
    public void stopMove(Track transport) {
        transport.stop();
    }

    @Override
    public void refill(Track transport) {
        System.out.println("Водитель" +getName()+"запрвляет грузовик " +transport.getBrand());
    }

}
