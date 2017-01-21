/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import javax.swing.JOptionPane;

/**
 *
 * @author Wx8-PC
 */
public class Menu {
      private static Menu instancia;
    
    private Menu(){}
    
    public static Menu getInstancia(){
        if (instancia == null){
            instancia = new Menu();
        }
        return instancia;
        
    }
    
    public void Principal (){
        
        int opcion = 0;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("***********Menu.principal"
            +"\n\n1.HistorialClinico.\n2.Medico.\n3.Paciente"));
        switch(opcion){
            case 1:
                historialClinico();
                
                break;
            case 2:
                medico();
                break;
            case 3:
                paciente();
                
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Fin de la ejecucion");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida");
        }
        
        
        } while (opcion !=3);
    }

    private void historialClinico() {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo del paciente"));
        int fecha = Integer.parseInt(JOptionPane.showInputDialog("Ingrese fecha"));
        int idPaciente = Integer.parseInt(JOptionPane.showInputDialog("Ingrese idPaciente"));
        String observaciones = JOptionPane.showInputDialog("Ingrese Observaciones");
        
       
    }
    private void medico() {
        int identificacon = Integer.parseInt(JOptionPane.showInputDialog("Ingrese identificacion"));
        String nombre = JOptionPane.showInputDialog("Ingrese nombre");
        String apellidos = JOptionPane.showInputDialog("Ingrese apellidos");
        String especialidad = JOptionPane.showInputDialog("Ingrese especialidad");
    }

    private void paciente() {
       int identificacon = Integer.parseInt(JOptionPane.showInputDialog("Ingrese identificacion"));
       String nombre = JOptionPane.showInputDialog("Ingrese nombre");
       String apellidos = JOptionPane.showInputDialog("Ingrese apellidos");
       String genero = JOptionPane.showInputDialog("Ingrese genero");
      
    }
}
