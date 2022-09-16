package Assign1;

public class Clock {
    public int hour;
    public int minute;
    public Clock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }
    public void addOneMinute(){
        if (minute==59){
            minute=0;
            addOneHour();
            return;
        }
        minute++;
    }
    public void addOneHour(){
        if (hour==23){
            hour = 0;
            return;
        }
        hour++;
    }
    public void decrementOneMinute(){
        if (minute==0){
            minute = 59;
            decrementOneHour();
            return;
        }
        minute--;
    }
    public void decrementOneHour(){
        if (hour==0){
            hour = 59;
            return;
        }
        hour--;
    }
    public int getTime(){
        String timeTmp = String.valueOf(hour)+String.valueOf(minute);
        return Integer.parseInt(timeTmp);
    }
}

