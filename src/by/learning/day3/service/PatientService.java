package by.learning.day3.service;

import by.learning.day3.entity.Diagnosis;
import by.learning.day3.entity.Patient;

import java.util.Set;
import java.util.StringJoiner;

public class PatientService {

    public String receiveFullName(Patient patient) {
        StringJoiner result = new StringJoiner(" ");
        if (patient.getFirstName() != null) {
            result.add(patient.getFirstName());
            result.add(patient.getSecondName());
            result.add(patient.getPatronymic());
        } else {
            result.add("This patient haven`t full name");
        }
        return result.toString();
    }


    public boolean removeFromDiagnoses(Diagnosis diagnosis, Patient patient) {
        Set<Diagnosis> diagnosesList = patient.getDiagnoses();
        boolean isRemoved = diagnosesList.remove(diagnosis);
        return isRemoved;
    }

    public boolean addToDiagnoses(Diagnosis diagnosis, Patient patient) {
        Set<Diagnosis> diagnosesList = patient.getDiagnoses();
        boolean isAdded = diagnosesList.add(diagnosis);
        return isAdded;
    }

}

