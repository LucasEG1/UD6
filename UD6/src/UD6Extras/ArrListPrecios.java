package UD6Extras;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrListPrecios {
    public static void main(String[] args) {
        
        ArrayList<Double> precios = new ArrayList();
        ArrayList<Double> caros = new ArrayList();
        ArrayList<Double> baratos = new ArrayList();
        
        Scanner leer = new Scanner(System.in);
        
        double a;
        System.out.println("poner precios");
        do {
            a = leer.nextDouble();
            precios.add(a);
        } while (a > 0);
        precios.remove(precios.size()-1);
        
        
        System.out.println("mostrar precios");
        
        for (int i = 0; i < precios.size(); i++) {
            System.out.println(precios.get(i));
        }
        
        
        
        
    }
}
