public class SwitchJava {
    public static void main(String[] args){
        var numero = 2;
        var numeroTexto = "Valor desconocido";
        
        switch(numero){
            case 1:
                numeroTexto = "Número uno";
                break;
            case 2:
                numeroTexto = "Número dos";
                break;
            case 3:
                numeroTexto = "Número tres";
                break;
            case 4:
                numeroTexto = "Número cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);// numeroTexto = Número dos
    }
}
