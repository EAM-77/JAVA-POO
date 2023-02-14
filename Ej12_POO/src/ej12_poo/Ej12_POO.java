/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente forma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.


 +++++ REVISAR LOS ULTIMOS METODOS Y MEJORAR EL CODE! +++++
 */
package ej12_poo;

import Entidad.Persona;
import Service.PersonaService;
import java.util.Date;
import java.util.Scanner;

public class Ej12_POO {

    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        
        PersonaService ps = new PersonaService();
        
        Persona juan = ps.crearPersona();
        
        ps.calcularEdad(juan);
        
        System.out.println("Ingrese el día de comparación: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de comparación : ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de comparación: ");
        int anio = leer.nextInt();
        
        Date fecha = new Date(anio - 1900, mes - 1 , dia);

        ps.menorQue(juan, fecha);
    }
}
