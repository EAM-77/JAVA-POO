package Entidad;

public class Circunferencia {
    
    // atributos
    private double radio;
//    private double area;
//    private double perimetro;
//    private double aux;
    
    /*
        Metodos 
    */

    public Circunferencia() {
    }

    public Circunferencia(double radio, double area, double perimetro, double aux) {
        this.radio = radio;
//        this.area = area;
//        this.perimetro = perimetro;
//        this.aux = aux;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    /* 
    Creo los Getter y Setter del atributo radio; 
    para devolver los cálculos de área y perímetro, como resutado.
    */
    
    public double getArea() {
        return radio * radio * Math.PI;
    }
    
    public double getPerimetro () {
        return 2 * radio + Math.PI;
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
}

       
