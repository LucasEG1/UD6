
package EjercicioForo;
public class Main_Reloj {
    
    public static void main(String[] args) {
        
        Reloj r1 = new Reloj(23, 58, 58);
        System.out.println("--Reloj 1--");
        r1.imprimeHora();
        r1.tick();
        r1.imprimeHora();
        r1.tick();
        r1.imprimeHora();
        
        System.out.println("--Reloj 2--");
        
        Reloj r2 = new Reloj(23, 59, 58);
        r2.imprimeHora();
        r2.tick();
        r2.imprimeHora();
        r2.tick();
        r2.imprimeHora();
        
        System.out.println("--Reloj 3--");
        
        Reloj r3 = new Reloj(14, 44, 24);
        r3.imprimeHora();
        r3.imprimeHora12();
        
        System.out.println("--Reloj 4--");
        
        Reloj r4 = new Reloj(11, 59, 59);
        r4.imprimeHora();
        r4.imprimeHora12();
        r4.tick();
        r4.imprimeHora();
        r4.imprimeHora12();
    }
}
