package Assign1;

public class Clock {
    private int hour;//hours
    private int minute;//minutes

    /**
     * constructor initializes hour and minute based on the values provided
     * @param hour the hour the clock should start at;
     * @param minute the minute the clock should start at.
     */
    public Clock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    /**
     * constructor initializes hour and minute based on the values from the provided clock class
     * @param c
     */
    public Clock(Clock c){
        hour = c.getHour();
        minute = c.getMinute();
    }

    /**
     * returns the current hour the clock is set to
     * @return int hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * sets the hour to a specefied value
     * @param hour the value houe should be set to
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * returns the current minute the clock is set to
     * @return int minute
     */
    public int getMinute() {
        return minute;
    }

    /**
     * sets a new minute for the clock
     * @param minute int minute
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }

    /**
     * increment the clock by a minute
     */
    public void addOneMinute(){
        if (minute==59){
            minute=0;
            addOneHour();
            return;
        }
        minute++;
    }

    /**
     * increment the clock by an hour
     */
    public void addOneHour(){
        if (hour==23){
            hour = 0;
            return;
        }
        hour++;
    }

    /**
     * decrement the clock by a minute
     */
    public void decrementOneMinute(){
        if (minute==0){
            minute = 59;
            decrementOneHour();
            return;
        }
        minute--;
    }

    /**
     * decrement the clock by an hour
     */
    public void decrementOneHour(){
        if (hour==0){
            hour = 59;
            return;
        }
        hour--;
    }

    /**
     * get the current time in military(european or 24h) format
     * @return int current time the clock is set to
     */
    public int getTime(){
        if (minute<10){
            String time = hour +"0"+String.valueOf(minute);
            return Integer.parseInt(time);
        }
        String time = hour +String.valueOf(minute);
        return Integer.parseInt(time);
    }

    /**
     * finds and returns the time difference in minutes between the two clocks
     * @param other Clock the other clock
     * @return int diff the diff in minutes
     */
    public int timeElapsed(Clock other){
        int diff = Math.abs(((other.getHour()*60)+ other.getMinute()) - ((hour*60)+minute));
        return diff;
    }
}

