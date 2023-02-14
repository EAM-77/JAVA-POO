/*
La clase service, guarda todos los métodos que implican los procesos a realizar
*/
package Service;

import Entidad.Persona;
import java.util.Scanner;

public class PersonaService {
    
    // inicializo método lector para toda la clase servicio.
    Scanner leer = new Scanner (System.in);
    
    // inicializo método "creador" de objetos.
    public Persona crearPersona (){
        
        Persona sujeto = new Persona ();
        
        System.out.println("Ingresar nombre: ");
            sujeto.setNombre(leer.nextLine());
        System.out.println("Ingresar edad: ");
            sujeto.setEdad(leer.nextInt());
        System.out.println("Ingresar H para hombre, M para mujer, O para binario: ");
            sujeto.setSexo(leer.nextLine());
        System.out.println("Ingrese el peso de la persona: ");
            sujeto.setPeso(leer.nextFloat());
        System.out.println("Ingrese la altura de la persona: ");
            sujeto.setAltura(leer.nextFloat());
        
        System.out.println(sujeto);
        return sujeto;
    }
//    public Persona guardaPersona ();
    
}
