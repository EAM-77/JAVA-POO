/*
Esta clase contiene la "entidad" del objeto
*/

package ej04_pooextra;

public class NIF {
    // Defino atributos del objeto
    
    private long dni;
    private String letraNif;
    
    //Istancio constructores

    public NIF() {
    }

    public NIF(long dni, String letraNif) {
        this.dni = dni;
        this.letraNif = letraNif;
    }
    
    // Instancio Getters & Setters

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getLetraNif() {
        return letraNif;
    }

    public void setLetraNif(String letraNif) {
        this.letraNif = letraNif;
    }
    
    // Instancio To String

    @Override
    public String toString() {
        return "NIF{" + "dni=" + dni + ", letraNif=" + letraNif + '}';
    }
    
}
