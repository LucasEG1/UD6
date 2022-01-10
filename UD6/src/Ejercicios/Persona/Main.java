package Ejercicios.Persona;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona pers1 = new Persona();
        
        System.out.println("Introduce tu nombre:");
        pers1.nombre = leer.nextLine();
        
        System.out.println("Apellido(s)");
        pers1.apellidos = leer.nextLine();
        
        System.out.println("DNI");
        pers1.dni = leer.nextLine();
        
        System.out.println("Edad:");
        pers1.edad = leer.nextInt();
        
        
        
        Persona pers2 = new Persona();
        leer.nextLine();
        System.out.println("Introduce tu nombre:");
        pers2.nombre = leer.nextLine();
        
        System.out.println("Apellido(s)");
        pers2.apellidos = leer.nextLine();
        
        System.out.println("DNI");
        pers2.dni = leer.nextLine();
        
        System.out.println("Edad:");
        pers2.edad = leer.nextInt();
        
        
        System.out.println(pers1.nombre + " " + pers1.apellidos + "\n"
                + "DNI: " + pers1.dni + ". Es mayor de edad? " + pers1.mayoria(pers1.edad));
        
        System.out.println(pers2.nombre + " " + pers2.apellidos + "\n"
                + "DNI: " + pers2.dni + ". Es mayor de edad? " + pers2.mayoria(pers2.edad));
    }   
}