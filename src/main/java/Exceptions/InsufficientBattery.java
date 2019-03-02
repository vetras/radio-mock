package Exceptions;

public class InsufficientBattery extends RuntimeException {
    public InsufficientBattery(String s) {
        super(s);
    }
}
