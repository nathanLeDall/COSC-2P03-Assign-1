package Assign1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Clinic {
    public final Patient[] patients = new Patient[15];//the patients read from the text file
    public final WaitQueue wq = new WaitQueue();//wait queue instance
    public void readData() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("patients.txt"));
        String patientData = br.readLine();
        for (int i=0; i<15; i++) {//treats incoming raw data and creates new patient instances which are then stored in the patients array
            patientData = br.readLine();
            String[] patientDataArray = patientData.split("\t",6);
            patientDataArray[5] = patientDataArray[5].replace(":","");
            patients[i] = new Patient(patientDataArray);
            patients[i].setPriority(priorityCalculation(patients[i]));
        }
    }

    private int priorityCalculation(Patient patient){
        int priority=0;
        if (patient.getAge()>=60){priority++;} //adds one to priority if the patient is 60 and above
        if (patient.getOccupation().equals("Nurse") ||
                patient.getOccupation().equals("Care Giver") ||
                patient.getOccupation().equals("Teacher"))
        {//adds one to the priority if the patient is a teacher, a caregiver, or a teacher
            priority++;
        }
        if (patient.getHealthCondition().equals("Primary Immune Deficiency") ||
                patient.getHealthCondition().equals("Cancer") ||
                patient.getHealthCondition().equals("Diabetes") ||
                patient.getHealthCondition().equals("Pregnant") ||
                patient.getHealthCondition().equals("Asthma") ||
                patient.getHealthCondition().equals("Cardiovascular Disease"))
        {// adds one to the priority if the patient meets one of the above conditions
            priority++;
        }
        return priority;
    }

    /**
     * monitors the clinic and adds patients to the queue as they arrive and removes them every 15 minutes
     */
    public void monitor(){
        Clock clock = new Clock(8,59);
        Clock timerCLock = new Clock(clock);
        int counter=0;
        boolean onePatientInQueue = true;
        while(counter<15){
            clock.addOneMinute();
            for (Patient p: patients){//adds a patient to the queue as they arrive according to their time of arrival data from the patients.txt file
                if(p.getTimeOfArrival()==clock.getTime()){
                    wq.insert(p);
                    break;
                }
            }
            if (!onePatientInQueue &&(timerCLock.timeElapsed(clock))>=15) {//removing a patient from the queue every 15 minutes
                try {
                    System.out.println(wq.removeMax()+" the time is: "+clock.getTime());
                } catch (noPatientException E) {
                    System.out.println("no Patients in queue");
                    onePatientInQueue=true;
                }
                timerCLock = new Clock(clock);
                counter++;
            } else if(onePatientInQueue && clock.getTime()>900){
                try{
                    System.out.println(wq.removeMax()+" the time is: "+clock.getTime());
                }catch (noPatientException E){
                    System.out.println("no Patients in queue");
                }
                timerCLock = new Clock(clock);
                counter++;
                onePatientInQueue=false;
            }
        }
    }

    /**
     * main method
     * @param args takes in String[] args
     * @throws IOException throws an IOException
     */
    public static void main(String[] args) throws  IOException{
        Clinic c = new Clinic();
        c.readData();
        c.monitor();
    }
}
