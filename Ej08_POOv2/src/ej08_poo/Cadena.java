package ej08_poo;

public class Cadena {
    
    // Atributos
    private String frase;
    private int size;
    
    // Instanciamos método constructor

    public Cadena() {
    }

    public Cadena(String frase, int size) {
        this.frase = frase;
        this.size = size;
    }
    
    // Intanciamos métodos Getter & Setter

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    // Instanciamos método To String

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", size=" + size + '}';
    }
}
