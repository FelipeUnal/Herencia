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
public class Programador extends Empleado {
    private int lineas_hora;
    private String Lenguaje;

    public Programador(int lineas_hora, String Lenguaje, String Nombre, String ID, double Salario, int Edad, String Estado_Civil) {
        super(Nombre, ID, Salario, Edad, Estado_Civil);
        this.lineas_hora = lineas_hora;
        this.Lenguaje = Lenguaje;
    }

    public void setLineas_hora(int lineas_hora) {
        this.lineas_hora = lineas_hora;
    }

    public void setLenguaje(String Lenguaje) {
        this.Lenguaje = Lenguaje;
    }

    public int getLineas_hora() {
        return lineas_hora;
    }

    public String getLenguaje() {
        return Lenguaje;
    }

    @Override
    public String toString() {
        return "Programador{" + "lineas_hora=" + lineas_hora + ", Lenguaje=" + Lenguaje + '}';
    }

    
}
