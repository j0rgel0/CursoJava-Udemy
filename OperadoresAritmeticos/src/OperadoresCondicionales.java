public class OperadoresCondicionales {
    public static void main (String[] args){
        var a = 10;
        var valorMinimo =0;
        var valorMaximo = 10;
        var resultado = a >= 0 && a <= 10;
        System.out.println("resultado = " + resultado);// resultado = true
        if(resultado){
            System.out.println("Dentro del rango");// Dentro del rango
        } else {
            System.out.println("Fuera de ranto");
        }
        
        var vacaciones = false;
        var diaDescanso = false;
        if(vacaciones || diaDescanso){ //Es suficiente que solo uno sea verdadero
            System.out.println("Padre puede asisir al juego del hijo");
        } else {
            System.out.println("El padre esta ocupado");// El padre esta ocupado
        }
    }
}
