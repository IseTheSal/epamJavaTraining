package by.learning.day3.task1.entity;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

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
}
