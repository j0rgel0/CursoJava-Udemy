package clases;

public class PruebaPersona {

    public static void main(String[] args) {
        //Creando una variable del tipo Persona de la clase
        Persona persona1;
        //Creando un objeto.
        //Tenemos un constructor vacío que se genera de manera automática y nos sirve para crear objetos.
        persona1 = new Persona(); //Persona() es el constructor especial para rservar espacio en memoria.
        //Regresa la refencia donde se ha creado el objeto en memoria.

        // operador . se accede al atributo
        persona1.nombre = "Juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();//clases.Persona@15aeb7ab
        /*
        Nombre: Juan
        Apellido: Perez
         */
        Persona persona2 = new Persona(); //Segunda instancia
        System.out.println("persona2 = " + persona2);
        persona2.desplegarInformacion();
        persona2.nombre = "Karla";
        persona2.apellido = "Lara";
        persona2.desplegarInformacion();
    }
}
