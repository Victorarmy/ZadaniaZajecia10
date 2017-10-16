package com.example.two.app;

import com.example.two.controller.MainLoopController;

import java.io.FileNotFoundException;
import java.io.IOException;

public class StartClass {
    public static void main(String[] args) {
        try {
            MainLoopController mainLoopController = new MainLoopController();
            mainLoopController.start();
        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku z danymi.");
            e.printStackTrace();
        }
    }
}
