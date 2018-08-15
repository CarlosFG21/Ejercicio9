
package ejercicio9video14;

import java.util.*;

public class entrada {
    
    public void hacer(){
        
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        
        System.out.println("INTRODUCE TU NOMBRE: ");
        
        nombre = entrada.nextLine();
        
        System.out.println();
        
        int edad;
        
        System.out.println("INTRODUCE TU EDAD: ");
        
        edad= entrada.nextInt();
        
         System.out.println();
        
        System.out.println("HOLA "+ nombre + " EL ANO QUE VIENE TENDRAS " + (edad+1) + " ANOS" );
        
    }    
}
