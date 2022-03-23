
package Ejercicio2;

import javax.swing.JOptionPane;

public class principal {
    
    public static void main(String[] args) {
        String texto=JOptionPane.showInputDialog("Introduce un tamaño para el array");
        int tamanio=Integer.parseInt(texto);
  
        texto=JOptionPane.showInputDialog("Introduce la longitud del password");
        int longitud=Integer.parseInt(texto);
  
        //Creamos los arrays
        Password listaPassword[]=new Password[tamanio];
        boolean fortalezaPassword[]=new boolean[tamanio];
  
        //Creamos objetos, indicamos si es fuerte y mostramos la contraseña y su fortaleza.
        for(int i=0;i<listaPassword.length;i++){
            listaPassword[i]=new Password(longitud);
            fortalezaPassword[i]=listaPassword[i].esFuerte();
            System.out.println("Contraseña"+"\t"+"Fortaleza\n");
        
            System.out.println(listaPassword[i].getContraseña()+"\t\t "+fortalezaPassword[i]+"\n---------------------------\n");
              
        }
    }
    
}
