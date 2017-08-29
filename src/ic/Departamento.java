/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ic;

/**
 *
 * @author Estudiante
 */
public class Departamento {
    private String nombre;
    private Empleado[] empleados;
    private Empleado director;
    private Empleado revisor;
    private int numEmpleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new Empleado[20];
        this.numEmpleados = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean addEmpleado(Empleado empleado){
        if(this.numEmpleados < 20){
            this.empleados[this.numEmpleados] = empleado;
            this.numEmpleados++;
            return true;
        } else
            return false;
    }
    
    public boolean addDirector(Empleado director){
        this.director = director;
        return true;
    }
    
    public boolean addRevisor(Empleado revisor){
        this.revisor = revisor;
        return true;
    }
    
    public Empleado darDirector(){
        return this.director;
    }
    
}
