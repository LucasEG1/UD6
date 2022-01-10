package Ejercicios.Persona;

public class Persona {
    
    public String dni;
    public String nombre; 
    public String apellidos; 
    public int edad;
    
    public boolean mayoria(int age){
        if (age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
    
    /*public void persona(String d, String name, String surname, int age) {
        this.apellidos = surname;
        this.nombre = name;
        this.edad = age;
        this.dni = d;
    }*/
    
}
