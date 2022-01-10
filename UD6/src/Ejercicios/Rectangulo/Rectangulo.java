package Ejercicios.Rectangulo;

public class Rectangulo {
    
    public int x1, y1, x2, y2;
    
    public int perim(int x1, int y1, int x2, int y2) {
        int ancho = Math.abs(x2 - x1);
        int alto  = Math.abs(y2-y1);
        int perimetro = (2*alto) + (2*ancho);
        
        return perimetro;
    }
    
    /*public void rectangulo(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }*/
}