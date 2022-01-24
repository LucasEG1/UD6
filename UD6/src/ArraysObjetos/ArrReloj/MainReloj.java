
package ArraysObjetos.ArrReloj;

import java.util.Scanner;

public class MainReloj {
    public static void main(String[] args) {
    
        Reloj r1 = new Reloj(0, 0, 0);
        Reloj r2 = new Reloj(0, 0, 59);
        Reloj r3 = new Reloj(0, 59, 0);
        Reloj r4 = new Reloj(0, 59, 59);
        Reloj r5 = new Reloj(23, 0, 0);

        r1.imprimeHora();
        r2.imprimeHora();
        r3.imprimeHora();
        r4.imprimeHora();
        r5.imprimeHora();
        System.out.println("-------");
        r1.tick();
        r2.tick();
        r3.tick();
        r4.tick();
        r5.tick();
        
        r1.imprimeHora();
        r2.imprimeHora();
        r3.imprimeHora();
        r4.imprimeHora();
        r5.imprimeHora();
        System.out.println("-------");
        r1.tickS(60);
        r2.tickS(60);
        r3.tickS(60);
        r4.tickS(60);
        r5.tickS(60);
        
        r1.imprimeHora();
        r2.imprimeHora();
        r3.imprimeHora();
        r4.imprimeHora();
        r5.imprimeHora();
        System.out.println("-------");
        r1.tickS(3600);
        r2.tickS(3600);
        r3.tickS(3600);
        r4.tickS(3600);
        r5.tickS(3600);
        
        r1.imprimeHora();
        r2.imprimeHora();
        r3.imprimeHora();
        r4.imprimeHora();
        r5.imprimeHora();
        
        int x = 1;
        
        Scanner leer = new Scanner(System.in);
        
        int a = leer.nextInt();
        
        
    }
    
}
