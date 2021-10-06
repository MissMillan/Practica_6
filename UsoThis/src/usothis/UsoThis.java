/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usothis;

/**
 *
 * @author milla
 */
public class UsoThis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona pers1 = new Persona("Yesenia", "Millan");
        //new Imprimir().imprimir(this);
    }
}  
    class Persona{
        String nombre;
        String apellidos;
        
        public Persona(String nombre, String apellidos){
        
        this.nombre= nombre;
        this.apellidos= apellidos;
            System.out.println("Acceso a persona usando this: ");
    }
    }


class Imprimir{
    
    public  void imprimir (Persona persona){
        
        System.out.println("imprimimos persona desde el metodo Imprimir =   " + persona);
        System.out.println("Imprimimos la persona desde this: "+ persona);
    }
}
    
    

