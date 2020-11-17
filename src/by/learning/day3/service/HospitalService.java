package by.learning.day3.service;

import by.learning.day3.entity.Diagnosis;
import by.learning.day3.entity.Patient;
import by.learning.day3.service.comparator.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HospitalService {

    public Patient searchPatientById(int id, List<Patient> patientList) {
        Patient patient = null;
        int i = 0;
        do {
            if (patientList.get(i).getId() == id) {
                patient = patientList.get(i);
            }
            i++;
        } while (i < patientList.size());

        return patient;
    }

    public List<Patient> receivePatientByMedicalCardRange(int from, int to, List<Patient> patientList) {
        List<Patient> result = new ArrayList<>();
        for (Patient patient : patientList) {
            int medicalCardId = patient.getMedicalCardId();
            if (medicalCardId != 0 &&
                    medicalCardId >= from && medicalCardId <= to) {
                result.add(patient);
            }
        }
        return result;
    }


    public List<Patient> receivePatientsByDiagnoses(Diagnosis diagnosis, List<Patient> patientList) {
        List<Patient> result = new ArrayList<>();
        for (Patient patient : patientList) {
            Set<Diagnosis> diagnoses = patient.getDiagnoses();
            if (diagnoses.contains(diagnosis)) {
                result.add(patient);
            }
        }
        return result;
    }

    public int receivePatientAmountByDiagnoses(Diagnosis diagnosis, List<Patient> patientList) {
        int counter = 0;
        for (Patient patient : patientList) {
            Set<Diagnosis> diagnosesList = patient.getDiagnoses();
            if (diagnosesList.contains(diagnosis)) {
                counter++;
            }
        }
        return counter;
    }


    public void sortPatientByAddressAsc(List<Patient> patientList) {
        PatientCompareAddressAsc patientComparator = new PatientCompareAddressAsc();
        patientList.sort(patientComparator);
    }

    public void sortPatientByAddressDesc(List<Patient> patientList) {
        PatientCompareAddressDesc patientComparator = new PatientCompareAddressDesc();
        patientList.sort(patientComparator);
    }

    public void sortPatientByPhoneAsc(List<Patient> patientList) {
        PatientComparePhoneAsc patientComparator = new PatientComparePhoneAsc();
        patientList.sort(patientComparator);
    }

    public void sortPatientByPhoneDesc(List<Patient> patientList) {
        PatientComparePhoneDesc patientComparator = new PatientComparePhoneDesc();
        patientList.sort(patientComparator);
    }

    public void sortPatientBySecondNameAsc(List<Patient> patientList) {
        PatientCompareSecondNameAsc patientComparator = new PatientCompareSecondNameAsc();
        patientList.sort(patientComparator);
    }

    public void sortPatientBySecondNameDesc(List<Patient> patientList) {
        PatientCompareSecondNameDesc patientComparator = new PatientCompareSecondNameDesc();
        patientList.sort(patientComparator);
    }


}
