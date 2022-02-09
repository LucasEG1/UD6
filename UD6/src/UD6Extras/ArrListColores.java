package UD6Extras;

import java.util.ArrayList;

public class ArrListColores {
    
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList();
        
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Naranja");
        colores.add("Blanco");
        
        for (int i = 0; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }
        System.out.println("--------------");
        colores.add("Negro");
        colores.add("Cian");
        colores.add(1, "Amarillo");
        colores.add(2, "Magenta");
        colores.remove(3);
        colores.remove(4);
        
        for (int i = 0; i < colores.size(); i++) {
            System.out.println(colores.get(i));
        }
        
    }
}
