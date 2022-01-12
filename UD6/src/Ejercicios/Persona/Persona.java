package Ejercicios.Persona;

public class Persona {
    
    private String dni;
    private String nombre; 
    private String apellidos; 
    private int edad;
    
    //Constructor
    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    //Getters - Setters
    public String getDni() {
        return this.dni;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    public int getEdad() {
        return this.edad;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    //Otras funciones
    public boolean esMayorEdad(int edad){
        if (edad >= 18){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean esJubilado(int edad) {
        if (edad < 65)
            return false;
        else 
            return true;
    }
    public void info () {
        System.out.println("DNI: " + this.getDni() + 
                            "\nNombre(s): " + this.getNombre() + 
                            "\nApellido(s): " + this.getApellidos() +
                            "\nEdad: " + this.getEdad() + " años.");
        System.out.println("");
    }
    public int diferenciaEdad (Persona p) {
        
        int dif = Math.abs(p.getEdad() - this.getEdad());
        return dif;
    }
}