package Assign1;

public class Patient {
    private String name;                       //name of the patient
    private int age;                            //age of the patient
    private String gender;                   //gender of the patient
    private String occupation;          // occupation of the patient
    private String healthCondition;//health condition of the patient
    private int timeOfArrival;      //time of arrival of the patient
    private int priority;                  //priority of the patient

    /**
     * constructor creates and instance but does not initialize variables
     */
    public Patient(){

    }

    /**
     * constructor initializes variables to passed in values
     * @param name name of the patient
     * @param age age of the patient
     * @param gender gender of the patient
     * @param occupation occupation of the patient
     * @param healthCondition health condition of the patient
     * @param timeOfArrival time of arrival of the patient
     * @param priority priority of the patient
     */
    public Patient(String name, int age, String gender, String occupation, String healthCondition, String timeOfArrival, int priority){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.healthCondition = healthCondition;
        this.timeOfArrival = Integer.parseInt(timeOfArrival);
        this.priority = priority;
    }

    /**
     * constructor initializes variables to passed in values except priority which is set to 0 by default
     * @param name name of the patient
     * @param age age of the patient
     * @param gender gender of the patient
     * @param occupation occupation of the patient
     * @param healthCondition health condition of the patient
     * @param timeOfArrival time of arrival of the patient
     */
    public Patient(String name, int age, String gender, String occupation, String healthCondition, String timeOfArrival){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.healthCondition = healthCondition;
        this.timeOfArrival = Integer.parseInt(timeOfArrival);
        priority = 0;
    }

    /**
     * constructor initializes variables to passed in array and integer
     * @param info patients info in a String array
     * @param priority priority of the patient
     */
    public Patient(String[] info, int priority){
        name = info[0];
        gender = info[1];
        age = Integer.parseInt(info[2]);
        occupation = info[3];
        healthCondition = info[4];
        timeOfArrival = Integer.parseInt(info[5]);
        this.priority = priority;
    }

    /**
     * constructor initializes variables to passed in array and assumes 0 for priority
     * @param info patients info in a String array
     */
    public Patient(String[] info){
        name = info[0];
        gender = info[1];
        age = Integer.parseInt(info[2]);
        occupation = info[3];
        healthCondition = info[4];
        timeOfArrival = Integer.parseInt(info[5]);
        priority = 0;
    }

    /**
     * returns the name of the patient
     * @return name of the patient
     */
    public String getName() {
        return name;
    }

    /**
     * set the name of the patient
     * @param name new name of the patient
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get the age of the patient
     * @return age of the patient
     */
    public int getAge() {
        return age;
    }

    /**
     * set the age of the patient
     * @param age new age of the patient
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * get the gender of the patient
     * @return the gender of the patient
     */
    public String getGender() {
        return gender;
    }

    /**
     * set the gender of hte patient
     * @param gender new gender of the patient
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * get the occupation of the patient
     * @return occupation of the patient
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * set the occupation of the patient
     * @param occupation new occupation of the patient
     */
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    /**
     * get the health condition of the patient
     * @return the health condition of the patient
     */
    public String getHealthCondition() {
        return healthCondition;
    }

    /**
     * set the health condition of the patient
     * @param healthCondition new health condition of the patient
     */
    public void setHealthCondition(String healthCondition) {
        this.healthCondition = healthCondition;
    }

    /**
     * get the time of arrival of the patient
     * @return the time of arrival of the patient
     */
    public int getTimeOfArrival() {
        return timeOfArrival;
    }

    /**
     * set the time of arrival of the patient
     * @param timeOfArrival new time of arrival of the patient
     */
    public void setTimeOfArrival(String timeOfArrival) {
        this.timeOfArrival = Integer.parseInt(timeOfArrival);
    }

    /**
     * set the priority of the patient
     * @param priority new priority of the patient
     */
    public void setPriority(int priority){
        this.priority = priority;
    }

    /**
     * get the priority of the patient
     * @return the priority of the patient
     */
    public int getPriority(){return priority;}

    /**
     * adds a number to the current priority
     * @param num the number to be added to the priority
     */
    public void addToPriority(int num){priority+=num;}

    /**
     * remove a number from the priority
     * @param num the number to be removed from the priority
     */
    public void removeFromPriority(int num){priority-=num;}

    /**
     * returns all the class variables in a string
     * @return all the variables of the class
     */
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
}
