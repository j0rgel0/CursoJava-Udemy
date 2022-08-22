package clases;

//Se le añade public para acceder a la clase desde otros archivos.
//Creando clase persona.
public class Persona { //Es nuestra plantilla
    //Atributos de la clase
    String nombre;
    String apellido;
    
    //Método "public" para usarlo fuera de la clase
    // void no regresa nada
    
    //Métodos de la clase
    public void desplegarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
    }
    
}
