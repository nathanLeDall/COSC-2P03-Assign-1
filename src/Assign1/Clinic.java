package Assign1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Clinic {
    private final Patient[] patients = new Patient[15];
    public void readData() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("patients.txt"));
        String patientData = br.readLine();
        for (int i=0; i<15; i++) {
            patientData = br.readLine();
            String[] patientDataArray = patientData.split("\t",6);
            patients[i] = new Patient(patientDataArray);
            patients[i].setPriority(priorityCalculation(patients[i]));
            System.out.println(patients[i].toString());
        }
    }

    private int priorityCalculation(Patient patient){
        int priority=0;
        if (patient.getAge()>=60){priority++;}

        if (patient.getOccupation().equals("Nurse") &&
                patient.getOccupation().equals("Care Giver") &&
                patient.getOccupation().equals("Teacher"))
        {
            priority++;
        }
        if (patient.getHealthCondition().equals(" Primary Immune Deficiency") &&
                patient.getHealthCondition().equals("Cancer") &&
                patient.getHealthCondition().equals("Diabetes") &&
                patient.getHealthCondition().equals("Pregnant") &&
                patient.getHealthCondition().equals("Asthma") &&
                patient.getHealthCondition().equals("Cardiovascular Disease"))
        {
            priority++;
        }

        return priority;
    }

    public static void main(String[] args) throws  IOException{
        Clinic c =new Clinic();
        c.readData();
    }
}
