package by.learning.day3.service;

import by.learning.day3.entity.Diagnosis;
import by.learning.day3.entity.Hospital;
import by.learning.day3.entity.Patient;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.ArrayList;
import java.util.List;

public class HospitalServiceTest {


    HospitalService hospitalService = new HospitalService();
    List<Patient> patientList;

    @BeforeClass()
    public void fillPatientList() {
        Patient patient1 = new Patient("Ivanov", "Ivan", "Ivanovich", "Centralnaya 15", "1");
        Patient patient2 = new Patient("Michailov", "Michail", "Michailovich", "Centralnaya 14", "2");
        Patient patient3 = new Patient("Igorev", "Igor", "Igorevich", "Centralnaya 16", "3", Diagnosis.ANXIETY);
        patientList = new ArrayList<>();
        patientList.add(patient1);
        patientList.add(patient2);
        patientList.add(patient3);
    }


    Hospital hospital;

    @BeforeMethod(groups = {"hospital"})
    public void createHospital() {
        List<Patient> patients = new ArrayList<>(patientList);
        hospital = new Hospital("Novay 14", patients);
    }


    @Test(groups = {"hospital", "arrayList"})
    public void testSortPatientByAddressAsk() {
        List<Patient> patientLocalList = hospital.getPatientList();

        hospitalService.sortPatientByAddressAsc(patientLocalList);

        List<Patient> actual = hospital.getPatientList();
        List<Patient> expected = new ArrayList<>();
        expected.add(patientList.get(1));
        expected.add(patientList.get(0));
        expected.add(patientList.get(2));
        Assert.assertEquals(actual, expected);
    }

    @Test(groups = {"hospital", "arrayList"})
    public void testSortPatientByAddressDesc() {
        List<Patient> patientLocalList = hospital.getPatientList();

        hospitalService.sortPatientByAddressDesc(patientLocalList);

        List<Patient> actual = hospital.getPatientList();
        List<Patient> expected = new ArrayList<>();
        expected.add(patientList.get(2));
        expected.add(patientList.get(0));
        expected.add(patientList.get(1));

        Assert.assertEquals(actual, expected);
    }

    @Test(groups = {"hospital", "arrayList"})
    public void testSortPatientByPhoneDesc() {
        List<Patient> patientLocalList = hospital.getPatientList();

        hospitalService.sortPatientByPhoneDesc(patientLocalList);

        List<Patient> actual = hospital.getPatientList();
        List<Patient> expected = new ArrayList<>();
        expected.add(patientList.get(2));
        expected.add(patientList.get(1));
        expected.add(patientList.get(0));

        Assert.assertEquals(actual, expected);
    }

    @Test(groups = {"hospital", "arrayList"})
    public void testSortPatientByPhoneAsc() {
        List<Patient> patientLocalList = hospital.getPatientList();

        hospitalService.sortPatientByPhoneAsc(patientLocalList);

        List<Patient> actual = hospital.getPatientList();
        List<Patient> expected = new ArrayList<>();
        expected.add(this.patientList.get(0));
        expected.add(this.patientList.get(1));
        expected.add(this.patientList.get(2));

        Assert.assertEquals(actual, expected);
    }

    @Test(groups = {"arrayList"})
    public void testSearchPatientById() {
        int id = 1;
        Patient patient = hospitalService.searchPatientById(id, patientList);

        int actual = patient.getId();
        int expected = 1;
        Assert.assertEquals(actual, expected);
    }

    @Test(groups = {"arrayList"})
    public void testSearchPatientByIdIsNull() {
        int id = 4;
        Patient patient = hospitalService.searchPatientById(id, patientList);

        Assert.assertNull(patient);
    }

    @Test(groups = {"hospital", "arrayList"})
    public void testReceivePatientByMedicalCardRange() {
        int from = 1;
        int to = 2;
        List<Patient> actual = hospitalService.receivePatientByMedicalCardRange(from, to, patientList);

        List<Patient> expected = new ArrayList<>();
        expected.add(patientList.get(1));
        expected.add(patientList.get(2));

        Assert.assertEquals(actual, expected);
    }

    @Test(groups = "arrayList")
    public void testReceivePatientByMedicalCardRangeFalse() {
        int from = 1;
        int to = 2;
        List<Patient> actual = hospitalService.receivePatientByMedicalCardRange(from, to, patientList);

        List<Patient> expected = new ArrayList<>();
        expected.add(patientList.get(0));
        expected.add(patientList.get(1));

        Assert.assertNotEquals(actual, expected);
    }

    @Test(groups = "arrayList")
    public void testReceivePatientsByDiagnoses() {
        List<Patient> actual = hospitalService.receivePatientsByDiagnoses(Diagnosis.ANXIETY, patientList);
        List<Patient> expected = new ArrayList<>();
        expected.add(patientList.get(2));

        Assert.assertEquals(actual, expected);
    }

    @Test(groups = "arrayList")
    public void testReceivePatientAmountByDiagnoses() {
        int actual = hospitalService.receivePatientAmountByDiagnoses(Diagnosis.ANXIETY, patientList);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test(groups = {"hospital"})
    public void testSortPatientBySecondNameDesc() {
        List<Patient> patientLocalList = hospital.getPatientList();

        hospitalService.sortPatientBySecondNameDesc(patientLocalList);

        List<Patient> actual = hospital.getPatientList();

        List<Patient> expected = new ArrayList<>();
        expected.add(patientList.get(1));
        expected.add(patientList.get(0));
        expected.add(patientList.get(2));

        Assert.assertEquals(actual, expected);
    }

    @Test(groups = {"hospital"})
    public void testSortPatientBySecondNameAsc() {
        List<Patient> patientLocalList = hospital.getPatientList();

        hospitalService.sortPatientBySecondNameAsc(patientLocalList);

        List<Patient> actual = hospital.getPatientList();

        List<Patient> expected = new ArrayList<>();
        expected.add(patientList.get(2));
        expected.add(patientList.get(0));
        expected.add(patientList.get(1));

        Assert.assertEquals(actual, expected);
    }

    @AfterMethod(groups = {"hospital"})
    public void setHospitalNull() {
        hospital = null;
    }

    @AfterClass()
    public void setPatientListNull() {
        patientList = null;
    }
}