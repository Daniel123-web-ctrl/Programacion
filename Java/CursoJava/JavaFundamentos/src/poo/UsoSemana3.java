package poo;
public class Time {
    private int second = 0;
    private int minute = 0;
    private int hour = 0;

    public Time() {
    }

    public Time(int second, int minute, int hour) {
        setTime(second, minute, hour);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
  
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    
    public void setTime(int second, int minute, int hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    // Mostrar la hora como hh:mm:ss
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Aumentar un segundo
    public Time nextSecond() {
        second++;

        if (second == 60) {
            second = 0;
            minute++;

            if (minute == 60) {
                minute = 0;
                hour++;

                if (hour == 24) {
                    hour = 0;
                }
            }
        }

        return this;
    }
}
