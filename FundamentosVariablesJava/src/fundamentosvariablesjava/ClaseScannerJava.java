package fundamentosvariablesjava;

import java.util.Scanner;

public class ClaseScannerJava {
    public static void main(String[] args){
        System.out.println("Escribe tu nombre");
        Scanner consola = new Scanner(System.in);
        
        // Método nextLine
        var usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println(" ");
        System.out.println("Escribe el titulo");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
        System.out.println(" ");
        
        System.out.println(" ");
        System.out.println(" Escribe el nombre del libro");
        var nombreTitulo = consola.nextLine();
        System.out.println(" Escribe el nombre del autor del libro");
        var nombreAutor = consola.nextLine();
        System.out.println(nombreTitulo + " fue escrito por " + nombreAutor);
    }
}
