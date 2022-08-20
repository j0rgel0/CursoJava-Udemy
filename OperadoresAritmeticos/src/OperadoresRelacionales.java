public class OperadoresRelacionales {
    public static void main(String[] args){
        var a = 3;
        var b = 2;
        var g = a < b;
        System.out.println("g = " + g); //g = false
        g = a > b;
        System.out.println("g = " + g); //g = true
        g = a >= b;
        System.out.println("g = " + g); //g = true
        
        System.out.println("a = " + a);//a = 3
        if(a % 2 == 0){
            System.out.println(a+" es un número es par");
        } else {
            System.out.println(a+" es un número es impar"); //3 es un número es impar
        }
        
        var edad = 30;
        var adulto = 18;
        if(edad>=adulto){
            System.out.println("Es un adulto");// Es un adulto
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
