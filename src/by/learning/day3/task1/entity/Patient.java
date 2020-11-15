package by.learning.day3.task1.entity;

import java.util.ArrayList;
import java.util.List;

public class Patient {

    private static int idValue = 0;

    private int id;
    private String secondName;
    private String firstName;
    private String patronymic;
    private String address;
    private String phoneNumber;
    private int medicalCardId;
    private List<Diagnosis> diagnoses = new ArrayList<>();


    public Patient() {
        this.id = idValue;
        idValue++;
    }

    public Patient(Diagnosis diagnosis) {
        this.id = idValue;
        idValue++;
        this.diagnoses.add(diagnosis);
    }

    public Patient(List<Diagnosis> diagnosis) {
        this.id = idValue;
        idValue++;
        this.diagnoses = diagnosis;
    }


    public Patient(String secondName, String firstName, String patronymic, String address, String phoneNumber, int medicalCardId, List<Diagnosis> diagnoses) {
        this.id = idValue;
        idValue++;
        this.secondName = secondName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medicalCardId = medicalCardId;
        this.diagnoses = diagnoses;
    }

    public Patient(String secondName, String firstName, String patronymic, String address, String phoneNumber, int medicalCardId) {
        this.id = idValue;
        idValue++;
        this.secondName = secondName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medicalCardId = medicalCardId;
    }

    public Patient(String secondName, String firstName, String patronymic, String address, String phoneNumber, int medicalCardId, Diagnosis diagnosis) {
        this.id = idValue;
        idValue++;
        this.secondName = secondName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.medicalCardId = medicalCardId;
        this.diagnoses.add(diagnosis);
    }

    public int getId() {
        return id;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMedicalCardId() {
        return medicalCardId;
    }

    public void setMedicalCardId(int medicalCardId) {
        this.medicalCardId = medicalCardId;
    }

    public List<Diagnosis> getDiagnoses() {
        return diagnoses;
    }

    public void setDiagnoses(List<Diagnosis> diagnoses) {
        this.diagnoses = diagnoses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Patient patient = (Patient) o;

        if (id != patient.id) return false;
        if (medicalCardId != patient.medicalCardId) return false;
        if (secondName != null ? !secondName.equals(patient.secondName) : patient.secondName != null) return false;
        if (firstName != null ? !firstName.equals(patient.firstName) : patient.firstName != null) return false;
        if (patronymic != null ? !patronymic.equals(patient.patronymic) : patient.patronymic != null) return false;
        if (address != null ? !address.equals(patient.address) : patient.address != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(patient.phoneNumber) : patient.phoneNumber != null) return false;
        return diagnoses != null ? diagnoses.equals(patient.diagnoses) : patient.diagnoses == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (patronymic != null ? patronymic.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + medicalCardId;
        result = 31 * result + (diagnoses != null ? diagnoses.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Patient{");
        sb.append("id=").append(id);
        sb.append(", secondName='").append(secondName).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", patronymic='").append(patronymic).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", medicalCardId='").append(medicalCardId).append('\'');
        sb.append('}');
        return sb.toString();
    }


}
