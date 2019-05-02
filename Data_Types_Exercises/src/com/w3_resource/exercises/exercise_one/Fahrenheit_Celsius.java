package com.w3_resource.exercises.exercise_one;

public class Fahrenheit_Celsius {
    private  double celsius;
    private double fahrenheit;

    public void setFahrenheit(double fahrenheit) { this.fahrenheit = fahrenheit; }
    public void setCelsius(double celsius) { this.celsius = celsius; }


    public double getCelsius() { return celsius; }
    public double getFahrenheit() { return fahrenheit; }

    public double calculate() {
        celsius = (fahrenheit-32)*(0.5556);

        System.out.printf("Temperature in Celcius: %.2f",celsius);

        return celsius;
    }


}
