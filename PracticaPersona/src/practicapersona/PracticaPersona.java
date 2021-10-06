/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapersona;

/**
 *
 * @author milla
 */
public class PracticaPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona p1 = new Persona ("Luis");
        System.out.println("Contenido de p1 : "+ p1);
       
        //puedo acceder a los atributos staticos gracias a la clase
        System.out.println(Persona.getContadorPersonas());
    }
    
}
