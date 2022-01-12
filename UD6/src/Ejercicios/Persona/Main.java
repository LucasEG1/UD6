package Ejercicios.Persona;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Persona pers1 = new Persona("12345678A", "Lucas Ezequiel", "Gyori", 18);
        Persona pers2 = new Persona("87654321B", "Lionel Manuel", "Tarazon", 38);
        
        pers1.info();
        pers2.info();
        System.out.println(pers1.diferenciaEdad(pers2));
        System.out.println(pers2.diferenciaEdad(pers1));
    }   
}