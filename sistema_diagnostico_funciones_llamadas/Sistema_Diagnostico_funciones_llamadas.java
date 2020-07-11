/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_diagnostico_funciones_llamadas;

/**
 *
 * @author User
 */
import java.util.Scanner;
import java.util.*;
public class Sistema_Diagnostico_funciones_llamadas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Identificar_falla_vehiculo();
        Identificar_falla_vehiculo();
        Reconocer_sistema_falla();
        Reconocer_componente();
        Generar_hipotesis();
        Satisfacer_hipotesis_preposicion();
        Informar_Diagnostico();
        
        System.out.println("Universidad de las Fuerzas Armadas ESPE");
        
        System.out.println("*  Sistema de Diagnostico del Automovil  ");
        
        System.out.println("*Identificar falla del vehiculo");
    }
    
  
    public static int Reconocer_sistema_falla(){
        
        int  RSF;
        Scanner ES = new Scanner(System.in);
        System.out.println("*Reconocer el sistema de la falla");
        System.out.println("  1.Sistema de Encendido  \n  2.Sistema de Combustible  "
                + "\n  3.Sistema de Frenos  \n  4.Sistema de trasmision");
        System.out.println(" Ingrese numero del sistema de falla");
        RSF = ES.nextInt();
        return 0;
    }
    
    public static int Reconocer_componente(){
        
        int componente;
        Scanner RC = new Scanner(System.in);
        System.out.println("\n*Reconocer componente defectuoso");
        System.out.println("  1.Motor de arranque  \n  2.Bateria  \n"
                + "  3.Bujias  \n  4.Control electronico");
        System.out.println(" Ingrese numero del componente defectuoso:");
        componente = RC.nextInt();
        return componente;           
    }
    
    public static char Generar_hipotesis(){
        
        int  Hipotesis;
        Scanner GH = new Scanner(System.in);
        System.out.println("\n*Selleciones el sintoma de la falla");
        System.out.println("  1.El motor de arranque no puede hacer que gire el "
                + "de combustion (Faros con luz muy debil)  \n  2.El motor de"
                + "arranque no puede hacer girar el motor de combustion (faros con buena luz)   "
                + "\n  3.El motor gira lentamente pero no arranca  \n  4.El motor gira "
                + "normalmente pero no arranca ");
        System.out.println(" Ingrese del sintoma del componenete:");
        Hipotesis = GH.nextInt();
        return 0;
    }
    
    public static String Satisfacer_hipotesis_preposicion(){
        
        String  satisfacer_preposicion;
        Scanner SP = new Scanner(System.in);
        System.out.println("\n*Seleccionar causa del sintoma de la falla");
        System.out.println("  1.Bateria con poco carga  \n  2.Bateria en mal estado   "
                + "\n  3.Conexiones flojas  \n  4.Motor de arranque defectuoso ");
        System.out.println(" Ingrese numero de la causa del sintoma");
        satisfacer_preposicion = SP.next();
        return null;
    }
    
    public static String Informar_Diagnostico(){
        
        
        System.out.println("\n*Diagnostico del Automovil ");
        System.out.println(" 1"
                + "1"
                + "Repare o Sustituya el motor de arranque");
    
        return null;
    }    
}
