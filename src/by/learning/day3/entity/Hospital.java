package by.learning.day3.entity;

import by.learning.day3.util.HospitalIdGenerator;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private int id = HospitalIdGenerator.getIdGenerator();
    private String address;
    private List<Patient> patientList = new ArrayList<>();

    public Hospital() {
    }

    public Hospital(String address, List<Patient> patientList) {
        this.address = address;
        if (patientList != null) {
            this.patientList = patientList;
        } else {
            System.out.println("List is empty");
        }
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }

    public int getPatientListSize() {
        return patientList.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hospital hospital = (Hospital) o;

        if (address != null ? !address.equals(hospital.address) : hospital.address != null) return false;
        return patientList != null ? patientList.equals(hospital.patientList) : hospital.patientList == null;
    }

    @Override
    public int hashCode() {
        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + (patientList != null ? patientList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Hospital{");
        sb.append("address='").append(address).append('\'');
        sb.append(", patientList=").append(patientList);
        sb.append('}');
        return sb.toString();
    }
}
