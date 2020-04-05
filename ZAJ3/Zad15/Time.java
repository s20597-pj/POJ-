package Zad15;

/**
 * summary: Time UML implementation.
 * author: Mateusz Hinca
 **/
public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        String hourWithLeadingZero = Integer.toString(this.hour);
        String minuteWithLeadingZero = Integer.toString(this.minute);
        String secondWithLeadingZero = Integer.toString(this.second);
        if (this.hour < 10) {
            hourWithLeadingZero = "0" + this.hour;
        }
        if (this.minute < 10) {
            minuteWithLeadingZero = "0" + this.minute;
        }
        if (this.second < 10) {
            secondWithLeadingZero = "0" + this.second;
        }
        return hourWithLeadingZero + ":" + minuteWithLeadingZero + ":" + secondWithLeadingZero;
    }

    public Time nextSecond() {
        if (this.second == 59) {
            setSecond(0);
            if (minute == 59) {
                setMinute(0);
                if (hour == 23) {
                    setHour(0);
                } else {
                    setHour(this.hour + 1);
                }
            } else {
                setMinute(this.minute + 1);
            }
        }
        else {
            setSecond(this.second+1);
        }
        return this;
    }
    public Time previousSecond(){
        if(this.second==0){
            setSecond(59);
            if(this.minute==0){
                setMinute(59);
                if(this.hour==0){
                    setHour(23);
                }
                else{
                    setHour(this.hour-1);
                }
            }
            else{
                setMinute(this.minute-1);
            }
        }
        else{
            setSecond(this.second-1);
        }
        return this;
    }
}
