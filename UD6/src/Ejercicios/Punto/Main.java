
package Ejercicios.Punto;

public class Main {
    
    public static void main(String[] args) {
        
        Punto pt1 = new Punto(6, 7);
        Punto pt2 = new Punto(10, 10);
        Punto pt3 = new Punto(-3, 7);
        
        pt2.setXY(5, 5);
        pt2.imprime();
        System.out.println(pt1.distancia(pt2));
    }
}
