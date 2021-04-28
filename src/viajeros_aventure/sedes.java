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

public class sedes 
{
    
    public void sedes_menu() {
    int menu;
        do{
        menu = Integer.parseInt(JOptionPane.showInputDialog("Viajeros Aventure\n"
                + "Tu agencia de viajes de confianza\n"
                + "Ingrese a su pais para ver sus sedes\n"
                + "1) Costa Rica\n"
                + "2) México\n"
                + "3) Panamá\n"
                + "4) Colombia\n"
                + "0) Salir"));
        
        switch (menu)
        {
            case 1: 
               int menuCr;
                    do{
                    menuCr = Integer.parseInt(JOptionPane.showInputDialog("Viajeros Aventure\n"
                            + "Tu agencia de viajes de confianza\n"
                            + "Seleccione una de las sedes\n"
                            + "1) San José\n"
                            + "2) Cartago\n"
                            + "0) Salir"));

                    switch (menuCr)
                    {
                        case 1:                                                                         //Costa Rica sedes inicia
                            JOptionPane.showMessageDialog(null,"Viajeros Aventure\n"
                            
                            + "Sede de San José\n "
                            + "\n"        
                            + "Dirección\n"
                            + "    Calle 34, San Francisco, San José\n" 
                            + "\n"
                            + "Horario\n"
                            + "    lunes	  8:00–17:30\n"        
                            + "    martes	  8:00–17:30\n"
                            + "    miércoles      8:00–17:30\n" 
                            + "    jueves	  8:00–17:30\n" 
                            + "    viernes	  8:00–17:30\n" 
                            + "    sábado	  8:00–12:00\n" 
                            + "    domingo	  Cerrado\n"
                            + "\n"
                            + "Telefono:   +506 4200 3990");
                         break;

                        case 2:
                            JOptionPane.showMessageDialog(null,"Viajeros Aventure\n"
                            + "Tu agencia de viajes de confianza\n"
                            + "Sede de Cartago\n "
                            + "Dirección\n"
                            + "    Calle 14B, El Molino, Cartago Province, Cartago, 30102\n"        
                            + "Horario\n"
                            + "    lunes	  9:00–17:00\n"        
                            + "    martes	  9:00–17:00\n"
                            + "    miércoles      9:00–17:00\n" 
                            + "    jueves	  9:00–17:00\n" 
                            + "    viernes	  9:00–17:00\n" 
                            + "    sábado	  9:00–14:00\n" 
                            + "    domingo	  Cerrado\n"
                            + "Telefono:  +506 2224 2477"); 

                         break;
                    }
                                                                                                           //Costa Rica sedes termina
                    }while(menuCr!=0);
            break;
        
            case 2:
                 int menuMx;                                                                              //México sedes inicia
                    do{
                    menuMx = Integer.parseInt(JOptionPane.showInputDialog("Viajeros Aventure\n"
                            + "Tu agencia de viajes de confianza\n"
                            + "Seleccione una de las sedes\n "
                            + "1) Ciudad de México\n"
                            + "2) Monterrey\n"
                            + "0) Salir"));

                    //Costa Rica","Mexico","Panamá","Colombia
                    switch (menuMx)
                    {
                        case 1: 
                            JOptionPane.showMessageDialog(null,"Bienvenido a: Viajeros Aventure\n"
                            + "Tu agencia de viajes de confianza\n"
                            + "Sede de ciudad de México\n "
                            + "Dirección\n"
                            + "     Av. Río Churubusco 583, Sector Popular, Aculco, Iztapalapa, 09060 Ciudad de México, CDMX, México\n"        
                            + "Horario\n"
                            + "    lunes	  11:00–20:00\n"        
                            + "    martes	  11:00–20:00\n"
                            + "    miércoles      11:00–20:00\n" 
                            + "    jueves	  11:00–20:00\n" 
                            + "    viernes	  11:00–20:00\n" 
                            + "    sábado	  11:00–20:00\n" 
                            + "    domingo	  11:00–20:00\n"
                            + "Telefono:    +52 998 881 2460"); 

                         break;

                        case 2:
                            JOptionPane.showMessageDialog(null,"Viajeros Aventure\n"
                            + "Tu agencia de viajes de confianza\n"
                            + "Sede de Monterrey\n "
                            + "Dirección\n"
                            + "     Av Lázaro Cárdenas #4112-Local 7, Las Torres, 64930 Monterrey, N.L., México\n"        
                            + "Horario\n"
                            + "    lunes	  9:00–18:30\n"        
                            + "    martes	  9:00–18:30\n"
                            + "    miércoles      9:00–18:30\n" 
                            + "    jueves	  9:00–18:30\n" 
                            + "    viernes	  9:00–18:30\n" 
                            + "    sábado	  10:00–13:00\n" 
                            + "    domingo	  Cerrado\n"
                            + "Telefono:    +52 81 8365 8810");

                         break;
                    }                                                                                   //México sedes termina

                    }while(menuMx!=0);
                
            break;
                                                                                                        //Panama sedes inicia
            case 3:
                 int menuP;
                    do{
                    menuP = Integer.parseInt(JOptionPane.showInputDialog("Viajeros Aventure\n"
                           + "Tu agencia de viajes de confianza\n"
                            + "Seleccione una de las sedes\n "
                            + "1) Ciudad de Panama sede 1\n"
                            + "2) Ciudad de Panama sede 2\n"
                            + "0) Salir"));
                    
                    switch (menuP)
                    {
                        case 1: 
                            JOptionPane.showMessageDialog(null,"Viajeros Aventure\n"
                            + "Tu agencia de viajes de confianza\n"
                            + "Sede de ciudad de panama 1\n "
                            + "Dirección\n"
                            + "    Calle 50, Edificio Frontenac, Planta Baja, local 03, frente a Soho Mall, Panamá\n"        
                            + "Horario\n"
                            + "    lunes	  8:00–18:00\n"        
                            + "    martes	  8:00–18:00\n"
                            + "    miércoles      8:00–18:00\n" 
                            + "    jueves	  8:00–18:00\n" 
                            + "    viernes	  8:00–18:00\n" 
                            + "    sábado	  8:00–12:00\n" 
                            + "    domingo	  Cerrado\n"
                            + "Telefono:    +507 264-1140"); 

                         break;

                        case 2:
                            JOptionPane.showMessageDialog(null,"Viajeros Aventure\n"
                            + "Tu agencia de viajes de confianza\n"
                            + "Sede de ciudad de panama 1\n "
                            + "Dirección\n"
                            + "    Urb Marbella Calle 54 Dúplex 4b, Panamá\n"        
                            + "Horario\n"
                            + "    lunes	  8:00–18:00\n"        
                            + "    martes	  8:00–18:00\n"
                            + "    miércoles      8:00–18:00\n" 
                            + "    jueves	  8:00–18:00\n" 
                            + "    viernes	  8:00–18:00\n" 
                            + "    sábado	  8:00–12:30\n" 
                            + "    domingo	  Cerrado\n"
                            + "Telefono:    +507 301-3330"); 

                         break;
                    }
                    }while(menuP!=0);
            break;                                                                                                  //Panama sedes termina
                                                                                                                    
            case 4:                                                                                                 //Colombia sedes inicia
                 int menuCo;
                    do{
                    menuCo = Integer.parseInt(JOptionPane.showInputDialog(" Viajeros Aventure\n"
                            + "Tu agencia de viajes de confianza\n"
                            + "Seleccione una de las sedes\n "
                            + "1) Bogotá\n"
                            + "2) Cali\n"
                            + "0) Salir"));

                    //Costa Rica","Mexico","Panamá","Colombia
                    switch (menuCo)
                    {
                        case 1: 
                            JOptionPane.showMessageDialog(null,"Viajeros Aventure\n"
                            + "Tu agencia de viajes de confianza\n"
                            + "Sede de Bogota\n "
                            + "Dirección\n"
                            + "     Av 68 # 75A-50 Local 151 CC Metrópolis, Ak 68, Bogotá, Cundinamarca, Colombia\n"        
                            + "Horario\n"
                            + "    lunes          9:00–19:00\n"        
                            + "    martes	  9:00–19:00\n"
                            + "    miércoles      9:00–19:00\n" 
                            + "    jueves	  9:00–19:000\n" 
                            + "    viernes	  9:00–19:00\n" 
                            + "    sábado	  9:00–19:00\n" 
                            + "    domingo	  Cerrado\n"
                            + "Telefono:    +57 318 6514065");

                         break;

                        case 2:
                            JOptionPane.showMessageDialog(null,"Viajeros Aventure\n"
                            + "Tu agencia de viajes de confianza\n"
                            + "Sede de Cali\n "
                            + "Dirección\n"
                            + "      Av 4N 7N 46 Centro Comercial Local 127-128, Cali, Valle del Cauca, Colombia\n"        
                            + "Horario\n"
                            + "    lunes	  8:00–19:00\n"        
                            + "    martes	  8:00–19:00\n"
                            + "    miércoles      8:00–19:00\n" 
                            + "    jueves	  8:00–19:00\n" 
                            + "    viernes	  8:00–19:00\n" 
                            + "    sábado	  9:00–14:00\n" 
                            + "    domingo	  Cerrado\n"
                            + "Telefono:    +57 321 8019455");

                         break;
                    }                                                                                        //Colombia sedes termina

                    }while(menuCo!=0);
               
            break;
        }
        
        }while(menu!=0);
    }
    
    
    
    
}
