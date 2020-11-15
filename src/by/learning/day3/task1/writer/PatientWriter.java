package by.learning.day3.task1.writer;

import by.learning.day3.task1.entity.Diagnosis;
import by.learning.day3.task1.entity.Patient;

import java.util.List;

public class PatientWriter {

    public void writePatientInfo(Patient patient) {
        System.out.println("First name - " + patient.getFirstName() +
                "\nSecond name - " + patient.getSecondName() +
                "\nMedical card - " + patient.getId() +
                "\nAddress - " + patient.getAddress() +
                "\nPhone number - " + patient.getPhoneNumber());
    }

    public void writePatientDiagnoses(Patient patient) {
        StringBuilder diagnoses = new StringBuilder();
        List<Diagnosis> diagnosesList = patient.getDiagnoses();
        for (Diagnosis diagnosis : diagnosesList) {
            diagnoses.append(diagnosis).append("\n");
        }
        System.out.println("First name - " + patient.getFirstName() +
                "\nSecond name - " + patient.getSecondName() +
                "\nPhone number - " + patient.getPhoneNumber() +
                "\nDiagnoses - " + diagnoses);
    }
}
