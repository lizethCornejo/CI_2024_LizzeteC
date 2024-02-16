/*
 * ITESS-2024
 *Lizzete Cornejo Flores 
 *lizethfloresj80@gmail.com
 * 
 */
package Ti.Unidad1.Aproximation;

public class FunctionAproximacion {
    private double xIni;
    private double xEnd;
    private int n;
    private double dx;
    private double x  [];
    private double fx [];
    private double area;

    public FunctionAproximacion(double xIni, double xEnd, int n) {
        this.xIni = xIni;
        this.xEnd = xEnd;
        this.n = n;
        
        this.x = new double [n+1];
        this.fx = new double [n+1];
    }

    
        public void compute()   {  
            dx =(xEnd - xIni)/n;
            
            area=0.0;
            for (int i =0; 1<=n ; i++){
                x[i] = xIni + i * dx ;
                
                
                fx[i] = x[i] * x[i];
                area=area+fx[i] *dx;
            }
        
      
    }
    
        public double getArea ()  { 
        return area;
    }     
            
        }
    


