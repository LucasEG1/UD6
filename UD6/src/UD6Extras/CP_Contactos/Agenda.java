package UD6Extras.CP_Contactos;

import java.util.ArrayList;


public class Agenda {

    // Atributos
    //private Contacto[] conts;
    private ArrayList<Contacto> contactos;
    int cuantos;

    // Constructor. Crea una agenda vacía.
    public Agenda() {
        contactos = new ArrayList();
        cuantos = 0;
    }

    // GETTERS
    ArrayList getContactos() {
        return contactos;
    }
    int getCuantos() {
        return cuantos;
    }
    
    // Agrega un objeto tipo contacto a la agenda (lo añade al vector y cuantos++)
    void agregarContacto(Contacto c) {
        // Si la agenda no está llena y no existe un contacto con ese nombre
        if (!comprobarSiExiste(c.getNombre())) {
            contactos.add(c);
            cuantos++;
        }
    }

    // Elimina el contacto en la posición ‘pos’ (lo quita del vector y cuantos--)
    void eliminarContacto(int pos) {
        contactos.remove(contactos.get(pos));
        cuantos--;
    }

    // Comprueba si existe algún contacto que se llame exactamente como 'nombre'. Devuelve true/false.
    boolean comprobarSiExiste(String nombre) {
        for (int i = 0; i < cuantos; i++) {
            if (contactos.get(i).getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }
    /**
    //Versión 1: Devuelve un int[] con las posiciones del vector ‘conts’ cuyo nombre contiene ‘nombre’
     ArrayList buscarNombreV1(String str) {

        
        // Vector de posiciones
        ArrayList<Contacto> coincidencias = new ArrayList();

        // Recorremos 'conts' buscando los conts cuyo nombre contiene 'str'
        for (int i = 0; i < cuantos; i++) {
            if (contactos.get(i).getNombre().toUpperCase().contains(str.toUpperCase())) {
                coincidencias.add(contactos.get(i));
            }
        }
        return coincidencias;
    }

    //Versión 2: Devuelve un vector de Contactos con los conts cuyo nombre contiene ‘str’
    Contacto[] buscarNombreV2(String str) {

        // Vector de conts
        Contacto[] vcon = new Contacto[conts.length];
        // Número de conts encontrados
        int ncon = 0;

        // Recorremos 'conts' buscando los conts cuyo nombre contiene 'str'
        // Guardaremos en 'vcon' los conts que coincidan con la búsqueda
        for (int i = 0; i < cuantos; i++) {
            if (conts[i].getNombre().toUpperCase().contains(str.toUpperCase())) {
                vcon[ncon] = conts[i];
                ncon++;
            }
        }

        // Reducimos el tamaño de 'vcon' al mínimo y lo devolvemos
        vcon = Arrays.copyOf(vcon, ncon);
        return vcon;
    } */

    //Versión 3: Devuelve una agenda con los conts cuyo nombre contiene ‘str’
    Agenda buscarNombreV3(String str) {

        // Agenda temporal donde guardaremos los conts encontrados
        Agenda at = new Agenda();

        // Recorremos 'conts' buscando los conts cuyo nombre contiene 'str'
        // Guardaremos en la agenda 'a' los conts que coincidan con la búsqueda
        for (int i = 0; i < cuantos; i++) {
            if (contactos.get(i).getNombre().toUpperCase().contains(str.toUpperCase())) {
                at.agregarContacto(contactos.get(i));
            }
        }

        // Devolvemos la agenda
        return at;
    }
    
    // Devuelve una agenda con los conts cuyo teléfono contienen ‘str’
    Agenda buscarTelefono(String str) {

        // Agenda temporal donde guardaremos los conts encontrados
        Agenda at = new Agenda();

        // Recorremos 'conts' buscando los conts cuyo teléfono contiene 'str'
        // Guardaremos en la agenda 'a' los conts que coincidan con la búsqueda
        for (int i = 0; i < cuantos; i++) {
            if (contactos.get(i).getTelefono().toUpperCase().contains(str.toUpperCase())) {
                at.agregarContacto(contactos.get(i));
            }
        }

        // Devolvemos la agenda
        return at;
    }
    
    // Devuelve una agenda con los conts cuyo correo contienen ‘str’
    Agenda buscarCorreo(String str) {

        // Agenda temporal donde guardaremos los conts encontrados
        Agenda at = new Agenda();

        // Recorremos 'conts' buscando los conts cuyo correo contiene 'str'
        // Guardaremos en la agenda 'a' los conts que coincidan con la búsqueda
        for (int i = 0; i < cuantos; i++) {
            if (contactos.get(i).getCorreo().toUpperCase().contains(str.toUpperCase())) {
                at.agregarContacto(contactos.get(i));
            }
        }

        // Devolvemos la agenda
        return at;
    }
    
    // Devuelve una agenda con los conts cuyo nombre, teléfono o correo contienen ‘str’
    Agenda buscarGlobal(String str) {

        // Agenda temporal donde guardaremos los conts encontrados
        Agenda at = new Agenda();

        // Recorremos 'conts' buscando los conts cuyos datos contienen 'str'
        // Guardaremos en la agenda 'a' los conts que coincidan con la búsqueda
        for (int i = 0; i < cuantos; i++) {
            if (contactos.get(i).getAll().toUpperCase().contains(str.toUpperCase())) {
                at.agregarContacto(contactos.get(i));
            }
        }
        // Devolvemos la agenda
        return at;
    }

    // Imprime la información de todos los conts
    void imprimirTodos() {
        for (int i = 0; i < cuantos; i++) {
            System.out.print(i + " ");
            contactos.get(i).imprimir();
        }
    }
}
