/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Empresa {
    
    private ArrayList<Empleado> empleados;
    
    public Empresa(){
        this.empleados = new ArrayList<>();
    }
    
    public void adicionarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }
    
    public void imprimirLista(){
        for(Empleado empleado: empleados){
            System.out.println(empleado);
        }
    }
}
