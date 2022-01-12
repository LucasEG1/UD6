package Ejercicios.Rectangulo;

import java.util.Scanner;

public class Rectangulo {
    
    private int x1, y1, x2, y2;
    
    //Constructor
    public Rectangulo (int x1, int y1, int x2, int y2) {
        if (x2 < x1 || y2 < y1){
            System.err.println("Error al crear objeto: Los parámetros especificados no son válidos.");
        } else {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }
    
    //Getters - Setters
    public int getX1() {
        return this.x1;
    }
    public int getX2() {
        return this.x2;
    }
    public int getY1() {
        return this.y1;
    }
    public int getY2() {
        return this.y2;
    }
    
    public void setX1(int x1) {
        if (x1 < this.getX2())
            System.err.println("Error: X1 no puede ser mayor que X2");
        else
            this.x1 = x1;
    }
    public void setX2(int x2) {
        if (x2 < this.getX1())
            System.err.println("Error: X2 no puede ser menor que X1");
        else
            this.x2 = x2;
    }
    public void setY1(int y1) {
        if (y1 > this.getY2())
            System.err.println("Error: Y1 no puede ser mayor que Y2");
        else
            this.y1 = y1;
    }
    public void setY2(int y2) {
        if (y2 < this.getY1())
            System.err.println("Error: Y2 no puede ser menor que Y1");
        else
            this.y2 = y2;
    }
    
    //Otras funciones
    public static Rectangulo crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Introduce x1:");
        int x1 = leer.nextInt();
        
        System.out.print("Introduce y1:");
        int y1 = leer.nextInt();
        
        System.out.print("Introduce x2:");
        int x2 = leer.nextInt();
        
        System.out.print("Introduce y2:");
        int y2 = leer.nextInt();
        
        Rectangulo rec = new Rectangulo(x1, y1, x2, y2);
        return rec;
    }
    public int perim(int x1, int y1, int x2, int y2) {
        
        int ancho = Math.abs(x2 - x1);
        int alto  = Math.abs(y2-y1);
        int perimetro = (2*alto) + (2*ancho);
        
        return perimetro;
    }
    public int area(int x1, int y1, int x2, int y2) {
        
        int base = Math.abs(x2 - x1);
        int altura  = Math.abs(y2-y1);
        int area = base*altura;
        return area;
    }
    public void info(){
        System.out.println("Información del rectángulo: ");
        System.out.println("Coordenada X inferior izq: " + this.getX1());
        System.out.println("Coordenada Y inferior izq: " + this.getY1());
        System.out.println("Coordenada X superior dcha: " + this.getX2());
        System.out.println("Coordenada Y superior dcha: " + this.getY2());
    }
    public void setX1Y1(int x, int y){
        this.setX1(x);
        this.setY1(y);
    }
    public void setX2Y2(int x, int y){
        this.setX2(x);
        this.setY2(y);
    }
    public void setAll(int x1, int y1, int x2, int y2){
        if (x2 < x1 || y2 < y1){
            System.err.println("Error al crear objeto: Los parámetros especificados no son válidos.");
        }
        this.setX1(x1);
        this.setY1(y1);
        this.setX2(x2);
        this.setY2(y2);
    }
}