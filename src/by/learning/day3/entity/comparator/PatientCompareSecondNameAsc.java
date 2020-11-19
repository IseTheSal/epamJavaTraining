package by.learning.day3.entity.comparator;

import by.learning.day3.entity.Patient;

import java.util.Comparator;

public class PatientCompareSecondNameAsc implements Comparator<Patient> {

    @Override
    public int compare(Patient o1, Patient o2) {
        return o1.getSecondName().compareTo(o2.getSecondName());
    }
}
