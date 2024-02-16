/*
 *ITESS-Tics 
 *Enero-Junio 2024
 *Calculo Integral 
 *TI202-LCF
 *12 de febrero 
 *Aproximacion de areas usando sumas, prueba 
 *lizethfloresj80@gmail.com
 */
package Ti.Unidad1.Aproximation;


public class FuctionAproximationTest {
    public static void main (String [] args) {
        FunctionAproximacion fa = new FunctionAproximacion (0.0, 4.0, 4);
        
        fa.compute();
        System.out.println ("area:" + fa.getArea());
    }
    
}
