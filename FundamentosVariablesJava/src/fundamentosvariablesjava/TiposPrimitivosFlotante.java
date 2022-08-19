package fundamentosvariablesjava;

public class TiposPrimitivosFlotante {
    public static void main(String[] args){
        /* 
            Tipos primitivos flotantes: float y double
        */
        
        float numeroFloat = 3.4028235E38F;
        System.out.println("numeroFloat = " + numeroFloat); //10.0
        System.out.println("Valor mínimo tipo float: "+ Float.MIN_VALUE); // 1.4E-45
        System.out.println("Valor máximo tipo float: "+ Float.MAX_VALUE); // 3.4028235E38
        float numeroFloat2 = (float)3.4028236E38D; //D de double
        System.out.println("numeroFloat2 = " + numeroFloat2); //Infinity
        
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("numeroDouble = " + numeroDouble); //1.7976931348623157E308
        System.out.println("Valor mínimo tipo double: "+ Double.MIN_VALUE); // 4.9E-324
        System.out.println("Valor máximo tipo double: "+ Double.MAX_VALUE); // 1.7976931348623157E308
    }
}
