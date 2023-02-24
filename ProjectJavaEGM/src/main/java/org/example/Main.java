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

        /*Scanner scanner = new Scanner(System.in);

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
        System.out.println("IMC: " + imc);*/

        //Desarrollar un programa que le pida al usuario su nombre, su apellido, su domicilio, cuanto cotizo en 2022, y cuanto impuesto va a pagar y el total aparte.
        //Declarar constante de ISR = 12% de impuestos

        /*Scanner scanner = new Scanner(System.in);

        String nombre;
        String apellido;
        String domicilio;
        double cotizo;
        double impuestos;
        final double isr = 0.12;

        System.out.println("Inserte su nombre");
        nombre = scanner.nextLine();

        System.out.println("Inserte sus apellidos");
        apellido = scanner.nextLine();

        System.out.println("Inserte su domicilio");
        domicilio = scanner.nextLine();

        System.out.println("Inserte cuanto cotizo en el 2022");
        cotizo = scanner.nextDouble();

        impuestos = cotizo * isr;

        System.out.println("Su impuesto es: $" + impuestos);*/


        //Paso 1 Pedir al usuario su nombre, apellido, domicilio, y el precio de su carro
        //paso 2 Calcular el impuesto de tenencia (1.3% del precio del carro)

        /*Scanner scanner = new Scanner(System.in);

        String nombre;
        String apellido;
        String domicilio;
        double carro;
        double impuesto;
        final double tenencia = 0.013;

        System.out.println("Inserte su nombre");
        nombre = scanner.nextLine();

        System.out.println("Inserte apellido");
        apellido = scanner.nextLine();

        System.out.println("Inserte domicilio");
        domicilio = scanner.nextLine();

        System.out.println("inserte precio de su carro");
        carro = scanner.nextDouble();

        impuesto = carro * tenencia;

        System.out.println("Su nombre es: " + nombre);
        System.out.println("Sus apellidos son: " + apellido);
        System.out.println("Su domicilio es: " + domicilio);
        System.out.println("El precio del carro es: $" + carro);
        System.out.println("El impuesto de tenencia es: $" + impuesto);*/

        int a = 10;
        int b = 5;
        int c = 3;

        if (a > b){
            System.out.println("a es mayor que b");
        } else {
            System.out.println("a no es mayor que b");
        }
    }
}