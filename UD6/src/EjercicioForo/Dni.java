package EjercicioForo;

public class Dni {
    private int dni;
    
    //Constructor [no se pide]
    //Getters - Setters
    public int getDNI(){
        return this.dni;
    }
    public char getLetra(){
        char[] letra = new char[]{'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letra[dni%23];
    }
    public String getNIF(){
        String NIF = Integer.toString(this.getDNI()) + getLetra();
        return NIF;
    }
    public void setDNI(int dni){
        this.dni = dni;
    }
    //Otras funciones
    public void imprime(){
        System.out.println(getNIF());
    }
}
