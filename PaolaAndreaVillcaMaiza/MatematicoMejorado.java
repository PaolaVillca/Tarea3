
public class MatematicoMejorado
{
   public String calcularValorX1X2(double a, double b, double c){
     String res;
     Calculadora aux = new Calculadora();
     res = aux.ecuacionSegundoG(a, b, c);
    return res;
    }
    public String hallarEcRecta(double x1, double y1, double x2, double y2){
     String res;
     Calculadora aux = new Calculadora();
     res = aux.ecuacionRecta(x1, y1, x2, y2);
     return res;
    }
    public String hallarCatetoFaltante(double x, double h){
     String res;
     Calculadora aux = new Calculadora();
     res = aux.catetoFaltante(x, h);
     return res;
    }
}
