package Service;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        
        Persona sujeto = new Persona();
        
        System.out.println("Ingrese el nombre: ");
        sujeto.setName(leer.nextLine());
        
        // creamos las variables que van a formar los datos de clase Date,
        // por requerimiento del método Setter.
        
        System.out.println("Ingrese el día de nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de nacimiento: ");
        int anio = leer.nextInt();
        
        Date fecha = new Date(anio - 1900, mes - 1 , dia);
        sujeto.setFechaNacimiento(fecha);
        
        /*
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha = sdf.parse(leer.next());
       
        p.setF_nac(fecha);

        */
        
        return sujeto;
    }
    public void calcularEdad(Persona n){
        Date fechaActual = new Date();
        
        System.out.println("Edad actual: " + ((int)fechaActual.getYear() - (int)(n.getFechaNacimiento().getYear())));
    }
    public void menorQue(Persona nn, Date fechaCompara){
        
        System.out.println("La persona es mayor?" + nn.getFechaNacimiento().after(fechaCompara));
//        System.out.println(fecha.before(fecha2));
    }

    public void mostrarPersona(Persona nn){
        Date fechaActual = new Date ();
        System.out.println("La persona se llama: " + nn.getName() + " y tiene " + ((int)fechaActual.getYear() - (int)(nn.getFechaNacimiento().getYear()) + "años de edad."));  
    }
}
