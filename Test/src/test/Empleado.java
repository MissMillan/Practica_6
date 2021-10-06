/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author milla
 */
public class Empleado {
    
    //atributos
    private int idEmpleado;
    private int salario;
    private String nombre;
    private char sexo;
    private int edad;
    private String direccion;
    private static int contador;
    
    public Empleado(int salario, String nombre, char sexo, int edad, String direccion) {
        this.idEmpleado = ++Empleado.contador;//aqui se incrementa el contador al atributo del id. 
        this.salario = salario;
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.direccion = direccion;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Empleado.contador = contador;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", salario=").append(salario);
        sb.append(", nombre=").append(nombre);
        sb.append(", sexo=").append(sexo);
        sb.append(", edad=").append(edad);
        sb.append(", direccion=").append(direccion);
        sb.append('}');
        return sb.toString();
    }

    
}
