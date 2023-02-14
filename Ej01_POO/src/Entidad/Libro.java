/*
Prototipo que define atributos y comportamientos (métodos propios) del objeto.
 */
package Entidad;

public class Libro {
    
    // Defino los atributos propios del objeto.
    
    public String ISBN;
    public String Titulo;
    public String Autor;
    public float paginas;
    
    // Defino los métodos de instanciación (creación / construcción) del objeto.
    
    // método constructor por defecto (vácio).
    
    public Libro() {
    }
    // métodod constructor por parámetros.

    public Libro(String ISBN, String Titulo, String Autor, float paginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.paginas = paginas;
    }
    
    // Defino los métodos de consulta (getter) y modificación (setter) de atributos.

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public float getPaginas() {
        return paginas;
    }

    public void setPaginas(float paginas) {
        this.paginas = paginas;
    }

    // Sirve para retornar una impresión con todos sus atributos detallados
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", paginas=" + paginas + '}';
    }
    
}
