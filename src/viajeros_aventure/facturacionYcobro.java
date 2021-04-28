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

public class facturacionYcobro 
{
    
     private String tarjeta;
     private String nombre;
     private String nombre2;
     private String cedula2;
     private String telefono2;
     private String digitos;
     private int [] cobros = new int [2];
     
    int elegirM;
    
    public void menu(){
    cobros [0] = 2500;
    cobros [1] = 3600;
    
    int elegirM = Integer.parseInt(JOptionPane.showInputDialog("\n- Viajeros Aventure -\n"
            + " *Seleccione un método de pago\n"
            + "1) Tarjeta de Credito o Debito\n"
            + "2) Efectivo\n"));


    switch (elegirM){
    
        case 1: 
            JOptionPane.showMessageDialog(null,"El monto a cancelar es de: "+cobros[0]+" dólares");
            tarjeta = JOptionPane.showInputDialog("* Digite el número de su tarjeta");
            nombre = JOptionPane.showInputDialog("* Digite el nombre completo registrado en la tarjeta");
            digitos = JOptionPane.showInputDialog("* Digite los 4 digitos de seguridad de la tarjeta");
            JOptionPane.showMessageDialog(null,"\n- Viajeros Aventure -\n"
                    + "Transaccion exitosa\n"
                    + "Nombre: "+nombre+"\n"
                    + "Número de tarjeta: "+tarjeta+"\n"
                    + "Digitos de seguridad: ****\n"
                            + "Monto a pagar: "+cobros[0]+"\n"
                                    + "Monto cancelado: "+cobros[0]+"\n");
           
            break;
            
        case 2: 
            
            JOptionPane.showMessageDialog(null,"El monto a cancelar es de: \n"
                    +cobros[1]+" dólares");
            JOptionPane.showMessageDialog(null,"Favor confirmar sus datos a continuación:  ");
            nombre2 = JOptionPane.showInputDialog("Nombre: ");
            cedula2 = JOptionPane.showInputDialog("Cédula: ");
            telefono2 = JOptionPane.showInputDialog("Telefono: ");
            
            JOptionPane.showMessageDialog(null,"Se ha emitido una factura con los datos\n"
                    + "ingresados anteriormente, por favor dirigirse\n"
                    + "a la cede de su preferencia y cancelar el monto\n"
                    + "del viaje en pago efectivo\n"
                    + "                                                 \n"
                    + "* Click en aceptar para visualizar la factura emitida\n");
            
            JOptionPane.showMessageDialog(null,"- Viajeros Aventure -\n"
                    + "Nombre: "+nombre2+"\n"
                            + "Cédula: "+cedula2+"\n"
                                    + "Telefono: "+telefono2+"\n"
                                            + "Método de pago: Efectivo\n"
                                            + "Monto a cancelar: "+cobros[1]+"\n");
            break;
    
    
    }    
    }
    
    
}
