package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");
        System.out.println("Emiliano Godinez Madrid");
        int mieEntero = 10;
        float miPuntoFlotante = 0.5f;
        double miDecimal = 22.5;
        String miTexto = "Hola soy un texto en java";
        char miCaracter = 'a';


        Scanner scanner = new Scanner(System.in);

        int numero;
        numero = scanner.nextInt();

        System.out.println("Mi numero que acabo de ingresar es: " + numero);*/

        //Desarrollar un programa java que lea 2 numeros, los sume y muestre el resultado

        /*Scanner resultado = new Scanner(System.in);
        int numero;
        numero = resultado.nextInt();

        int numero2;
        numero2 = resultado.nextInt();

        int suma = numero+numero2;

        System.out.println("El resultado es: " + suma);*/

    //Desarrollar un programa que le pida al usuario su nombre, su edad, su peso y su altura y que calcule el imc y al final muestren una ficha de todos sus datos

        Scanner scanner = new Scanner(System.in);

        String nombre;
        int edad;
        double peso;
        double altura;
        double imc;

        System.out.println("Ingrese su nombre:");
        nombre = scanner.nextLine();

        System.out.println("Ingrese su edad:");
        edad = scanner.nextInt();

        System.out.println("Ingrese su peso:");
        peso = scanner.nextDouble();

        System.out.println("Ingrese su altura:");
        altura = scanner.nextDouble();

        imc = peso / Math.pow(altura,2);
        System.out.println("El IMC es: " + imc);

        System.out.println("Su ficha de datos es: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("IMC: " + imc);
    }
}