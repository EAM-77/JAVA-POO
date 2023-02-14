package Entidad;

import java.util.Date;

public class Persona {
    // Atributos
    
    private String name;
    private Date fechaNacimiento;
    
    // Métodos constructores

    public Persona() {
    }

    public Persona(String name, Date fechaNacimiento) {
        this.name = name;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    // Getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    // Método to String

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
}
