/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.herencia;
import java.util.Scanner;
/**
 *
 * @author Estudiante
 */
public class Estudiante extends Persona{
    private String Materia;
    private double Nota1;
    private double Nota2;
    private double Nota3;
    private double Nota4;
    private Profesor Profesor;
    private int Semestre;
    java.util.Scanner ElTecla = new java.util.Scanner(System.in);

    public Estudiante(String Materia, double Nota1, double Nota2, double Nota3, double Nota4, Profesor Profesor, int Semestre, String ID, String Nombre, String Direccion, int Telefono) {
        super(ID, Nombre, Direccion, Telefono);
        this.Materia = Materia;
        this.Nota1 = Nota1;
        this.Nota2 = Nota2;
        this.Nota3 = Nota3;
        this.Nota4 = Nota4;
        this.Profesor = Profesor;
        this.Semestre = Semestre;
    }

    public void setMateria(String Materia) {
        this.Materia = Materia;
    }

    public void setNota1(double Nota1) {
        this.Nota1 = Nota1;
    }

    public void setNota2(double Nota2) {
        this.Nota2 = Nota2;
    }

    public void setNota3(double Nota3) {
        this.Nota3 = Nota3;
    }

    public void setNota4(double Nota4) {
        this.Nota4 = Nota4;
    }

    public void setProfesor(Profesor Profesor) {
        this.Profesor = Profesor;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    
    


    public String getMateria() {
        return Materia;
    }

    public double getNota1() {
        return Nota1;
    }

    public double getNota2() {
        return Nota2;
    }

    public double getNota3() {
        return Nota3;
    }

    public double getNota4() {
        return Nota4;
    }

    public Profesor getProfesor() {
        return Profesor;
    }

    public int getSemestre() {
        return Semestre;
    }

    public String getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }
    
    public double PAPA(){
        return (Nota1+Nota2+Nota3+Nota4)/4.0;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "Materia=" + Materia + ", Nota1=" + Nota1 + ", Nota2=" + Nota2 + ", Nota3=" + Nota3 + ", Nota4=" + Nota4 + ", Profesor=" + Profesor + ", Semestre=" + Semestre + '}';
    }

}
