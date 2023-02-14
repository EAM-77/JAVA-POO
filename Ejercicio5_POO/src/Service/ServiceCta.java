
package Service;

import Entidad.Cuenta;
import java.util.Scanner;

public class ServiceCta {
    
    Scanner leer = new Scanner (System.in);
    
    public Cuenta crearCta () {
        
        Cuenta cta = new Cuenta ();
    
        System.out.println("Ingrese el número de cuenta: ");
        cta.setNumCta(leer.nextInt());
        System.out.println("Ingrese el documento:");
        cta.setNumDNI(leer.nextLong());
        cta.setSaldoActual(25000);
        
        return cta;
    }
    
    public double deposito (Cuenta cta){
        System.out.println("Ingrese el deposito a realizar: ");
        int deposito = leer.nextInt();
        cta.setSaldoActual(cta.getSaldoActual() + deposito);
        
        return cta.getSaldoActual();        
    }
    
    public int retirar (Cuenta cta){
        System.out.println("Ingrese el monto del retiro:");
        int retiro = leer.nextInt();
        cta.setSaldoActual(cta.getSaldoActual() - retiro);
        
        if (cta.getSaldoActual()<= 0){
            System.out.println("Fondos insuficientes, el saldo actual es: " + cta.getSaldoActual());
        }else{
            System.out.println("Su saldo restante es: " + cta.getSaldoActual());
        }
    return cta.getSaldoActual();
    
    }
    
//    public double retiroFast (Cuenta Cta){
//        
//    }
}


/*
De Adan Mateo para todos 08:54 PM Para calcular personas del ejercicio 7
for (int i = 0; i < personas.length; i++) {

            switch (ps.calcularIMC(personas[i])) {
                case -1:
                    contadorPesoBajo++;
                    break;
                case 0:
                    contadorPesoIdeal++;
                    break;
                case 1:
                    contadorSobrePeso++;
                    break;
            }

            if (ps.esMayorDeEdad(personas[i])) {

                contadorMayorEdad++;

            } else {

                contadorMenorEdad++;
            }

        }

*/