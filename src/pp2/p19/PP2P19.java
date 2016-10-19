/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p19;
import java.util.*;
/**
 *
 * @author Osvaldo
 */
public class PP2P19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        double b,c,d;
        //Uso variable tipo double para calcular seno, coseno y tangente porque tiene decimales muy grandes
        a = pedirAngulo();
        b = calcularSeno(a);
        c = calcularCoseno(a);
        d = calcularTangente(a);
        mostrar(a,b,c,d);
    }
    public static int pedirAngulo(){
        int n;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escriba un angulo ");
        return n = entrada.nextInt();
    }
    public static double calcularSeno(int a){
        double b=0;
        return b = Math.sin(a);
        //Asi de simple es la formula para calcular el seno
    }
    public static double calcularCoseno(int a){
        double b = 0;
        return b = Math.cos(a);
        //En el mismo renglon regreso y calculo b
    }
    public static double calcularTangente(int a){
        double b = 0;
        return b = Math.tan(a);
    }
    public static void mostrar(int a, double b, double c, double d){
        System.out.println("Con el angulo " +a +" el coseno es = " +b +" el coseno es = " +c +" y la tangente es = " +d) ;
    }
}
