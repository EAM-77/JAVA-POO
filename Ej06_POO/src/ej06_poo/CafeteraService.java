package ej06_poo;

import java.util.Scanner;

public class CafeteraService {
   Scanner read = new Scanner(System.in);
   
   public Cafetera crearCafetera(){
       Cafetera cap = new Cafetera();
       cap.setCapAct(300);
       cap.setCapMax(700);
       return cap;
   }
   
   public void llenarCafetera(Cafetera cap){
       cap.setCapAct(cap.getCapMax());
   }
   public void vaciarCafetera(Cafetera cap){
       cap.setCapAct(0);
   }
   public void agregarCafe(Cafetera cap){
       System.out.println("Ingrese la cantidad de café:");
       cap.setCapAct(read.nextInt());
       if (cap.getCapAct()< cap.getCapMax()) {
           System.out.println("Gracias! ya podes prepararte un rico café.");    
       }else
           System.out.println("han sobrado " + (cap.getCapAct()-cap.getCapMax()) + " gramos de café.");
   }
   public void servirTaza(Cafetera cap){
       System.out.println("Ingresa la capacidad de la tasa: ");
       int tasa = read.nextInt();
       if (cap.getCapAct()<tasa) {
           System.out.println("Se serviarán" + cap.getCapAct()+ " ml de café");
       }else
           System.out.println("Sirviendo café...");
   }
}
