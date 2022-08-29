package proyectocaja;

public class Caja {
    int ancho;
    int largo;
    int profundo;
    
    //Constructor vacio.
    public Caja(){}
    
    //Constructor
    public Caja(int ancho, int largo, int profundo){
        this.ancho = ancho;
        this.largo = largo;
        this.profundo = profundo;
    }
    
    //Método calcularVolumen
    public int calcularVolumenCaja(){
        return ancho * largo * profundo;
    }
    
}
