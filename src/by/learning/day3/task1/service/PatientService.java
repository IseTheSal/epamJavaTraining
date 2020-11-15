package by.learning.day3.task1.service;

import by.learning.day3.task1.entity.Diagnosis;
import by.learning.day3.task1.entity.Patient;

import java.util.List;

public class PatientService {

    public String receiveFullName(Patient patient) {
        StringBuilder result = new StringBuilder();
        if (patient.getFirstName() != null) {
            result.append(patient.getFirstName()).append(" ");
            result.append(patient.getSecondName()).append(" ");
            result.append(patient.getPatronymic());
        } else {
            result.append("This patient haven`t full name");
        }
        return result.toString();
    }


    public boolean removeFromDiagnoses(Diagnosis diagnosis, Patient patient) {
        List<Diagnosis> diagnosesList = patient.getDiagnoses();
        boolean isRemoved = diagnosesList.remove(diagnosis);
        return isRemoved;
    }

    public boolean addToDiagnoses(Diagnosis diagnosis, Patient patient) {
        List<Diagnosis> diagnosesList = patient.getDiagnoses();
        boolean isAdded = false;
        if (!diagnosesList.contains(diagnosis)) {
            diagnosesList.add(diagnosis);
            isAdded = true;
        }
        return isAdded;
    }

}