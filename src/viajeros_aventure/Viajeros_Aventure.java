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

public class Viajeros_Aventure {

    public static void main(String[] args) 
    {
     
        Viajeros_Aventure llamar = new Viajeros_Aventure();
       llamar.Menuprincipal();
        
        
    }
     public void Menuprincipal(){
    
     int menu;
        do{
        menu = Integer.parseInt(JOptionPane.showInputDialog("- Viajeros Aventure -\n"
                + "*** Bienvenido a tu agencia de viajes de confianza ***\n"
                + "                                                        \n"
                + "1) Registro\n"
                + "2) Paquetes de viajes\n"
                + "3) Reservaciones\n"
                + "4) Pago de factura\n"
                + "5) Sedes\n"
                + "6) Salir\n"));
        switch (menu)
        {
            case 1: 
                registroClientes llamado1 =new registroClientes();
                llamado1.getNombre();
                llamado1.getCedula();
                llamado1.getTelefono();
                llamado1.getcorreo();
                llamado1.Registro();
             break;
        
            case 2:
                
                paquetesViajes llamado3 = new paquetesViajes();
                llamado3.viajes();
                
                
             break;
             
            case 3:
                
                reservaciones llamado = new reservaciones();
                llamado.destino();
                
                break;
                
            case 4:
                 
                facturacionYcobro llamada5 = new facturacionYcobro();
               llamada5.menu();
                
               
                break;
            case 5:
                
               sedes C1 = new sedes();
                C1.sedes_menu();
                
                break;
        }
        
        }while(menu!=6);
    
    
    }
}
