package ej06_poo;

public class Ej06_POO {

    public static void main(String[] args) {
        // Instanciamos la clase servicio.
        CafeteraService cafe = new CafeteraService();
        // Instanciamos el objeto, para accedera a los métodos.
        Cafetera inicio = cafe.crearCafetera();
        // Instanciamos los métodos.
        cafe.llenarCafetera(inicio);
        cafe.servirTaza(inicio);
        cafe.vaciarCafetera(inicio);
        cafe.agregarCafe(inicio);
    }
}
