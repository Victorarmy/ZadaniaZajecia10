package com.example.one;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> userInputs = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        try {
            int userInput;
            System.out.println("Podaj liczbe");
            while ((userInput = scanner.nextInt()) >= 0) {
                userInputs.add(userInput);
                System.out.println("Podaj liczbę");
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
        } catch (InputMismatchException e) {
            System.err.println("Podałeś złe dane. Zamykanie.");
            e.printStackTrace();
        }
        scanner.close();
    }
}
