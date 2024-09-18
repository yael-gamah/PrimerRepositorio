package Perro;

import java.util.Scanner;

public class Perro {

    public static void main(String[] args) {
        System.out.println("Guau");
        System.out.println(razaPerro("Salchicha"));
    }

    public static String razaPerro(String n) {
        return "Soy un perro de raza: " + n;
    }

    public static void nombrePerro() {

        // Pedir al usuario que ingrese el nombre del perro
        try (Scanner scanner = new Scanner(System.in)) {
            // Pedir al usuario que ingrese el nombre del perro
            System.out.print("Introduce el nombre del perro: ");
            String nombre = scanner.nextLine();
            
            // Mostrar el nombre del perro
            System.out.println("El nombre del perro es: " + nombre);
        }

    }
}
