package by.learning.day3.service.comparator;

import by.learning.day3.entity.Patient;

import java.util.Comparator;

public class PatientComparePhoneAsc implements Comparator<Patient> {

    @Override
    public int compare(Patient o1, Patient o2) {
        return o1.getPhoneNumber().compareTo(o2.getPhoneNumber());
    }
}
