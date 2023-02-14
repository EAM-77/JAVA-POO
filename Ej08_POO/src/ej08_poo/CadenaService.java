package ej08_poo;

import java.util.Scanner;

public class CadenaService {
    Scanner read = new Scanner(System.in);
    
    public Cadena crearCadena(){
        Cadena f = new Cadena();
        System.out.println("Ingrese palabra o frase:");
        f.setFrase(read.nextLine());
        f.setLongitud(f.getFrase().length());
        return f;
    }
    public void mostrarVocales(Cadena f){
        int c = 0;
        for (int i = 0; i < f.getLongitud(); i++) {
            if ((f.getFrase().charAt(i)=='a')||(f.getFrase().charAt(i)=='e')||(f.getFrase().charAt(i)=='i')||(f.getFrase().charAt(i)=='o')||(f.getFrase().charAt(i)=='u')){
             c++;
            }
        }
        System.out.println("La frase ingresada tiene " + c + " vocales.");
    }
    public void invertirFrase(Cadena f){
        System.out.println("La frase invertida es: ");
        for (int i = f.getLongitud()- 1; i >= 0; i--) {
            System.out.print(f.getFrase().charAt(i));
        }
        System.out.println("");
    }
    public void vecesRepetido(Cadena f){
        System.out.println("Ingrese el cáracter a buscar:");
        String c = read.nextLine();
        int cont = 0;
        for (int i = 0; i < f.getLongitud(); i++) {
            if (f.getFrase().substring(i, i+1).equalsIgnoreCase(c)) {
                cont++;
            }
        }
        System.out.println("El caracter " + c + ", se repite " + cont + " veces.");
    }
    public void compararLongitud(Cadena f){
        System.out.println("Ingrese una frase o palabra a comparar: ");
        String nf = read.nextLine();
        
        if (f.getLongitud() == nf.length()) {
            System.out.println("Las frases tienen la misma longitud de caracteres.");
        }else
            System.out.println("Las frases no tienen la misma longitud de caracteres.");
    }
}
