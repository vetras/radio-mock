package utils;

public class BatteryLevel {
    private int charge = 0;

    public void charge() {
        charge = 100;
    }

    public int checkCharge() {
        return charge;
    }

    public void spend(int amount) {
        charge = charge - amount;
        if (charge < 0) {
            charge = 0;
        }
    }
}
