
package Ejercicios.Punto;

public class Punto {
    private int x;
    private int y;
    
    // Constructor
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    // Getters - Setters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    // Otras funciones
    public void imprime() {
        System.out.println("Las coordenadas son: (" + getX() + "," + getY() + ")");
    }
    public void setXY(int x, int y) {
        this.x = x; 
        this.y = y;
    }
    public void desplaza(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
    public int distancia(Punto p) {
        
        int distanciaX = p.getX() - x;
        int distanciaY = p.getY() - y;
        
        int distanciaDiagonal = (int) Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
        return distanciaDiagonal;
    }
    public static Punto creaPuntoAleatorio() {
        
        int ranX = (int)(Math.random()*(201)-100);
        int ranY = (int)(Math.random()*(201)-100);
        
        Punto a = new Punto(ranX, ranY);
        return a;
    }
}