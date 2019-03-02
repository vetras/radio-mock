package utils;

public class IdGenerator {

    private static int id = 0;

    public int newId() {
        id++;
        return id;
    }
}
