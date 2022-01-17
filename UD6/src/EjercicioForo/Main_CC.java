
package EjercicioForo;
public class Main_CC {
    public static void main(String[] args) {
        
        CuentaCorriente c1 = new CuentaCorriente(290.90, 001);
        
        System.out.println("Cuenta número " + c1.getNumCuenta() + ":\t" + "Saldo: " + c1.getSaldo());
        System.out.println("------");
        c1.setSaldo(-10);
        System.out.println("------");
        c1.setNumCuenta(-1);
        System.out.println(c1.getNumCuenta() + "\t" + c1.getSaldo());
    }
}
