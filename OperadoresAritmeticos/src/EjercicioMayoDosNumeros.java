import java.util.Scanner;

public class EjercicioMayoDosNumeros {
    public static void main(String[] args){
        
        var consola = new Scanner(System.in);
        System.out.println("Proporciona un número:");
        var num1 = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona otro número:");
        var num2 = Double.parseDouble(consola.nextLine());
        var mayor = (num1 > num2) ? ("El mayor es "+num1): ("El mayor es "+num2);
        System.out.println(mayor);
    }
}
