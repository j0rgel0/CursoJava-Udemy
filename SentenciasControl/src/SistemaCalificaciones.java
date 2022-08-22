
import java.util.Scanner;

public class SistemaCalificaciones {

    public static void main(String[] args) {
        System.out.println("Proporciona un valor entre 0 y 10");
        var consola = new Scanner(System.in);
        var valor = Double.parseDouble(consola.nextLine());
        var calificacion = "Calificación pendiente";
        if (valor <= 10 && valor >= 9) {
            calificacion = "A";
        } else if (valor <= 9 && valor >= 8) {
            calificacion = "B";
        } else if (valor <= 8 && valor >= 7) {
            calificacion = "C";
        } else if (valor <= 7 && valor >= 6) {
            calificacion = "D";
        } else if (valor <= 6 && valor >= 0) {
            calificacion = "F";
        } 
        System.out.println("Calificación = " + calificacion);
    }
}
