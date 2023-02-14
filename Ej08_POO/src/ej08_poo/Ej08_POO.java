package ej08_poo;

public class Ej08_POO {

    public static void main(String[] args) {
        //Instanciamos un objeto del tipo servicio, para acceder a los métodos operativos.
        CadenaService fr = new CadenaService();
        // Instanciamos el objeto, para alojar el retorno y poder pasarlo por paráemtro en los métodos.
        Cadena f = fr.crearCadena();
        
        // llamamos a los métodos operativos, pasandole por parámetro el objeto.
        fr.mostrarVocales(f);
        fr.invertirFrase(f);
        fr.vecesRepetido(f);
        fr.compararLongitud(f);
    }
}
