// Create a function named summation that will take in an int[ ] and return an int. I want the
// function to then go through the given array and sum up digits in the array. Once that’s
// done return the answer.
// From the main function call your new summation function with an example array and
// print out the answer


package com.company;

public class Main {

    public static void main(String[] args) {

        int[] numarr = {4, 5, 6, 3, 7, 8, 1, 9, 0};
        System.out.println(summation(numarr));
    }

    static int summation(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; ++i) {
            sum += array[i];
        }
        return sum;
    }
}
