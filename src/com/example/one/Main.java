package com.example.one;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> userInputs = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int userInput = 0;
        while (userInput >= 0) {
            System.out.println("Podaj liczbę: ");
            userInput = scanner.nextInt();
            userInputs.add(userInput);
        }

        Collections.reverse(userInputs);
        System.out.println(userInputs);
        int sum = 0;
        for (Integer input : userInputs) {
            sum += input;
        }
        System.out.println(sum);
        System.out.println(Collections.min(userInputs));
        System.out.println(Collections.max(userInputs));
        scanner.close();
    }
}
