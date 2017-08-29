/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ic;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class IC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        Empresa empresa = new Empresa("nyn", 123);
        
        int continuar = 0, opcion = 0;
        // TODO code application logic here
        do {
            System.out.println("1. Crear empleado");
            System.out.println("2. Crear Empleado");
            System.out.println("3. Listar Departamentos");
            opcion = k.nextInt();
            if (opcion == 1) {
                System.out.println("Nombre de Departamento");
                String nombre = k.next();
                Departamento nuevo = new Departamento(nombre);
                if(empresa.addDepartamento(nuevo)){
                    System.out.println("Se agrego satisfactoriamente");
                } else
                    System.out.println("Problemas al registrar el departamento");
            } else if (opcion == 2) {
                
            } else if (opcion == 3) {
                ArrayList<Departamento> departamentos = empresa.listarDepartamentos()
                 for(Departamento departamento : departamentos){
                     System.out.println(departamento.getNombre());
                 }
            } else {
                System.out.println("Opcion invalida");
            }
        } while (continuar == 0);
        
    }
    
}
