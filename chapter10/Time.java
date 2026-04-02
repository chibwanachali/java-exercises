public class Time{
    int hour;
    int minute;
    int second;

    /** No-arg constructor: current time */
    public Time(){
        long currentMillis = System.currentTimeMillis();
        setTime(currentMillis);
    }

    public Time(long elapsedMillis) {
    setTime(elapsedMillis);
    }

    public Time(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
    }

    public void setTime(long elapsedMillis){
        long totalSeconds = elapsedMillis / 1000;
        this.second = (int)(totalSeconds % 60);

        long totalMinutes = totalSeconds / 60;
        this.minute = (int)(totalMinutes % 60);

        long totalHours = totalMinutes / 60;
        this.hour = (int)(totalHours % 24);
    }
    /** Getters */
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }



}