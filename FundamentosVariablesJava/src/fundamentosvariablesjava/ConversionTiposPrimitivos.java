package fundamentosvariablesjava;

import java.util.Scanner;

public class ConversionTiposPrimitivos {

    public static void main(String[] args) {
        // String to Integer        
        //Convertir tipo String a un tipo Int
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + edad); //edad = 20
        System.out.println("edad = " + (edad + 1)); //edad = 21

        var edad2 = "20";
        System.out.println("edad2 = " + (edad2 + 1));// edad2 = 201

        // String to Double
        var valorPI = Double.parseDouble("3.1416");// valorPI = 3.1416
        System.out.println("valorPI = " + valorPI);
        
        // Pedir un valor
        var consola = new Scanner(System.in);
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad);
        
        // Integer to String
        var edadTexto = String.valueOf(edad);
        System.out.println("edadTexto = " + edadTexto); //edadTexto = 10
        
        // String to Char  //charAt del tipo Object
        var caracter = "hola".charAt(0);
        System.out.println("caracter = " + caracter); //caracter = h
        // carcater se vuelve tipo char
        
        System.out.println("Proporciona un caracter:");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }
}
