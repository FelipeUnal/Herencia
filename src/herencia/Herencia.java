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
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Empleado e1 =  new Empleado("Osmar", "123456789", 3200000.0, 24, "Soltero");
        Programador p1 = new Programador(900, "Java y C++","Marcela", "123356789", 3200000.0, 24, "Soltero");
        Director d1 =  new Director(10, "Fabian", "123345567", 10000000.0, 30,"Casado");
        Empresa Empresa = new Empresa();
        Empresa.adicionarEmpleado(e1);
        Empresa.adicionarEmpleado(p1);
        Empresa.adicionarEmpleado(d1);
        Empresa.imprimirLista();
    }
}
