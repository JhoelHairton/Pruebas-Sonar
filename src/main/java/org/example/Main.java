package org.example;

import service.AnagramaChecker;
import service.AnagramaCheckerImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnagramaChecker checker = new AnagramaCheckerImpl();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Comprobador de Anagramas!");
        System.out.println("------------------------");

        // Pedir las dos palabras al usuario
        System.out.print("Ingresa la primera palabra: ");
        String palabra1 = scanner.nextLine();

        System.out.print("Ingresa la segunda palabra: ");
        String palabra2 = scanner.nextLine();

        // Verificar si son anagramas
        boolean resultado = checker.sonAnagramas(palabra1, palabra2);

        // Mostrar el resultado
        if (resultado) {
            System.out.println("\n¡Son anagramas! 🎉");
        } else {
            System.out.println("\nNo son anagramas. ❌");
        }

        scanner.close();

    }
}