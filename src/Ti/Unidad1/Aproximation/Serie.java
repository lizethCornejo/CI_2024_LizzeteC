/*requirimiento,modelo UML o diseño Gui, Desarrollo/Codificasion, Prueba 

 * ITESS-TICS
 *ENERO-JUNIO 2024
 *Calculo Integral 
 *unidad1-Teorema Fundamental 
 *lizethfloresj80@gmail.com
 *16/02/24 
 */
package Ti.Unidad1.Aproximation;


public class Serie {
   private int iIni;
   private int iEnd;
   private  int n;
   private int i  [] ;
   private  int f [];
   private int suma;

    public Serie(int iIni, int iEnd) {
        this.iIni = iIni;
        this.iEnd = iEnd;
        
        n= iEnd-iIni +1;
        i=new int  [n];
        f=new int  [n];
        
    }

    Serie(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    public void compute(){
        int index= 0;
        suma =0;
        for (int i =iIni; i<=iEnd; i++){
            this.i[index]= i;
            this.f [index] = 2*i*i-2*i;
            suma += f [index];
            index ++;
            
        }
        
    }
         public void print (){
             System.out.println("indez | i |  f");
             for (int index =0; index <n; index++){
             System.out.println(index  + " | " + i [index] + " | " + f [index]);
             
             }
         System.out.println("suma:" + suma);
         }
}

