
public class OperadoresAsignacion {
    public static void main(String[] args){
        
        int a = 3, b=2;
        // Operador de Asignación (=)
        // La evaluación es de izquierda a derecha.
        int c = a + 5 - b;
        System.out.println("c = " + c); // c = 6
        
        //Operador de Asignacion de Composición de suma
        a += 1;// a = a + 1
        System.out.println("a = " + a);//a = 4
        
        a += 3;// a = a + 3
        System.out.println("a = " + a);//a = 7
        
        //Operador de Asignacion de Composición de resta
        a -= 1;// a = a - 1
        System.out.println("a = " + a);//a = 6
        
        a -= 3;// a = a - 3
        System.out.println("a = " + a);//a = 3
        
        //Operador de Asignacion de Composición de multiplicación
        a *= 1;// a = a * 1
        System.out.println("a = " + a);//a = 3
        
        a *= 3;// a = a * 3
        System.out.println("a = " + a);//a = 9
        
        //Operador de Asignacion de Composición de división
        a /= 1;// a = a / 1
        System.out.println("a = " + a);//a = 9
        
        a /= 3;// a = a / 3
        System.out.println("a = " + a);//a = 3
        System.out.println(a);
        //Operador de Asignacion de Composición de modulo(residuo)     
        a %= 4;// a = a % 4  (3/4)
        //    _0_
        //  4| 3 0
        //     3
        System.out.println("a = " + a);//a = 3
        
        a = 9 % 8;
        System.out.println("a = " + a); //a = 1
    }
}
