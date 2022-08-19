package fundamentosvariablesjava;

public class ConcatenacionJava {

    public static void main(String[] args) {
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        // Se realiza la lectura de izquierda a derecha
        // Se realiza la suma y luego al detectar la cadena se concatena.
        System.out.println(i + j + usuario); // 7Juan
        
        //Contexto cadena, detecta la cadena y no realiza la suma
        System.out.println(usuario + i + j); //Juan34
        
        // Se puede afectar la prioridad, los paréntesis 
        // tiene la máxima priodidad
        System.out.println(usuario + (i + j)); //Juan7

    }
}
