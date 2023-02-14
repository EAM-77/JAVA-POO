/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). 
Los atributos serán el número de DNI (entero largo) y la letra
(String o char) que le corresponde. Dispondrá de los siguientes métodos:
 */
package ej04_pooextra;

public class Ej04_POOextra {

    public static void main(String[] args) {
        NIF letra = new NIF();
        NIFService ns = new NIFService();
        ns.crearNIF();
//        ns.mostrar(letra);
    }
    
}
