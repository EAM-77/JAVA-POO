package ej08_poo;

import java.util.Scanner;

public class CadenaService {
   Scanner leer = new Scanner(System.in);
   
   public void crearFrase(){
       Cadena frase = new Cadena();
       
       System.out.println("Ingrese una palabra o frase: ");
       frase.setFrase(leer.nextLine());
       frase.setSize(frase.getFrase().length());
    }
   
   public void mostrarVocalesLean(Cadena frase){    
        String vocales[] ={"a","e","i","o","u"};
        int cont=0;
        char caracter;
        String voc="";
        String letra = frase.getFrase();
        
        for (int i = 0; i < frase.getFrase().length(); i++) {
            //caracter=frase.getFrase().charAt(i);
            
            for (int j = 0; j < vocales.length; j++) {
                if (vocales[j].equals(letra.substring(i, (i+1)))) {
                    cont++;
                    voc+=frase.getFrase().charAt(i);            
                } 
            }
        }
        System.out.println("Frase original: "+frase.getFrase());
        System.out.println("La cantidad de vocales son: "+ cont);
        System.out.println("Las vocales fueron: "+voc);    
   }
   
}
