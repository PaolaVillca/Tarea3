
public class Calculadora
{
    public String ecuacionSegundoG(double a, double b, double c){
     String res;
     double r;
     double x1;
     double x2;
     r = Math.sqrt(Math.pow(b,2) - (4*a*c));
     x1 = (((-1)*b) - r) / (2*a);
     x2 = (((-1)*b) + r) / (2*a);
     res = "x1 = " + x2 + "  ; " + " x2 = " + x1;  
     return res;
    }
    public String ecuacionRecta(double x1, double y1, double x2, double y2){
     String res;
     double m = (y2 - y1) / (x2 - x1);
     double n = y1 + ((m * x1) * (-1));
     m = m*(-1);
     if(n<0){
     res = m * (-1) + "x" + " -y  " + n + " = " + " 0 ";
    }else{
     res = m * (-1) + "x" + " -y  " +  "+" + n + " = " + " 0 ";
    }
     return res;
    }
    public String catetoFaltante(double x, double h){
     String res;
     double y;
     y = Math.sqrt(Math.pow(h,2) - Math.pow(x,2));
     res = "El cateto que falta es: " + y;
     return res;
    }
}
