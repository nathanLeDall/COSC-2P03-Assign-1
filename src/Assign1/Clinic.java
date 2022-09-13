package Assign1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Clinic {
    private Patient[] patients;
    public void readData() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("patients.txt"));
        //br.readLine();
        while(true){
            br.
            String tmp = br.readLine();
            if (tmp==null){
                break;
            }
            System.out.println(tmp);
        }
    }

    public static void main(String[] args) throws  IOException{
        Clinic c =new Clinic();
        c.readData();
    }
}
