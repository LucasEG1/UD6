
package ArraysObjetos.ArrCoches;

import java.util.Scanner;

public class MainCoche {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Coche[] vCoche = new Coche[3];
        
        //Pide la info de cada coche
        for (int i = 0; i < vCoche.length; i++) {
            
            System.out.println("····|COCHE " + i + "|····");
            
            System.out.println("Modelo:");
            String modelo = leer.nextLine();
            
            System.out.println("Color:");
            String color = leer.nextLine();
            
            System.out.println("Es metalizado? (true / false)");
            boolean esMetalizado = leer.nextBoolean();
            leer.nextLine();
            
            System.out.println("Matrícula:");
            String matricula = leer.nextLine();
            
            System.out.println("Año de fabricación:");
            int aFabricacion = leer.nextInt();
            
            System.out.println("Tipo de coche? (1:MINI, 2:UTILITARIO, 3:FAMILIAR, 4:DEPORTIVO)");
            int tipoCoche = leer.nextInt();
            Coche.tipoCoche tc = null;
            switch (tipoCoche) {
                case 1:
                    tc = Coche.tipoCoche.MINI;
                    break;
                case 2:
                    tc = Coche.tipoCoche.UTILITARIO;
                    break;
                case 3:
                    tc = Coche.tipoCoche.FAMILIAR;
                    break;
                case 4:
                    tc = Coche.tipoCoche.DEPORTIVO;
                    break;
            }
            
            System.out.println("Tipo de seguro? (1:TERCEROS, 2:TODO RIESGO)");
            int tipoSeg = leer.nextInt();
            Coche.modalidadSeguro ts = null;
            switch (tipoSeg) {
                case 1:
                    ts = Coche.modalidadSeguro.TERCEROS;
                    break;
                case 2:
                    ts = Coche.modalidadSeguro.TODO_RIESGO;
                    break;
            }
            leer.nextLine();
            vCoche[i] = new Coche(modelo, color, esMetalizado, matricula, aFabricacion, tc, ts);
        }
        
        System.out.println("==INFO DE CADA COCHE==");
        for (int i = 0; i < vCoche.length; i++) {
            vCoche[i].imprimir();
        }
        
        System.out.println("==CUÁNTOS SON METALIZADOS?==");
        int cuantosMet = 0;
        for (int i = 0; i < vCoche.length; i++) {
            if (vCoche[i].getPintura() == true){
                cuantosMet++;
            }
        }
        System.out.println(cuantosMet);
        
        System.out.println("==CUANTOS FABRICADOS ANTES DEL 2000?==");
        int cuantos2000 = 0;
        for (int i = 0; i < vCoche.length; i++) {
            if (vCoche[i].getAñoFabricacion() < 2000){
                cuantos2000++;
            }
        }
        System.out.println(cuantos2000);
        
        System.out.println("==CUANTOS DE CADA MODALIDAD?==");
        int cuantosTER = 0;
        int cuantosTR = 0;
        for (int i = 0; i < vCoche.length; i++) {
            if (vCoche[i].getSeguro() == Coche.modalidadSeguro.TERCEROS) {
                cuantosTER++;
            }
            if (vCoche[i].getSeguro() == Coche.modalidadSeguro.TODO_RIESGO) {
                cuantosTR++;
            }
        }
        System.out.println("CONTRA TERCEROS: " + cuantosTER);
        System.out.println("CONTRA TODO RIESGO: " + cuantosTR);
    }
}
