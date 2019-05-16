package com.w3_resource.exercises.exercise_seven;

public class GetMonth {
    private int num_days_InMonth=0;
    private int month;
    private int year;
    private String MonthOfName = "Unknown";


//  SETTERS:
    public void setNum_days_InMonth(int num_days_InMonth) { this.num_days_InMonth = num_days_InMonth; }

    public void setMonth(int month) { this.month = month; }

    public void setYear(int year) { this.year = year; }

    public void setMonthOfName(String monthOfName) { this.MonthOfName = MonthOfName; }

//  GETTERS:
    public int getNum_days_InMonth() { return num_days_InMonth; }

    public int getMonth() { return month; }

    public int getYear() { return year; }

    public String getMonthOfName() { return MonthOfName; }

    public void makeCase() {
        switch (month) {
            case 1:
                MonthOfName = "January";
                num_days_InMonth = 31;
                break;
            case 2:
                MonthOfName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    num_days_InMonth = 29;
                } else {
                    num_days_InMonth = 28;
                }
                break;
            case 3:
                MonthOfName = "March";
                num_days_InMonth = 31;
                break;
            case 4:
                MonthOfName = "April";
                num_days_InMonth = 30;
                break;
            case 5:
                MonthOfName = "May";
                num_days_InMonth = 31;
                break;
            case 6:
                MonthOfName = "June";
                num_days_InMonth = 30;
                break;
            case 7:
                MonthOfName = "July";
                num_days_InMonth = 31;
                break;
            case 8:
                MonthOfName = "August";
                num_days_InMonth = 31;
                break;
            case 9:
                MonthOfName = "September";
                num_days_InMonth = 30;
                break;
            case 10:
                MonthOfName = "October";
                num_days_InMonth = 31;
            case 11:
                MonthOfName = "November";
                num_days_InMonth = 30;
                break;
            case 12:
                MonthOfName = "December";
                num_days_InMonth = 31;
                break;
        }

        System.out.print(MonthOfName + " " + year + " has " + num_days_InMonth + " days");
    }


}
