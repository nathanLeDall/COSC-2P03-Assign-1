package Assign1;

public class Patient {
    private String name;
    private int age;
    private String gender;
    private String occupation;
    private String healthCondition;
    private int timeOfArrival;
    private int priority;

    public Patient(){

    }

    public Patient(String name, int age, String gender, String occupation, String healthCondition, String timeOfArrival, int priority){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.healthCondition = healthCondition;
        this.timeOfArrival = Integer.parseInt(timeOfArrival);
        this.priority = priority;
    }
    public Patient(String name, int age, String gender, String occupation, String healthCondition, String timeOfArrival){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.healthCondition = healthCondition;
        this.timeOfArrival = Integer.parseInt(timeOfArrival);
        priority = 0;
    }

    public Patient(String[] info, int priority){
        name = info[0];
        gender = info[1];
        age = Integer.parseInt(info[2]);
        occupation = info[3];
        healthCondition = info[4];
        timeOfArrival = Integer.parseInt(info[5]);
        this.priority = priority;
    }
    public Patient(String[] info){
        name = info[0];
        gender = info[1];
        age = Integer.parseInt(info[2]);
        occupation = info[3];
        healthCondition = info[4];
        timeOfArrival = Integer.parseInt(info[5]);
        priority = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }

    public int getTimeOfArrival() {
        return timeOfArrival;
    }

    public void setTimeOfArrival(String timeOfArrival) {
        this.timeOfArrival = Integer.parseInt(timeOfArrival);
    }

    public void setPriority(int priority){
        this.priority = priority;
    }

    public int getPriority(){return priority;}

    public void addToPriority(int num){priority+=num;}

    public void removeFromPriority(int num){priority-=num;}

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", occupation='" + occupation + '\'' +
                ", healthCondition='" + healthCondition + '\'' +
                ", timeOfArrival='" + timeOfArrival + '\'' +
                ", priority='" + priority + '\'' +
                '}';
    }

    public static void main(String[] args) {

    }
}
