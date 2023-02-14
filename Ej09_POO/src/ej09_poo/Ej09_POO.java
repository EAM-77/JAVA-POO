package ej09_poo;

public class Ej09_POO {

    public static void main(String[] args) {
       // Instanciamos un objeto del tipo servicio, para acceder a los métodos del objeto.
       MateService cal = new MateService();
       
       // Instanciamos el objeto para alojar el retorno.
       Mate calculo = cal.crearMate();
       
       // Instanciamos los métodos operativos.
       cal.devolverMayor(calculo);
       cal.calcularPotencia(calculo);
       cal.calculaRaiz(calculo);
    }
}