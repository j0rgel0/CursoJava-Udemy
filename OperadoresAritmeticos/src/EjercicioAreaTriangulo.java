import java.util.Scanner;

public class EjercicioAreaTriangulo {
    public static void main(String[] args){
        
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el alto:");
        var alto = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el ancho:");
        var ancho = Double.parseDouble(consola.nextLine());
        var area = (alto * ancho);
        var perimetro = (alto + ancho)*2;
        System.out.println("Area: :"+area);
        System.out.println("Perimetro: :"+perimetro);
    }
}
