package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        
        // Variables locales 
        //(Solo se usa var con variables locales), no se pueden ocupar desde otro método.
        int a = 10;
        int b = 2; //El alcance es mayor
        
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 a= " + aritmetica1.a);
        System.out.println("aritmetica1 b= " + aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 a = " + aritmetica2.a);
        System.out.println("aritmetica2 b = " + aritmetica2.b);
        
//        aritmetica1.a = 3;
//        aritmetica1.b = 2;
//        aritmetica1.sumar(); //resultado = 5
//        
//        int resultado = aritmetica1.sumarConRetorno();
//        System.out.println("resultado desde sumerConRetorno() = " + resultado); //resultado desde sumerConRetorno() = 5
//        
//        resultado = aritmetica1.sumarConArgumentos(5,8);
//        System.out.println("resultado desde sumarConArgumentos() = " + resultado);//resultado desde sumarConArgumentos() = 13
        
    }
}
