import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class EjemploPractica{
 
    public static void main(String[] args){
        String usuario = "Juan";
        String titulo = "Ingeniero";

        var union = titulo + " " + usuario;
        System.out.println("Union = " + union);

        var num = 3;
        var num2 = 4;

        System.out.println(num + num2); // se realiza la suma de numeros
        System.out.println(num + num2 +" "+ usuario); //  Se hace la suma de 3 +4 y posterior mente se agrega el nombre de "Juna"
        System.out.println(usuario +" "+  num + num2 ); // Nose realiza la suma, se hace una concatenacion


    }
}
