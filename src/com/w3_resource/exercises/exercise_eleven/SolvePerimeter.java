package com.w3_resource.exercises.exercise_eleven;

public class SolvePerimeter extends Radius {
    public SolvePerimeter(double r) {
        super(r);
    }

    @Override
    public double getR() {
        return super.getR();
    }

    public double solveFor() {
        double p = 2*Math.PI*getR();

        System.out.println("Perimeter: "+p);

        return p;
    }
}

// Solve for perimeter: C = 2*pi*r