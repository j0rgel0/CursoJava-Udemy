package fundamentosvariablesjava;

public class CaracteresEspeciales {
    public static void main(String[] args){
        var nombre = "Karla";
        System.out.println("Nueva linea: \n"+nombre);
        /*
            Nueva linea: 
            Karla
        */
        
        System.out.println("Tabulador: \t"+nombre);
        /*
        Tabulador: 	Karla
        */
        
        System.out.println("Retroceso: \b"+nombre);
        /*
        Retroceso:Karla
        */
                
        System.out.println("Retroceso: \b\b"+nombre);
        /*
        RetrocesoKarla
        */
        
        System.out.println("Comilla simple: \'" + nombre + "\'");
        /*
        Comilla simple: 'Karla'
        */        
        
        System.out.println("Comilla doble: \"" + nombre + "\"");
        /*
        Comilla doble: "Karla"
        */
        
    }
}
