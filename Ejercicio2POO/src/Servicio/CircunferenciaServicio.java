
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

public class CircunferenciaServicio {
    
       Scanner leer = new Scanner (System.in);
       
    // creamos un método que retorne un objeto de tipo Circunferencia.
      
    public Circunferencia crearCircunferencia(){
        
        /* Instanciamos un objeto de tipo Circunferencia.
           tener en cuenta que el objeto c1, contiene los atributos vacios.
        */
        Circunferencia c1 = new Circunferencia();
        
        /* lleno el atributo solicitando la información por teclado
           como necesito "leer" el dato a ingresar, habilito el método Scanner.
        */
        
        System.out.println("Ingrese el radio de la circunferencia: ");
        
        /* Para poder "leer" el dato ingresado, tengo que "Setearlo" como puede observarse
        en la instrucción seguida del punto.
        */
        c1.setRadio(leer.nextDouble());
        
        // retornamos el nuevo valor del objeto
        return c1;
    }
}