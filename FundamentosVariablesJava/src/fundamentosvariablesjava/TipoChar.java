package fundamentosvariablesjava;

public class TipoChar {

    public static void main(String[] args) {
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter); // miCaracter = a

        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);// varChar = !
        
        var varChar2 = '\u0021';
        System.out.println("varChar2 = " + varChar2); //varChar2 = !

        char varDecimal = 33;
        System.out.println("varDecimal = " + varDecimal); //varDecimal = !
        
        var varDecimal2 = 33;
        System.out.println("varDecimal2 = " + varDecimal2); // varDecimal2 = 33

        char varCharsimbolo = '!';
        System.out.println("varCharsimbolo = " + varCharsimbolo); //varCharsimbolo = !
        
        var varCharsimbolo2 = '!';
        System.out.println("varCharsimbolo2 = " + varCharsimbolo2); //varCharsimbolo2 = !
        
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo); // variableEnteraSimbolo = 33
        
        int letra = 'A';
        System.out.println("letra = " + letra); //letra = 65
        
        int letra2 = 'a';
        System.out.println("letra2 = " + letra2); //letra = 97
    }
}
