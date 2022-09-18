package Assign1;

public class Clock {
    private int hour;
    private int minute;
    public Clock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    public Clock(Clock c){
        hour = c.getHour();
        minute = c.getMinute();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
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

    public int timeElapsed(Clock other){
        int tmp = Math.abs(((other.getHour()*60)+ other.getMinute()) - ((hour*60)+minute));
        System.out.println(tmp);
        return tmp;
    }
}

