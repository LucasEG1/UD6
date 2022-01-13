package Ejercicios.Rectangulo;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Rectangulo r1 = Rectangulo.crearRectangulo();
        r1.info();
        System.out.println("Perímetro de r1: " + r1.getPerim() + "uds");
        System.out.println("Area de r1: " + r1.getArea() + "ud²");
    }
}