package fundamentosvariablesjava;

public class TiposPrimitivosBoolean {

    public static void main(String[] args) {
        //Valores tipo bandera.
        boolean varBoolean = false;
        System.out.println("varBoolean = " + varBoolean); // varBoolean = false
        
        boolean varBoolean2 = true;
        System.out.println("varBoolean2 = " + varBoolean2); // varBoolean2 = true
        
        if(varBoolean){
            System.out.println("La bandera es verdadera");
        } else {
            System.out.println("La bandera es falsa"); //La bandera es falsa
        }
        
        var edad = 20;
        //var esAdulto = edad >=18;
        //System.out.println("esAdulto = " + esAdulto); //esAdulto = true
        
        if(edad >=18){
            System.out.println("Eres mayor de edad"); //Eres mayor de edad
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
