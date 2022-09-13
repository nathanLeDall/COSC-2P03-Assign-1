package Assign1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Clinic {
    private Patient[] patients = new Patient[15];
    public void readData() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("patients.txt"));
        String tmp = br.readLine();
        for (int i=0; i<15; i++) {
            tmp = br.readLine();
            String[] tmp2 = tmp.split("\t",6);
            patients[i] = new Patient(tmp2);
            System.out.println(patients[i].toString());
        }
    }

    public static void main(String[] args) throws  IOException{
        Clinic c =new Clinic();
        c.readData();
    }
}
