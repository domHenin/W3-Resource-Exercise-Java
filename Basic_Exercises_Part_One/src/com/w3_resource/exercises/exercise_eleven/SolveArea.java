package com.w3_resource.exercises.exercise_eleven;

public class SolveArea extends Radius {
//    private double answer=0;

    public SolveArea(double r) {
        super(r);
//      this.answer = answer;
    }

    @Override
    public double getR() {
        return super.getR();
    }

    //    public double getAnswer() { return answer; }

    public double solveFor() {
        double area = Math.PI * Math.pow(getR(), 2);

        System.out.println("Area: " +area);

        return area;
    }
}


// Solve for area: A = pie*r^2