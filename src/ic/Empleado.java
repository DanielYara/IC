/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ic;

/**
 *
 * @author Empleado
 */
public class Empleado {
    private String nombre;
    private String apellido;
    private double salario;
    private Departamento revisor;
    private Empleado empleados[];

    public Empleado(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.empleados = new Empleado[10]; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setRevisor(Departamento revisar) {
        this.revisor = revisor;
    }
    
}
