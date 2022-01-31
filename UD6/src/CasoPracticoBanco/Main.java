
package CasoPracticoBanco;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco(100);
        int opcion;
        do {        
            opcion = Func.menu();
            switch (opcion) {
                case 1:
                    System.out.println("== VER CUENTAS ==");
                    banco.mostrarTodos();
                    break;
                case 2:
                    System.out.println("== INGRESAR DINERO ==");
                    banco.ingresar(Func.pedirDouble(), banco.elegirCuenta());
                    break;
                case 3:
                    System.out.println("== RETIRAR DINERO ==");
                    banco.retirar(Func.pedirDouble(), banco.elegirCuenta());
                    break;
                case 4:
                    System.out.println("== TRANSFERIR DINERO ==");
                    banco.transferir(Func.pedirDouble(), banco.elegirCuenta(), banco.elegirCuenta());
                    break;
                case 5:
                    System.out.println("== AGREGAR CUENTA ==");
                    banco.agregarCuenta(Func.crearCuenta(Func.pedirString(), Func.pedirDouble()));
                    break;
                case 6:
                    System.out.println("== ELIMINAR CUENTA ==");
                    banco.eliminarCuenta(banco.elegirCuentaInt());
                    break;
                case 7:
                    System.out.println("== BUSCAR CUENTA POR NOMBRE ==");
                    banco.buscarCuenta();
                    break;
                case 8:
                    System.out.println("== MOSTRAR MOROSOS ==");
                    banco.mostrarMorosos();
                    break;
                case 9:
                    System.out.println("¡Hasta pronto!");
                    break;
            }
            
        } while (opcion != 9);
        
    }
}
