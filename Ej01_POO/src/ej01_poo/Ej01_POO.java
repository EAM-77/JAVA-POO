/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package ej01_poo;

import Entidad.Libro;
import Service.LibroService;

public class Ej01_POO {

    public static void main(String[] args) {
       
        // Instancio un objeto del tipo servicio para acceder a sus métodos
        
        LibroService bookA = new LibroService ();
        
        // alojamos el retorno del método en un objeto tipo Libro.
        
        Libro newbook = bookA.crearLibro();
    }
}
