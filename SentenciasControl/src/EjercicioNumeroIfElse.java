public class EjercicioNumeroIfElse {
    public static void main(String[] args){
        var numero = 2;
        var numeroTexto = "Numero desconocido";
                
        if( numero == 1 ){
            numeroTexto = "Numero uno";
        } else if( numero == 2 ){
            numeroTexto = "Numero dos";
        } else if( numero == 3 ){
            numeroTexto = "Numero tres";
        } else if( numero == 4 ){
            numeroTexto = "Numero cuatro";
        } else {
            numeroTexto = "Numero no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto); //numeroTexto = Numero dos
    }
}
