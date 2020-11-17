package by.learning.day3.writer;

import by.learning.day3.entity.Diagnosis;
import by.learning.day3.entity.Patient;

import java.util.Set;
import java.util.StringJoiner;

public class PatientWriter {

    public void writePatientInfo(Patient patient) {
        System.out.println("First name - " + patient.getFirstName() +
                "\nSecond name - " + patient.getSecondName() +
                "\nMedical card - " + patient.getId() +
                "\nAddress - " + patient.getAddress() +
                "\nPhone number - " + patient.getPhoneNumber());
    }

    public void writePatientDiagnoses(Patient patient) {
        StringJoiner diagnoses = new StringJoiner(" ");
        Set<Diagnosis> diagnosesList = patient.getDiagnoses();
        for (Diagnosis diagnosis : diagnosesList) {
            diagnoses.add(diagnosis.name());
        }
        System.out.println("First name - " + patient.getFirstName() +
                "\nSecond name - " + patient.getSecondName() +
                "\nPhone number - " + patient.getPhoneNumber() +
                "\nDiagnoses - " + diagnoses);
    }
}
