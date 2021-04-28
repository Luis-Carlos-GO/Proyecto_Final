/*
Introducción a la programación
Universidad Fidélitas
Proyecto: Viajeros Aventure
Integrantes: Cristopher Navarro Guevara
             Yarón Hernández Chavarría
             Luis Carlos Gonzalez Ortega
 */
package viajeros_aventure;

import javax.swing.JOptionPane;
                            
public class paquetesViajes 
{
      private int opcion;
      public void viajes(){
    
    opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"-Viajeros Aventure-\n"
            + "- seleccione el paquete de viaje de su preferencia-\n"
            + "\n1. Paquete de viajes regular "
            + "\n2. Paquete de viajes Premium "
            + "\n3. Paquete de viajes Ejecutivo "
    
    ));
    
    switch (opcion){
    
        case 1: 
            
            JOptionPane.showMessageDialog(null,"\n- Viajeros Aventure -\n"
                    + "Usted ha elegido el paquete de viajes regular\n"
                    + "* Se le facturara segun el paquete escogido");
            
            break;
            
        case 2: 
             JOptionPane.showMessageDialog(null,"\n- Viajeros Aventure -\n"
                    + "Usted ha elegido el paquete de viajes premium\n"
                    + "* Se le facturara segun el paquete escogido");
            break;
    
        case 3: 
             JOptionPane.showMessageDialog(null,"\n- Viajeros Aventure -\n"
                    + "Usted ha elegido el paquete de viajes Ejecutivo\n"
                    + "* Se le facturara segun el paquete escogido");
            break;
    
    }
            
    
    
    
    
    }
}
