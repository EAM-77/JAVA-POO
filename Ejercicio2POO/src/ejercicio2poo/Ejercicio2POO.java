/**
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = Pi ∗ radio al cuadrado).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ Pi ∗ radio).
 */
package ejercicio2poo;

import Entidad.Circunferencia;
import Servicio.CircunferenciaServicio;

public class Ejercicio2POO {

    public static void main(String[] args) {
        
        CircunferenciaServicio c1 = new CircunferenciaServicio();
        Circunferencia newCirculo = new Circunferencia();
        newCirculo = c1.crearCircunferencia();
        
        System.out.println("El circulo es de radio " + newCirculo.getRadio());
        System.out.println("El área del circulo es: " + newCirculo.getArea());
        System.out.println("El perímetro del circulo es:" + newCirculo.getPerimetro());
    }
}
