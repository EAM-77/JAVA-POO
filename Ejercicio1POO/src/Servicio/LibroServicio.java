package Servicio;

import Entidad.Libro;
import java.util.Scanner;

public class LibroServicio {
    public Libro crearLibro() {     // función para cargar datos del libro.
 
    
    // invoco método Scanner para leer ingreso de datos.
    Scanner leer = new Scanner (System.in).useDelimiter("\n");  //simbolo de enter.
    // invoco class Libro para acceder a los atributos y métodos.
    Libro book = new Libro (); // invoco al contructor vacío, creando el objeto.
    
        System.out.println("Ingrese los datos del libro...");
        System.out.println("Autor: ");
        book.setAutor(leer.next());
        System.out.println("Titulo: ");
        book.setTítulo(leer.next());
        System.out.println("ISBN: ");
        book.setISBN(leer.next());
        book.setNumPaginas(235);
                
        System.out.println("El nombre del autor es: " + book.getAutor());
        System.out.println("El nombre del libro es: " + book.getTítulo());
        System.out.println("El ISBN del libro es: " + book.getISBN());
        System.out.println("La cantidad de páginas del libro es de: " + book.getNumPaginas());
        
        return book;
    }
}

                                                