import java.util.Scanner;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

public class CapturaInfo
{
    //Metodo de capturar atributos cadenas: nombre, apellido ,id number, 
    public static String captureStrings(String msg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("" + msg + ": " ); 
        return sc.nextLine();
    }//Fin del metodo

    //Metodo de capturar edad de una persona
    public static int captureInt(String msg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("" + msg + ": " ); 
        return sc.nextInt();
    }// fin del metodo

    //Metodo de capturar salario
    public static double captureDouble(String msg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("" + msg + ": " ); 
        return sc.nextDouble();
    }
}