/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import test.*;
/**
 *
 * @author milla
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
      Empleado emple1 = new Empleado(3500, "Luis", 'm',32, "Puerta del angel 31") ; 
        System.out.println("emple1"+ emple1);
        System.out.println("Este es el contador de Empleado: "+ Empleado.getContador());
    }
    
}
