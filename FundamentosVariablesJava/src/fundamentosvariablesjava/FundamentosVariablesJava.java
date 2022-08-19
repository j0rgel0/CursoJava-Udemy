
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
        
        //Reglas para definir una variable en Java
        // Valores permitidos en el nombre de las variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable =3;
        //var áVariable = 0;  No se recomienda utilizar
        
        // No se pueden utilizar la siguientes
        //var #miVariable = 2;
        
        
        
        
    }    
}
