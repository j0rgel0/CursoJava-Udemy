
public class OperacionesIgualdadRelacionales {

    public static void main(String[] args) {
        var a = 3;
        var b = 2;
        //Operador de igualdad ==
        var c = (a == b);
        System.out.println("c = " + c); //false

        // Operador es diferente !=
        var d = (a != b);
        System.out.println("d = " + d); //true

        //
        var cadena = "Hola";
        var cadena2 = "Adios";
        var e = (cadena == cadena2);// Se compara referencias de la memoria del objeto.
        System.out.println("e = " + e);// false
        var cadena3 = "Hola";
        var e2 = (cadena == cadena3);
        System.out.println("e2 = " + e2);// true <-- pero por otras razones.
        
        //Esta es la forma para comparar los tipos String.
        var f = cadena.equals(cadena2); // Comparamos contenidos de cadenas.
        System.out.println("f = " + f);// false
        var g = cadena.equals(cadena3);
        System.out.println("g = " + g);// true
        
        // Interning a string [intern()]
        // Enables reliable == operator comparison
        // Improves performance of frequently compared strings
        String s3 = "I love";
        s3 += " Java";
        String s4 = "I";
        s4 += " love Java";
        if(s3.intern() == s4.intern()){
            System.out.print("Utilizando intern(): ");
            System.out.println("s3 es igual a s4");
        }
        
    }
}
