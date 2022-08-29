package operaciones;

public class Aritmetica {
    // Atributos de la clase
    int a;
    int b;
    
    //Constructor vacio
    //public para que sea accedido desde otras clases
    //El constructor vacio solo se va agregar cuando no haya otros constructores.
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
    }
    
    //Sobrecarga de constructores
    // Añadir 2 o más constructores en la misma clase
    
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos");
    }

    // Métodos de la clase
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    public int sumarConRetorno(){
//        int resultado = a + b;
//        return resultado;
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int a, int b){
        //this - hace referencia a un atributo de la clase y no a una variable global
        this.a = a; //El argumento a se asigno al atributo this.a
        this.b = b; //El argumento a se asigno al atributo this.b
        //return a + b;
        return this.sumarConRetorno();
    }
}
