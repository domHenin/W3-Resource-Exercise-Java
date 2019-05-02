package com.w3_resource.exercises.exercise_thirteen;

class AreaSolution extends GivenNumber {
    public AreaSolution(double width, double height) {
        super(width, height);
    }

    public double solve() {
        double solution = getWidth() * getHeight();

        System.out.printf("Area Solution: %.2f\n",solution);

//        System.out.println(Math.round(getHeight() * getHeight()));
        return solution;
    }
}


// Area is 5.6 * 8.5 = 47.60