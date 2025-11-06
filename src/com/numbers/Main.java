/**
 * Java program to find numbers dividable by 3.
 */

package com.numbers;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Main class.
 */
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating sorted TreeSet with unic numbers
        Set<Integer> set = new TreeSet<>();

        // Adding random elements to a set
        for (int index = 0; index < 27; index++) {

            set.add(new Random().nextInt(99));

        }

        // Printing elements of the set with result of operator %

        // Crating iterator
        Iterator<Integer> it = set.iterator();

        // Iterating through a list
        while (it.hasNext()) {

            // Creating temporal variable
            int number = it.next();

            // Condition
            if (number % 3 == 0) {

                // Printing the result to console
                System.out.println(number + " is dividable by 3.");

            } else {

                // Printing the result to console
                System.out.println(number + " is not dividable by 3.");

            }
        }
    }
}