package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar(); //resultado = 5
        
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado desde sumerConRetorno() = " + resultado); //resultado desde sumerConRetorno() = 5
        
        resultado = aritmetica1.sumarConArgumentos(5,8);
        System.out.println("resultado desde sumarConArgumentos() = " + resultado);//resultado desde sumarConArgumentos() = 13
        
    }
}
