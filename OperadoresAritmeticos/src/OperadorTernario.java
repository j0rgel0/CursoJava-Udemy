
public class OperadorTernario {

    public static void main(String[] args) {
        //Operador ternario
        var resultado = (3 > 2) ? "Verdadero" : "Falso";
        System.out.println("resultado = " + resultado); //resultado = Verdadero

        var resultado2 = (1 > 2) ? "Verdadero" : "Falso";
        System.out.println("resultado2 = " + resultado2); //resultado = Falso
        
        var numero = 8;
        resultado = (numero%2 == 0) ? "Es par" : "Es impar"; 
        System.out.println("resultado = " + resultado);
    }
}
