/*
Clase auxiliar que nos permite realizar operaciones con los objetos (creación, modificación 
y operaciones).
*/
package Service;

import Entidad.Libro;
import java.util.Scanner;

public class LibroService {
    
    // Instanciamos el objeto Scanner para leer los datos ingresados
    Scanner leer = new Scanner (System.in);
    
    public Libro crearLibro (){
        
        // Instaciamos un objeto libro con sus atributos vacios.
        Libro book = new Libro ();
        
        // Solicitamos el ingreso de datos por consola, para cada atributo del objeto
        System.out.println("Ingrese el ISBN:");
            book.setISBN(leer.nextLine());
        System.out.println("Ingrese el título del libro: ");
            book.setTitulo(leer.nextLine());
        System.out.println("Ingrese el nombre del autor: ");
            book.setAutor(leer.nextLine());
        System.out.println("Ingrese la cantidad de páginas: ");
            book.setPaginas(leer.nextFloat());
            
        return book;
    }
    public void mostrarLibro (Libro book){  // parametro de tipo Libro
        
        System.out.println("Los datos del libro son:");
        System.out.println(book);
    }
}