package by.learning.day3.task1.service;

import by.learning.day3.task1.entity.Diagnosis;
import by.learning.day3.task1.entity.Patient;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PatientServiceTest {

    Patient patient = new Patient("Ivanov", "Ivan", "Ivanovich", "Centralnaya 15", "+3752936789", 123412312);
    PatientService patientService = new PatientService();

    @Test
    public void testReceiveFullName() {
        String actual = patientService.receiveFullName(patient);
        String expected = "Ivan Ivanov Ivanovich";
        Assert.assertEquals(actual, expected);
    }


    @Test
    public void testAddToDiagnoses() {
        boolean condition = patientService.addToDiagnoses(Diagnosis.ANXIETY, patient);
        Assert.assertTrue(condition);
    }

    @Test
    public void testRemoveFromDiagnoses() {
        boolean isAdded = patientService.addToDiagnoses(Diagnosis.ANXIETY, patient);
        boolean condition = patientService.removeFromDiagnoses(Diagnosis.ANXIETY, patient);
        Assert.assertTrue(condition);
    }
}