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
public class Arquitecto extends Empleado{
    private int  CantidaddePoryectos;

    public Arquitecto(int CantidaddePoryectos, String Nombre, String ID, double Salario, int Edad, String Estado_Civil) {
        super(Nombre, ID, Salario, Edad, Estado_Civil);
        this.CantidaddePoryectos = CantidaddePoryectos;
    }

    public void setCantidaddePoryectos(int CantidaddePoryectos) {
        this.CantidaddePoryectos = CantidaddePoryectos;
    }

    public int getCantidaddePoryectos() {
        return CantidaddePoryectos;
    }

    @Override
    public String toString() {
        return "Arquitecto{" + "CantidaddePoryectos=" + CantidaddePoryectos + '}';
    }
    
    

   
    
    
}
