
package EjercicioForo;
public class Main_Dni {
    public static void main(String[] args) {
        Dni a = new Dni();
        a.setDNI(12345678);
        System.out.println(a.getDNI() + "\t" + a.getLetra());
        System.out.println(a.getNIF());
    }
}
