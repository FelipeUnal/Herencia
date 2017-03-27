/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Estudiante
 */
public class Empleado {
    private String Nombre;
    private String ID;
    private double Salario;
    private int Edad;
    private String Estado_Civil;

    public Empleado(String Nombre, String ID, double Salario, int Edad, String Estado_Civil) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.Salario = Salario;
        this.Edad = Edad;
        this.Estado_Civil = Estado_Civil;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getID() {
        return ID;
    }

    public double getSalario() {
        return Salario;
    }

    public int getEdad() {
        return Edad;
    }

    public String getEstado_Civil() {
        return Estado_Civil;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setEstado_Civil(String Estado_Civil) {
        this.Estado_Civil = Estado_Civil;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Nombre=" + Nombre + ", ID=" + ID + ", Salario=" + Salario + ", Edad=" + Edad + ", Estado_Civil=" + Estado_Civil + '}';
    }
    
}
