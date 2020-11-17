package by.learning.day3.writer;

import by.learning.day3.entity.Hospital;
import by.learning.day3.entity.Patient;

import java.util.List;

public class HospitalWriter {

    public void writeHospitalInfo(Hospital hospital) {
        System.out.println("Address - " + hospital.getAddress() +
                "\nAmount of patient - " + hospital.getPatientListSize());

    }

    public void writeFullHospitalInfo(Hospital hospital) {
        System.out.println("Address - " + hospital.getAddress());
        List<Patient> patientList = hospital.getPatientList();
        PatientWriter patientWriter = new PatientWriter();
        for (Patient patient : patientList) {
            System.out.println("---------------");
            patientWriter.writePatientInfo(patient);
            System.out.println("---------------");
        }
    }

}
