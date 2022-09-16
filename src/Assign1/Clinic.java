package Assign1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Clinic {
    public final Patient[] patients = new Patient[15];
    public final WaitQueue wq = new WaitQueue();
    public void readData() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("patients.txt"));
        String patientData = br.readLine();
        for (int i=0; i<15; i++) {
            patientData = br.readLine();
            String[] patientDataArray = patientData.split("\t",6);
            patientDataArray[5] = patientDataArray[5].replace(":","");
            patients[i] = new Patient(patientDataArray);
            patients[i].setPriority(priorityCalculation(patients[i]));
            System.out.println(patients[i].toString());
        }
    }

    public void print(String[] tmp){
        for (String tmp2: tmp){
            System.out.print(tmp2);
        }
        System.out.println();
    }

    private int priorityCalculation(Patient patient){
        int priority=0;
        if (patient.getAge()>=60){priority++;}
        if (patient.getOccupation().equals("Nurse") ||
                patient.getOccupation().equals("Care Giver") ||
                patient.getOccupation().equals("Teacher"))
        {
            priority++;
        }
        if (patient.getHealthCondition().equals(" Primary Immune Deficiency") ||
                patient.getHealthCondition().equals("Cancer") ||
                patient.getHealthCondition().equals("Diabetes") ||
                patient.getHealthCondition().equals("Pregnant") ||
                patient.getHealthCondition().equals("Asthma") ||
                patient.getHealthCondition().equals("Cardiovascular Disease"))
        {
            priority++;
        }
        return priority;
    }

    public static void main(String[] args) throws  IOException{
        Clinic c = new Clinic();
        c.readData();
        for (Patient p: c.patients){
            c.wq.insert(p);
        }
        System.out.println();
        System.out.println();
        System.out.println(c.wq);
    }
}
