package ej09_poo;

import java.util.Scanner;

public class MateService {
    Scanner read = new Scanner(System.in);
    
    public Mate crearMate(){
        Mate obj = new Mate();
        obj.setNum1(Math.random()*100);
        obj.setNum2(Math.random()*100);
        return obj;
    }
    public void devolverMayor(Mate obj){
        System.out.println("El 1er valor es:" + obj.getNum1());
        System.out.println("El 2do valor es:" + obj.getNum2());
        System.out.println("El mayor valor es: " + Math.max(obj.getNum1(), obj.getNum2()));
    }
    public void calcularPotencia(Mate obj){
        double mayor = Math.max(obj.getNum1(), obj.getNum2());
        mayor = Math.floor(mayor);
        double menor = Math.min(obj.getNum1(), obj.getNum2());
        menor = Math.floor(menor);
        System.out.println("La potencia del mayor valor de la clase elevado al menor es: " + Math.pow(mayor, menor));
    }
    public void calculaRaiz(Mate obj){
        double menor = Math.min(obj.getNum1(), obj.getNum2());
        double abs = Math.abs(menor);
        System.out.println("La raíz cuadrada del menor de los dos valores es: " + Math.sqrt(abs));
    }
}
