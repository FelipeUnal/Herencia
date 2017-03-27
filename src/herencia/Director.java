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
public class Director extends Empleado{
    private int AñosExperiencia;

    public Director(int AñosExperiencia, String Nombre, String ID, double Salario, int Edad, String Estado_Civil) {
        super(Nombre, ID, Salario, Edad, Estado_Civil);
        this.AñosExperiencia = AñosExperiencia;
    }

    public int getAñosExperiencia() {
        return AñosExperiencia;
    }

    public void setAñosExperiencia(int AñosExperiencia) {
        this.AñosExperiencia = AñosExperiencia;
    }

    @Override
    public String toString() {
        return "Director{" + "A\u00f1osExperiencia=" + AñosExperiencia + '}';
    }
    
    
}
