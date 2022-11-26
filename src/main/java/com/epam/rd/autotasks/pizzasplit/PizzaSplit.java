package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peopleNum = sc.nextInt();
        int piece = sc.nextInt(); // slices per pizza
        int helper = piece; // helper variable to make piece variable back

        int pizza = 1;
        do {
            if (piece % peopleNum == 0) { // checking if remainder is zero
                break;
            } else {
                pizza++;
                piece = helper; // getting piece back
                piece *= pizza;
            }
        } while (true);
        System.out.println(pizza);

    }
}
