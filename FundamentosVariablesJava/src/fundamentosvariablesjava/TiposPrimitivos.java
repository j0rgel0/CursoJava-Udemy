
package fundamentosvariablesjava;

public class TiposPrimitivos {
    public static void main(String[] args){
        /*
            Tipos primivitos enteros:
              byte,    short,     int,     long
            8 bits    16 bits   32 bits    64 bits    
        */
        
        byte numeroByte = (byte)129;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Valor mínimo de byte: " + Byte.MIN_VALUE); //-128
        System.out.println("Valor mínimo de byte: " + Byte.MAX_VALUE); //127
        
    }
}
