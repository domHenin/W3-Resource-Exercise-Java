package com.w3_resource.exercises.exercise_four;

import java.util.Scanner;

class Problem {
    private int numOne=0;
    private int numTwo=0;
    private int numThree=0;
    private int numFour=0;
    private int numFive=0;
    private int numSix=0;

//    public Problem(int numOne, int numTwo, int numThree, int numFour, int numFive, int numSix) {
//        this.numOne = numOne;
//        this.numTwo = numTwo;
//        this.numThree = numThree;
//        this.numFour = numFour;
//        this.numFive = numFive;
//        this.numSix = numSix;
//    }

//  SETTERS
    public void setNumOne(int numOne) { this.numOne = numOne; }

    public void setNumTwo(int numTwo) { this.numTwo = numTwo; }

    public void setNumThree(int numThree) { this.numThree = numThree; }

    public void setNumFour(int numFour) { this.numFour = numFour; }

    public void setNumFive(int numFive) { this.numFive = numFive; }

    public void setNumSix(int numSix) { this.numSix = numSix; }

//  GETTERS
    public int getNumOne() { return numOne; }

    public int getNumTwo() { return numTwo; }

    public int getNumThree() { return numThree; }

    public int getNumFour() { return numFour; }

    public int getNumFive() { return numFive; }

    public int getNumSix() { return numSix; }

    public int solutionA() {
        int solution = numOne + numTwo * numThree;
        System.out.println(solution);

        return solution;
    }

    public int solutionB() {
        int solution = (numOne+numTwo) % numThree;
        System.out.println(solution);

        return solution;
    }

    public int solutionC() {
        int solution = numOne + numTwo * numThree / numFour;
        System.out.println(solution);

        return solution;
    }

    public int solutionD() {
        int solution = numOne + numTwo / numThree * numFour - numFive % numSix;
        System.out.println(solution);

        return solution;
    }
}


public class Exer_Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Problem problem = new Problem();

        int decision=0;

        //      Collecting User Data (numbers)
        System.out.println("First Number: ");
        problem.setNumOne(scanner.nextInt());

        System.out.println("Second Number: ");
        problem.setNumTwo(scanner.nextInt());

        System.out.println("Third Number: ");
        problem.setNumThree(scanner.nextInt());

        System.out.println("Fourth Number: ");
        problem.setNumFour(scanner.nextInt());

        System.out.println("Fifth Number: ");
        problem.setNumFive(scanner.nextInt());

        System.out.println("Sixth Number: ");
        problem.setNumSix(scanner.nextInt());

        System.out.println("How would you like to solve this problem?");
        System.out.println("Case 1: a + b * c");
        System.out.println("Case 2: (a + b) % c");
        System.out.println("Case 3: a + b * c / d");
        System.out.println("Case 4: a + b / c * d - e % f");
        decision = scanner.nextInt();

        switch (decision) {
            case 1:
                problem.solutionA();
                break;
            case 2:
                problem.solutionB();
                break;
            case 3:
                problem.solutionC();
                break;
            case 4:
                problem.solutionD();
                break;
            default:
                break;
        }

        System.out.println();

//TEST  System.out.println("Returned NUMBER: "+problem.getNumOne());
    }
}

//TODO:
//        Write a Java program to print the result of the following operations. Go to the editor
//        Test Data:
//        a. -5 + 8 * 6
//        b. (55+9) % 9
//        c. 20 + -3*5 / 8
//        d. 5 + 15 / 3 * 2 - 8 % 3
//        Expected Output :
//        43
//        1
//        19
//        13

//CODE BONEYARD::
//BUG: do/while to prevent not going above 6. if chose 7 or higher; does not work when chose 6 or under
//        do {
//                if (decision<=6 && decision>=6) {
//                System.out.println("chose 6");
//                } else if (decision<=5 && decision>=5 && decision!=6) {
//                System.out.println("chose 5");
//                } else if (decision<=4 && decision>=4 && decision!=6) {
//                System.out.println("chose 4");
//                } else if (decision<=3 && decision>=3 && decision!=6) {
//                System.out.println("chose 3");
//                } else if (decision<=2 && decision>=2 && decision!=6) {
//                System.out.println("chose 2");
//                } else if (decision<=1 && decision>=1 && decision!=6) {
//                System.out.println("chose 1");
//                }
//                } while (decision>=6); -> this cld work but still has BUGS, also be sure to add 'break' after each if statement to avoid infinate loop
// ..
//        if (decision>=7){
//            System.out.println("Wrong answer...");
//        } else if (decision<=6 && decision>=6) {
//            System.out.println("chose 6");
//        } else if (decision <= 5 && decision >= 5 && decision != 6) {
//            System.out.println("chose 5");
//        } else if (decision <= 4 && decision >= 4 && decision != 6) {
//            System.out.println("chose 4");
//        } else if (decision <= 3 && decision >= 3 && decision != 6) {
//            System.out.println("chose 3");
//        } else if (decision <= 2 && decision >= 2 && decision != 6) {
//            System.out.println("chose 2");
//        } else if (decision <= 1 && decision >= 1 && decision != 6) {
//            System.out.println("chose 1");
//        }

