package Entidad;

public class Libro {
    
    // asigno los atributos a la clase Libro.
    
    public String ISBN;
    public String Título;
    public String Autor;
    public int numPaginas;
    
    // inicio método constructor con todos los atributos x parámetros.

    public Libro(String ISBN, String Título, String Autor, int numPaginas) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.numPaginas = numPaginas;
    }
    
    // inicio método constructor vacío.

    public Libro() {
    }
    
    // método SET para cargar o modificar datos de un libro.

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTítulo(String Título) {
        this.Título = Título;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    
    // método para informar los datos del libro.

    public String getISBN() {
        return ISBN;
    }

    public String getTítulo() {
        return Título;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    // Muestra toda la info cargada del obejto en los atributos.
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", T\u00edtulo=" + Título + ", Autor=" + Autor + ", numPaginas=" + numPaginas + '}';
    }
    
}
