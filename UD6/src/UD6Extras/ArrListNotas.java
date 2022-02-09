package UD6Extras;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrListNotas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Integer> notas = new ArrayList();
        
        int resp;
        double total = 0;
        boolean hay10 = false;
        boolean hay0 = false;
        int cuantosSusp = 0;
        
        do {
            resp = leer.nextInt();
            notas.add(resp);
        } while (resp != -1);
        notas.remove(notas.size()-1);
        
        
        System.out.println("Todas las notas:");
        for (int i = 0; i < notas.size(); i++) {
            System.out.println(notas.get(i));
            total += notas.get(i);
            
            if(notas.get(i) < 5)
                cuantosSusp++;
            
            if(notas.get(i) == 10)
                hay10 = true;
            
            if(notas.get(i) == 0)
                hay0 = true;
            
        }
        
        System.out.println("Hay algún 0? " + hay0);
        System.out.println("Hay algún 10? " + hay10);
        System.out.println("Hay " + cuantosSusp + " alumnos suspendidos");
        System.out.println("Media: " + total/notas.size());
    }
    
}
