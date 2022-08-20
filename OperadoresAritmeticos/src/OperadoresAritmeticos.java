public class OperadoresAritmeticos {
    public static void main(String[] args){
        var a=3;
        var b=2;
        
        // Operador + de suma
        var resultado = a + b;
        System.out.println("resultado = " + resultado); //resultado = 5
        
        // Operador - de resta
        resultado = a - b;
        System.out.println("resultado = " + resultado);//resultado = 1
        
        // Operador * de multiplicación
        resultado = a * b;
        System.out.println("resultado = " + resultado);//resultado = 6
        
        //Operador / de división
        resultado = a / b;
        System.out.println("resultado = " + resultado);//resultado = 1  
        // Resultado incompleto porque son variables int
        
        //Operador / de división con 1 valor tipo flotante
        var resultado2 = 3.0 / b;
        System.out.println("resultado2 = " + resultado2);//resultado2 = 1.5
        
        //Operador / de división con 1 valor tipo flotante, indicado con la letra F.
        resultado2 = 3F / b;
        System.out.println("resultado2 = " + resultado2);//resultado2 = 1.5
        
        //Operador / de división con 1 valor tipo double, indicado con la letra D.
        resultado2 = 3D / b;
        System.out.println("resultado2 = " + resultado2);//resultado2 = 1.5
        
        //Operador de modulo(residuo)
        resultado = a % b;
        System.out.println("resultado = " + resultado); //resultado = 1
                
        // Ver si es par o impar.
        // a % 2 == 0: Si un numero es divisible entre 2 da 0
        // a % 2 == 0: Es par
        if( a % 2 == 0){
            System.out.println(a + " es par");
        } else {
            System.out.println(a + " es impar");
        }
    }
}
