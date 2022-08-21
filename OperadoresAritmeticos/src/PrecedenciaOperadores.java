public class PrecedenciaOperadores {
    public static void main(String[] args){
        // Precedencia de operadores: orden de prioridad.
        // 1. Operadores unarios ++ -- + - ~ !
        // 2. Paréntesis
        // 3. * / %
        // 4. + - y concatenación (+)
        // 5. << >> >>>
        // Existen más operadores
        var x = 5;
        var y = 10;
        //       6  + 10(después de decrementa)
        var z = ++x + y--;
        System.out.println("x = " + x); //x = 6
        System.out.println("y = " + y); //y = 9
        System.out.println("z = " + z); //16 
    }
}
