public class OperadoresUnarios {
    public static void main(String[] args){
        var a = 3;
        var b = -a;
        //Operadores unarios, que cambian el signo.
        System.out.println("a = " + a);//a = 3
        System.out.println("b = " + b);//b = -3
        
        //Negación: Solo aplica en valores booleanos.
        var c = true;
        System.out.println("c = " + c);//c = true
        var d = !c;
        System.out.println("d = " + d);//d = false
        
        //Operadores unarios de incremento
        // 1. Preincremento (Símbolo después de la variable)
        var e = 3;
        System.out.println("e = " + e); //e = 3
        var f = ++e; //Primero se incrementa la variable y después se usa su valor.
        System.out.println("e = " + e); //e = 4
        System.out.println("f = " + f); //f = 4
        
        // 2. PostIncrimento (Símbolo después de la variable)
        var g = 5;
        System.out.println("g = " + g); //g = 5
        var h = g++; //Primero se utiliza el valor y después se incrementa.
        System.out.println("h = " + h); //h = 5
        System.out.println("g = " + g); //g = 6
        
        //Decremento
        // 1. Predecremento
        var i =2;
        System.out.println("i = " + i); //i = 2
        var j = --i;//Primero se decrementa la variable y después se usa su valor.
        System.out.println("j = " + j); //j = 1
        System.out.println("i = " + i); //i = 1
        
        // 2. Postdecremento
        var k = 4;
        System.out.println("k = " + k);//k = 4
        var l = k--;//Primero se utiliza el valor y después se decrementa.
        System.out.println("l = " + l);//l = 4
        System.out.println("k = " + k);//k = 3
        
    }
}
