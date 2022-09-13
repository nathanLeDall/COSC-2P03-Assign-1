package Assign1;

import java.sql.Time;
import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class Patient {
    private String name;
    private int age;
    private String gender;
    private String occupation;
    private String healthCondition;
    private Clock timeOfArrival;

    public Patient(String name, int age, String gender, String occupation, String healthCondition, Clock timeOfArrival){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.healthCondition = healthCondition;
        this.timeOfArrival = timeOfArrival;
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

    public Clock getTimeOfArrival() {
        return timeOfArrival;
    }

    public void setTimeOfArrival(Clock timeOfArrival) {
        this.timeOfArrival = timeOfArrival;
    }

    public static void main(String[] args) {

    }
}
