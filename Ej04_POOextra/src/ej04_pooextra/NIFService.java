/*
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.

La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el número
de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe buscar en
un array (vector) de caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente, según tabla informada.
 */
package ej04_pooextra;

import java.util.Scanner;


public class NIFService {
    Scanner leer = new Scanner(System.in);
    
    public NIF crearNIF (){
        NIF letra = new NIF ();
        String arregloA[] = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        
        System.out.println("Por favor, ingrese el DNI:");
        letra.setDni(leer.nextLong());
        
        int resto = ((int) letra.getDni()%23);
        
        letra.setLetraNif(arregloA[resto]);
        System.out.println(letra.getDni()+ "-" + letra.getLetraNif());
        return letra;
    }
    public void mostrar(NIF letra){
        System.out.println(letra.getDni()+ "-" + letra.getLetraNif());
    }
}
