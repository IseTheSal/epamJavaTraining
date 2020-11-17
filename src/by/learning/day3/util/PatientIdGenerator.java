package by.learning.day3.util;

public class PatientIdGenerator {

    private static int currentId = 0;

    public static int getCurrentId() {
        return currentId++;
    }

    private static int currentMedicalCardId = 0;

    public static int getCurrentMedicalCardId() {
        return currentMedicalCardId++;
    }
}
