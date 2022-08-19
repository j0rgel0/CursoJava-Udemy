
package fundamentosvariablesjava;

public class TiposPrimitivosEnteros {
    public static void main(String[] args){
        /*
            Tipos primivitos enteros:
              byte,    short,     int,     long
            8 bits    16 bits   32 bits    64 bits    
        */
        
        byte numeroByte = (byte)129; 
        System.out.println("numeroByte = " + numeroByte); //127 <- porque es el valor máximo de byte
        // Se pone Byte en mayúscula porque se está accediendo a la Clase Byte y no al tipo primitivo.
        System.out.println("Valor mínimo de byte: " + Byte.MIN_VALUE); //-128
        System.out.println("Valor máximo de byte: " + Byte.MAX_VALUE); //127
        
        short numeroShort = (short)32768; 
        System.out.println("numeroShort = " + numeroShort); //-32768
        // Se pone Short en mayúscula porque se está accediendo a la Clase Short y no al tipo primitivo.
        System.out.println("Valor mínimo de short: " + Short.MIN_VALUE); //-32768
        System.out.println("Valor máximo de short: " + Short.MAX_VALUE); //32767
        
        // int numeroInt = (int)2147483648; //Se tiene que añadir una l minucula o mayuscula, se recomienda mayúsucla
        int numeroInt = (int)2147483648L;
        System.out.println("numeroInt = " + numeroInt); //-2147483648
        System.out.println("Valor mínimo de int: " + Integer.MIN_VALUE); //-2147483648
        System.out.println("Valor máximo de int: " + Integer.MAX_VALUE); //2147483647
        
        long numeroLong = (long)9223372036854775808F;//Se tiene que añadir una f o d minucula o mayuscula, se recomienda mayúsucla
        System.out.println("numeroLong = " + numeroLong); //9223372036854775807
        System.out.println("Valor mínimo de long: " + Long.MIN_VALUE); //-9223372036854775808
        System.out.println("Valor máximo de long: " + Long.MAX_VALUE); //9223372036854775807
    }
}
