
package fundamentosvariablesjava;

public class FundamentosVariablesJava {

    public static void main(String[] args) {
        int miVariableEntera = 10;
        System.out.println(miVariableEntera); // 10
        
        //Modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera); // 5
        
        // String: No es un tipo primitivo, sino una clase en Java
        // por eso va en mayúscula
        String miVariableCadena = "Saludos";
        System.out.println(miVariableCadena); // Saludos
     
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena); // Adios
        
        // var - Inferencias de tipos en Java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2); // 15
        
        var miVariableCadena2 = "Nueva Cadena";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        
    }    
}
