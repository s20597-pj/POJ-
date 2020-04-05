package Zad14;
/**
 * summary: Date UML implementation.
 * author: Mateusz Hinca
 **/
public class Date {

    private int day;
    private int month;
    private int year;


    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(int day,int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        String dayWithLeadingZero=Integer.toString(this.day);
        String monthWithLeadingZero=Integer.toString(this.month);
        if(this.day<10){
            dayWithLeadingZero= "0"+this.day;
        }
        if(this.month<10){
            monthWithLeadingZero="0"+this.month;
        }
        return dayWithLeadingZero+"/"+monthWithLeadingZero+"/"+this.year;
    }
}
