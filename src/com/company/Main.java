package com.company;

public class Main {
    public static void main(String[] args) {

        for (int r : new Randoms(90, 100)) {
            System.out.println("Random number is " + r);
            if (r == 100) {
                System.out.println("100. Let's finish!");
                break;
            }
        }
    }
}
