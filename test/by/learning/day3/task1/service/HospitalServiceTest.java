package by.learning.day3.task1.service;

import by.learning.day3.task1.entity.Diagnosis;
import by.learning.day3.task1.entity.Hospital;
import by.learning.day3.task1.entity.Patient;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HospitalServiceTest {

    Patient patient1 = new Patient("Ivanov", "Ivan", "Ivanovich", "Centralnaya 15", "+3752936789", 12347);
    Patient patient2 = new Patient("Michailov", "Michail", "Michailovich", "Centralnaya 14", "+3752956789", 12345);
    Patient patient3 = new Patient("Igorev", "Igor", "Igorevich", "Centralnaya 16", "+3752946789", 12346, Diagnosis.ANXIETY);

    HospitalService hospitalService = new HospitalService();

    @Test
    public void testSortPatientByAddress() {
        List<Patient> patients = new ArrayList<>();
        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);

        Hospital hospital = new Hospital("Novay 14", patients);
        List<Patient> patientList = hospital.getPatientList();

        hospitalService.sortPatientByAddressDesc(patientList);
        hospitalService.sortPatientByAddressAsc(patientList);

        String actual = hospital.getPatientList().get(0).getAddress();
        String expected = patient2.getAddress();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSortPatientByPhone() {
        List<Patient> patients = new ArrayList<>();
        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);

        Hospital hospital = new Hospital("Novay 14", patients);
        List<Patient> patientList = hospital.getPatientList();

        hospitalService.sortPatientByPhoneAsc(patientList);
        hospitalService.sortPatientByPhoneDesc(patientList);

        String actual = hospital.getPatientList().get(0).getSecondName();
        String expected = patient2.getSecondName();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSearchPatientById() {

        List<Patient> patients = new ArrayList<>();
        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);

        int id = 1;
        Patient patient = hospitalService.searchPatientById(id, patients);

        int actual = patient.getId();
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSearchPatientByIdIsNull() {
        List<Patient> patients = new ArrayList<>();
        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);

        int id = 4;
        Patient patient = hospitalService.searchPatientById(id, patients);

        Assert.assertNull(patient);
    }

    @Test
    public void testReceivePatientByMedicalCardRange() {
        List<Patient> patients = new ArrayList<>();
        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);

        int from = 12345;
        int to = 12346;
        List<Patient> actual = hospitalService.receivePatientByMedicalCardRange(from, to, patients);

        List<Patient> expected = new ArrayList<>();
        expected.add(patient2);
        expected.add(patient3);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testReceivePatientByMedicalCardRangeFalse() {
        List<Patient> patients = new ArrayList<>();
        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);

        int from = 12345;
        int to = 12346;
        List<Patient> actual = hospitalService.receivePatientByMedicalCardRange(from, to, patients);

        List<Patient> expected = new ArrayList<>();
        expected.add(patient1);
        expected.add(patient3);
        Assert.assertNotEquals(actual, expected);
    }

    @Test
    public void testReceivePatientsByDiagnoses() {
        List<Patient> patients = new ArrayList<>();
        patients.add(patient1);
        patients.add(patient3);

        List<Patient> actual = hospitalService.receivePatientsByDiagnoses(Diagnosis.ANXIETY, patients);

        List<Patient> expected = new ArrayList<>();
        expected.add(patient3);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testReceivePatientAmountByDiagnoses() {
        List<Patient> patients = new ArrayList<>();
        patients.add(patient1);
        patients.add(patient3);

        int actual = hospitalService.receivePatientAmountByDiagnoses(Diagnosis.ANXIETY, patients);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testSortPatientBySecondName() {
        List<Patient> patients = new ArrayList<>();
        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);


        hospitalService.sortPatientByPhoneAsc(patients);
        hospitalService.sortPatientByPhoneDesc(patients);

        String actual = patients.get(0).getSecondName();
        String expected = patient2.getSecondName();

        Assert.assertEquals(actual, expected);
    }
}