package by.learning.day3.util;

public class HospitalIdGenerator {

    private static int idGenerator = 0;

    public static int getIdGenerator() {
        return idGenerator++;
    }
}
