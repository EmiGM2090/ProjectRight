package org.example;

import javax.swing.*;
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

        /*int a = 10;
        int b = 5;
        int c = 3;

        if (a > b){
            System.out.println("a es mayor que b");
        } else {
            System.out.println("a no es mayor que b");
        }*/


       /* JOptionPane.showMessageDialog(null,"Hola mundo");

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        JOptionPane.showMessageDialog(null, "EL numero: " + num);


        if (num > 18) {
            JOptionPane.showMessageDialog(null, "El numero es mayor a 18");
        } else {
            JOptionPane.showMessageDialog(null,"El numero es menor a 18");
        }*/
       /* for (int i = 0; i<10; i++){
            JOptionPane.showMessageDialog(null, "Hola, la variable i vale: " + i);
        }*/

       /* double nums[] = new double[10];

        nums[0] = 10;
        nums[1] = 100;
        nums[2] = 1000;
        nums[3] = 10000;
        nums[4] = 100000;
        nums[5] = 1000000;
        nums[6] = 10000000;
        nums[7] = 100000000;
        nums[8] = 1000000000;
        nums[9] = 1000000000;

        JOptionPane.showMessageDialog(null, "Numero 1: " + nums[0]);


        for (int i = 0; i < 10; i++) {
            nums[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numero en la posicion " + i + ":"));
        }


        for (int i = 0; i < 10; i++) {
            JOptionPane.showMessageDialog(null, "EL numero es: " + nums[i]);
        }*/

        //determinar el numero mayor de 3 numeros

       /* int num1 = 10;
        int num2 = 44;
        int num3 = 37;
        int num4 = 78;
        // && ||  and or
        if (num1 > num2 && num1 > num3 && num1 > num4) {
            JOptionPane.showMessageDialog(null, "El numero 1 es mayor");
        }
        if (num2 > num1 && num2 > num3 && num2 > num4) {
            JOptionPane.showMessageDialog(null, "El numero 2 es mayor");
        }
        if (num3 > num1 && num3 > num2 && num3 > num4) {
            JOptionPane.showMessageDialog(null, "El numero 3 es mayor");
        }
        if (num4 > num1 && num4 > num2 && num4 > num3) {
            JOptionPane.showMessageDialog(null, "El numero 4 es mayor");
        }*/

        
    }
}